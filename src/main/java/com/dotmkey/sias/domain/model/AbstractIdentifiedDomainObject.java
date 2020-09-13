package com.dotmkey.sias.domain.model;

public abstract class AbstractIdentifiedDomainObject {

    private static final long serialVersionUID = 1L;

    private long id;

    protected AbstractIdentifiedDomainObject() {
        super();

        this.setId(-1);
    }

    protected long id() {
        return this.id;
    }

    private void setId(long id) {
        this.id = id;
    }

}
