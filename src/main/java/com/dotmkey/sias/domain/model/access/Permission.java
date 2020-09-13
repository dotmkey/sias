package com.dotmkey.sias.domain.model.access;

import com.dotmkey.sias.domain.model.IdentifiedDomainObject;

public class Permission extends IdentifiedDomainObject {

    private PermissionCategoryCodeEnum categoryCode;

    private PermissionCodeEnum code;

    private String name;

    private String description;

    public Permission(PermissionCategoryCodeEnum categoryCode, PermissionCodeEnum code, String name) {
        this.setCategoryCode(categoryCode);
        this.setCode(code);
        this.setName(name);
    }

    public Permission(PermissionCategoryCodeEnum categoryCode, PermissionCodeEnum code, String name, String description) {
        this(categoryCode, code, name);

        this.setDescription(description);
    }

    public PermissionCategoryCodeEnum categoryCode() {
        return this.categoryCode;
    }

    public PermissionCodeEnum code() {
        return this.code;
    }

    public String name() {
        return this.name;
    }

    public String description() {
        return this.description;
    }

    private void setCategoryCode(PermissionCategoryCodeEnum categoryCode) {
        this.categoryCode = categoryCode;
    }

    private void setCode(PermissionCodeEnum code) {
        this.code = code;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setDescription(String description) {
        this.description = description;
    }

}
