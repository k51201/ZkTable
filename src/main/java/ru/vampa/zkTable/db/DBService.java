package ru.vampa.zkTable.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.vampa.zkTable.db.entity.Office;
import ru.vampa.zkTable.db.entity.Procedure;
import ru.vampa.zkTable.db.entity.Reception;
import ru.vampa.zkTable.db.entity.Specialist;

/**
 * @author Vladimir Belyashov
 * @since 20.02.2018
 */
public class DBService {
    public static DBService INSTANCE = new DBService();

    private SessionFactory sessionFactory;

    public ProcedureDao procedureDao() {
        return new ProcedureDao(sessionFactory.openSession());
    }

    public SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration().configure()
                    .addAnnotatedClass(Procedure.class)
                    .addAnnotatedClass(Specialist.class)
                    .addAnnotatedClass(Reception.class)
                    .addAnnotatedClass(Office.class)
                    .buildSessionFactory();
        }
        return sessionFactory;
    }
}
