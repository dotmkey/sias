package com.dotmkey.sias.domain.model;

public abstract class AbstractConcurrencySafeDomainObject extends AbstractIdentifiedDomainObject {

    private static final long serialVersionUID = 1L;

    private int concurrencyVersion;

    protected AbstractConcurrencySafeDomainObject() {
        super();
    }

    public int concurrencyVersion() {
        return this.concurrencyVersion;
    }

    public void setConcurrencyVersion(int concurrencyVersion) {
        this.failWhenConcurrencyViolation(concurrencyVersion);
        this.concurrencyVersion = concurrencyVersion;
    }

    public void failWhenConcurrencyViolation(int concurrencyVersion) {
        if (concurrencyVersion != this.concurrencyVersion()) {
            throw new IllegalStateException("Concurrency Violation: Stale data detected. Entity was already modified.");
        }
    }

}
