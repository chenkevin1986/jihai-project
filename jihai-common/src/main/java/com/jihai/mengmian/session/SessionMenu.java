package com.jihai.mengmian.session;

import com.jihai.mengmian.basebean.MenuTypeEnum;

import java.io.Serializable;

/**
 * Created by kevinchen on 2017/3/5.
 */
public class SessionMenu implements Serializable {

    private String menuId;

    private String menuName;

    private String parentId;

    private MenuTypeEnum menuType;

    private String lableKey;

    private Integer sortNum = 0;

    public SessionMenu() {
    }

    public SessionMenu(String menuId, String menuName, String parentId, MenuTypeEnum menuType, String lableKey, Integer sortNum) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.parentId = parentId;
        this.menuType = menuType;
        this.lableKey = lableKey;
        this.sortNum = sortNum;
    }


    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public MenuTypeEnum getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuTypeEnum menuType) {
        this.menuType = menuType;
    }

    public String getLableKey() {
        return lableKey;
    }

    public void setLableKey(String lableKey) {
        this.lableKey = lableKey;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
