package com.dotmkey.sias.domain.model.access;

public interface PermissionCollectionInterface {

    void save(Permission permission);

    Permission ofCode(PermissionCodeEnum code);

    void removeAll();

}
