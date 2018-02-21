package ru.vampa.zkTable.db;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author Vladimir Belyashov
 * @since 19.02.2018
 */
public class HibernateListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        DBService.INSTANCE.getSessionFactory();
    }

    public void contextDestroyed(ServletContextEvent event) {
        DBService.INSTANCE.getSessionFactory().close();
    }
}
