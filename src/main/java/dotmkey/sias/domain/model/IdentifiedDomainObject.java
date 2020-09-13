package dotmkey.sias.domain.model;

public class IdentifiedDomainObject {

    private static final long serialVersionUID = 1L;

    private long id;

    protected IdentifiedDomainObject() {
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
