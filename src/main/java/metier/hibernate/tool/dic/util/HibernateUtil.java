package metier.hibernate.tool.dic.util;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {

	//private static final SessionFactory sessionFactory;
    private static final SessionFactory sessionFactory = buildSessionFactory();

    //static {
    private static SessionFactory buildSessionFactory() {
        try {
            // Créer une SessionFactory à partir de hibernate.cfg.xml
            //sessionFactory = new Configuration().configure().buildSessionFactory();
        	return new Configuration()
        		.configure() //configures setting from hibernate.cfg.xml
        		.buildSessionFactory();
        } catch (Throwable ex) {
            // Gestion exception
            System.err.println("Echec création SessionFactory" + ex);
            throw new ExceptionInInitializerError(ex);
        }

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
