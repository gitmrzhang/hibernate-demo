package com.zhang.hibernate.demo;

import com.github.fluent.hibernate.cfg.scanner.EntityScanner;
import com.zhang.hibernate.demo.entity.UserDO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import java.util.Date;
import java.util.List;

/**
 * @author zgj
 * @version 2018-08-29 9:56
 * @since 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        // 创建工厂
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();

        List<Class<?>> entityEntity = EntityScanner.scanPackages("com.zhang.hibernate.demo.entity").result();
        MetadataSources metadata = new MetadataSources(serviceRegistry);
        for (Class<?> clazz : entityEntity) {
            metadata.addAnnotatedClass(clazz);
        }
        SessionFactory sessionFactory = metadata.getMetadataBuilder().build().getSessionFactoryBuilder().build();
//        UserDO userDO = new UserDO();
//        userDO.setCreateTime(new Date());
//        userDO.setName("Mr zhang3");
//        userDO.setSex((byte) 1);
//        Session session = sessionFactory.getCurrentSession();
//        Transaction tx = session.beginTransaction();
//        session.save(userDO);
//        tx.commit();
//        session.close();
        sessionFactory.close();
    }
}
