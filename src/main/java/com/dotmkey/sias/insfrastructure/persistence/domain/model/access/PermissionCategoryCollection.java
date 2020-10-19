package com.dotmkey.sias.insfrastructure.persistence.domain.model.access;

import com.dotmkey.sias.domain.model.access.PermissionCategory;
import com.dotmkey.sias.domain.model.access.PermissionCategoryCodeEnum;
import com.dotmkey.sias.domain.model.access.PermissionCategoryCollectionInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class PermissionCategoryCollection implements PermissionCategoryCollectionInterface {

    protected SessionFactory sessionFactory;

    protected static final ThreadLocal<Session> sessionHolder = new ThreadLocal<>();

    protected Session session() {
        Session session = PermissionCategoryCollection.sessionHolder.get();
        if (session != null) {
            return session;
        }

        if (this.sessionFactory == null) {
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

            try {
                this.sessionFactory = new MetadataSources(registry)
                    .buildMetadata()
                    .buildSessionFactory()
                ;
            } catch (Exception e) {
                StandardServiceRegistryBuilder.destroy(registry);
            }
        }

        PermissionCategoryCollection.sessionHolder.set(session = this.sessionFactory.openSession());

        return session;
    }

    public void add(PermissionCategory permissionCategory) {
        this.session().save(permissionCategory);
    }

    public PermissionCategory ofCode(PermissionCategoryCodeEnum code) {
        return this
            .session()
            .createQuery("select pc from PermissionCategory pc where pc.code = :code", PermissionCategory.class)
            .getSingleResult()
        ;
    }

    public void removeAll() {
    }
}
