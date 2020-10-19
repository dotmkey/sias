package com.dotmkey.sias.domain.model.access;

import com.dotmkey.sias.domain.model.AbstractConcurrencySafeDomainObject;

public class PermissionCategory extends AbstractConcurrencySafeDomainObject {

    private PermissionCategoryCodeEnum code;

    private String name;

    private String description;

    public PermissionCategory(PermissionCategoryCodeEnum code, String name) {
        this();
        this.setCode(code);
        this.setName(name);
    }

    public PermissionCategory(PermissionCategoryCodeEnum code, String name, String description) {
        this(code, name);

        this.setDescription(description);
    }

    public PermissionCategoryCodeEnum code() {
        return this.code;
    }

    public String name() {
        return this.name;
    }

    public String description() {
        return this.description;
    }

    private void setCode(PermissionCategoryCodeEnum code) {
        this.code = code;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    protected PermissionCategory() {
        super();
    }
}
