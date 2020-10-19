package com.dotmkey.sias;

import com.dotmkey.sias.domain.model.access.PermissionCategory;
import com.dotmkey.sias.domain.model.access.PermissionCategoryCodeEnum;
import com.dotmkey.sias.domain.model.access.PermissionCategoryCollectionInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SiasApplicationTests {

    protected PermissionCategoryCollectionInterface permissionCategoryCollection;

    protected SessionFactory sessionFactory;

    @BeforeEach
    void setup() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

        try {
            this.sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    @Test
    void contextLoads() {
        int a = 1;
        System.out.print(a);
    }

//    @Test
//    void addPermissionCategory() {
//        this.permissionCategoryCollection.add(new PermissionCategory(PermissionCategoryCodeEnum.MAIN, "Test"));
//    }

    @Test
    void addPermissionCategoryManually() {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.save(new PermissionCategory(PermissionCategoryCodeEnum.MAIN, "Test"));
        session.getTransaction().commit();
        session.close();
    }

}
