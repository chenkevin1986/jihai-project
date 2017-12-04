package com.jihai.mengmian.filter;

import com.alibaba.fastjson.JSON;
import com.jihai.mengmian.basebean.MenuTypeEnum;
import com.jihai.mengmian.entity.UserTypeEnmu;
import com.jihai.mengmian.filter.annotation.PermissionSupport;
import com.jihai.mengmian.session.SessionMenu;
import com.jihai.mengmian.session.SessionUser;
import com.jihai.mengmian.utils.AccesstokenUtil;
import com.jihai.mengmian.utils.IdealTokenUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kevinchen on 2017/3/26.
 * 公共的拦截器业务逻辑的处理实现类
 */
public abstract class CommonPermissionSecurityUserServiceImpl implements PermissionSecurityUserService {

    @Autowired
    protected PermissionSupport permissionSupport;

    protected static List<String> noAuthUri = new ArrayList<String>();

    @Value("${server.contextPath}")
    protected String contextPath;
    
    protected abstract String getJwtSecret();

    @Autowired
    protected RedisTemplate<String,String> redisTemplate;

    protected abstract void addNoAuthUri();

    @Override
    public String getJwtId() {
        if (isAccessTokenInvaild())
            return null;
        String auth = getAuth();
        if (StringUtils.isBlank(auth)){
            return null;
        }
        return IdealTokenUtils.getJwtId(getJwtSecret(), auth);
    }

    public String getAuth(){
        HttpServletRequest request = getHttpRequest();
        if (request==null)return null;
        return request.getHeader("Authorization");
    }

    @Override
    public boolean notFilterNoAuthUri(String uri) {
        addNoAuthUri();
        uri = uri.replaceFirst(contextPath,"");
        return  noAuthUri.contains(uri) || uri.contains("swagger")
                || uri.contains("/v2/api-docs") || uri.contains("druid");
    }

    @Override
    public String getSubjectFromAccessToken() {
        if (isAccessTokenInvaild())return null;
        String auth = getAuth();
        if (StringUtils.isBlank(auth)){
            return null;
        }
        return IdealTokenUtils.getSubject(getJwtSecret(), auth);
    }

    @Override
    public boolean alowAccessRequestUri(HttpServletRequest request) {
        String uid = getSubjectFromAccessToken();
        if (StringUtils.isBlank(uid))return false;
        String userJsonstr = redisTemplate.opsForValue().get(uid);
        SessionUser sessionUser = JSON.parseObject(userJsonstr, SessionUser.class);
        if (sessionUser.getUserTypeEnmu().equals(UserTypeEnmu.INTERNAL)){
            return true;
        }
//        uri = uri.replaceFirst(contextPath,"");
        return permissionSupport.authentication(request, sessionUser);
//        return sessionUser == null ? false : sessionUser.isAccessPermission(uri);
    }


    @Override
    public boolean accessRequest(HttpServletRequest request) {
        return permissionSupport.hadlleFilter(request);
    }

    /**
     * 是否超时
     * @return
     */
    @Override
    public boolean isTimeout() {
//        SessionUser sessionUser = getUserEntity();
//        long now = System.currentTimeMillis();
//        //用户登录系统后 1个小时未操作，再次操作后会自动登出
//        if (sessionUser.isExpire(now)){
//            return true;
//        }
//        sessionUser.setActiveTime(now);
//        redisTemplate.opsForValue().set(sessionUser.getUid(),JSON.toJSONString(sessionUser));
        return false;
    }

    @Override
    public String addAlowAccessRequestUri(String[] uris) {
        return null;
    }

    @Override
    public boolean isAccessTokenInvaild() {
        HttpServletRequest request = getHttpRequest();
        String auth = request.getHeader("Authorization");
        return  AccesstokenUtil.isAccessTokenInvaild(auth, getJwtSecret());
    }

    @Override
    public SessionUser getUserEntity() {
        String uid = getSubjectFromAccessToken();
        if (StringUtils.isBlank(uid)){
            return null;
        }
        String userJsonstr = redisTemplate.opsForValue().get(uid);
        if (StringUtils.isBlank(userJsonstr)){
            return null;
        }
        return JSON.parseObject(userJsonstr, SessionUser.class);
    }


    /**
     * 缓存所有权限api接口
     * 并面向系统开通所有查询数据的权限。
     */
    @Override
    public boolean allowQueryRequestUri(String uri){
        HttpServletRequest request = getHttpRequest();
        if ("GET".compareToIgnoreCase(request.getMethod())==0){
            return true;
        }
        uri = uri.replaceFirst(contextPath,"");
        String all_menus = redisTemplate.opsForValue().get("ALL_MENUS");
        if (StringUtils.isBlank(all_menus))return false;
        List<SessionMenu> allSessionMenus = JSON.parseArray(all_menus, SessionMenu.class);
        for(Iterator<SessionMenu> iterator = allSessionMenus.iterator(); iterator.hasNext();){
            SessionMenu sessionMenu = iterator.next();
            if (sessionMenu.getLableKey().compareTo(uri) == 0
                    && sessionMenu.getMenuType().equals(MenuTypeEnum.BUTTON)) {
                return true;
            }
        }
        return false;
    }

    public HttpServletRequest getHttpRequest(){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return attributes.getRequest();
    }

    @Override
    public String getIp(){
        return SystemInfoUtils.getIpAddr(getHttpRequest());
    }

    @Override
    public String getMac(){
        return SystemInfoUtils.getMacAddress(getIp());
    }

    public SuitTypeEnum getSuitType() {
        return SuitTypeEnum.SERVER;
    }

}
