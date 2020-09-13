package com.dotmkey.sias.resource.port.console;

import com.dotmkey.sias.domain.model.access.PermissionCategoryCollectionInterface;
import com.dotmkey.sias.domain.model.access.PermissionCollectionInterface;
import com.dotmkey.sias.domain.model.access.RoleCollectionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class AclCommands {

    @Autowired
    private final PermissionCategoryCollectionInterface permissionCategoryCollection;

    @Autowired
    private final PermissionCollectionInterface permissionCollection;

    @Autowired
    private final RoleCollectionInterface roleCollectionInterface;

    @ShellMethod("Fill ACL from config.")
    public void fill() {

    }

}
