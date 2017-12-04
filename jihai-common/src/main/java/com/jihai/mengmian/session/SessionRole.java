package com.jihai.mengmian.session;

import com.alibaba.fastjson.annotation.JSONField;
import com.jihai.mengmian.basebean.MenuTypeEnum;
import com.jihai.mengmian.entity.RoleTag;
import com.jihai.mengmian.utils.MatcherUtils;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kevinchen on 2017/3/5.
 */
public class SessionRole implements Serializable {

    private String roleId;

    private String roleName;

    private String roleDescription;

    @JSONField(name = "roleTag")
    private RoleTag roleTag;

    private Long createdAt;

    private List<SessionMenu> menus;

    public SessionRole() {
    }

    public SessionRole(String roleId, String roleName, String roleDescription, RoleTag roleTag, List<SessionMenu> menus, Long createdAt) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDescription = roleDescription;
        this.roleTag = roleTag;
        this.menus = menus;
        this.createdAt = createdAt;
    }

    public RoleTag getRoleTag() {
        return roleTag;
    }

    public void setRoleTag(RoleTag roleTag) {
        this.roleTag = roleTag;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public List<SessionMenu> getMenus() {
        return menus;
    }

    public void setMenus(List<SessionMenu> menus) {
        this.menus = menus;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *  修改权限控制规则 所有标识有data类型的权限 （如get请求）都不限制。
     * @param menuLabelKey
     * @return
     */
    public boolean isExistMenulabelkey(String menuLabelKey){
        for (Iterator<SessionMenu> iterator = menus.iterator(); iterator.hasNext(); ) {
            SessionMenu menu =  iterator.next();
            if (menu.getMenuType().equals(MenuTypeEnum.BUTTON)||menu.getLableKey().equals(menuLabelKey)
                    || MatcherUtils.matcherPathvariable(menu.getLableKey(), menuLabelKey)){ // 非restful风格校验，没有占位符, restful风格校验，需要转换占位符
                return true;
            }
        }
        return false;
    }
}
