package dotmkey.sias.domain.model.access;

import dotmkey.sias.domain.model.ConcurrencySafeDomainObject;

public class PermissionCategory extends ConcurrencySafeDomainObject {

    private String code;

    private String name;

    private String description;

    public PermissionCategory(String code, String name, String description) {
        this.setCode(code);
        this.setName(name);
        this.setDescription(description);
    }

    public String code() {
        return this.code;
    }

    public String name() {
        return this.name;
    }

    public String description() {
        return this.description;
    }

    private void setCode(String code) {
        this.code = code;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setDescription(String description) {
        this.description = description;
    }

}
