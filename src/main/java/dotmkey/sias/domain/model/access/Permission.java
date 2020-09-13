package dotmkey.sias.domain.model.access;

import dotmkey.sias.domain.model.IdentifiedDomainObject;

import java.util.Collection;

public class Permission extends IdentifiedDomainObject {

    private String categoryCode;

    private String code;

    private String name;

    private String description;

    public Permission(String categoryCode, String code, String name, String description) {
        this.setCategoryCode(categoryCode);
        this.setCode(code);
        this.setName(name);
        this.setDescription(description);
    }

    public String categoryCode() {
        return this.categoryCode;
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

    private void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
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
