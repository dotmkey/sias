package com.dotmkey.sias.domain.model.access;

public interface RoleCollectionInterface {

    void save(Role role);

    Role ofCode(RoleCodeEnum code);

    void removeAll();

}
