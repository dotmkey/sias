package com.dotmkey.sias.domain.model.access;

import com.dotmkey.sias.domain.model.AbstractConcurrencySafeDomainObject;

import java.util.Set;

public class Role extends AbstractConcurrencySafeDomainObject {

    private RoleCodeEnum code;

    private String name;

    private String description;

    private Set<PermissionCodeEnum> permissionCodes;

    public Role(String code, String name) {
        this();
        this.setCode(code);
        this.setName(name);
    }

    public Role(String code, String name, String description) {
        this(code, name);

        this.setDescription(description);
    }

    public Role(String code, String name, String description, Set<PermissionCodeEnum> permissionCodes) {
        this(code, name, description);

        this.setPermissionCodes(permissionCodes);
    }

    public Role(String code, String name, Set<PermissionCodeEnum> permissionCodes) {
        this(code, name);

        this.setPermissionCodes(permissionCodes);
    }

    public RoleCodeEnum code() {
        return this.code;
    }

    public String name() {
        return this.name;
    }

    public String description() {
        return this.description;
    }

    public Set<PermissionCodeEnum> permissionCodes() {
        return this.permissionCodes;
    }

    private void setCode(String code) {
        this.code = RoleCodeEnum.valueOf(code);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setPermissionCodes(Set<PermissionCodeEnum> permissionCodes) {
        this.permissionCodes = permissionCodes;
    }

    protected Role() {
        super();
    }
}