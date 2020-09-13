package dotmkey.sias.domain.model;

public class ConcurrencySafeDomainObject extends IdentifiedDomainObject {

    private static final long serialVersionUID = 1L;

    private int concurrencyVersion;

    protected ConcurrencySafeDomainObject() {
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
