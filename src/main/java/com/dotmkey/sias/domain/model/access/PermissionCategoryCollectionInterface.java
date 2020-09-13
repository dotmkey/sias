package com.dotmkey.sias.domain.model.access;

public interface PermissionCategoryCollectionInterface {

    void add(PermissionCategory permissionCategory);

    PermissionCategory ofCode(PermissionCategoryCodeEnum code);

    void removeAll();

}
