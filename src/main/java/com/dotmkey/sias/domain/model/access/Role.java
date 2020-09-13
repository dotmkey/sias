package com.dotmkey.sias.domain.model.access;

import com.dotmkey.sias.domain.model.ConcurrencySafeDomainObject;

import java.util.Collection;

public class Role extends ConcurrencySafeDomainObject {

    private RoleCodeEnum code;

    private String name;

    private String description;

    private Collection<String> permissionCodes;

    public Role(String code, String name) {
        this.setCode(code);
        this.setName(name);
    }

    public Role(String code, String name, String description) {
        this(code, name);

        this.setDescription(description);
    }

    public Role(String code, String name, String description, Collection<String> permissionCodes) {
        this(code, name, description);

        this.setPermissionCodes(permissionCodes);
    }

    public Role(String code, String name, Collection<String> permissionCodes) {
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

    public Collection<String> permissionCodes() {
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

    private void setPermissionCodes(Collection<String> permissionCodes) {
        this.permissionCodes = permissionCodes;
    }

}