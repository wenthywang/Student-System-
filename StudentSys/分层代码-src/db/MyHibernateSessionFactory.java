package db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class MyHibernateSessionFactory {
	//会话工厂属性
	private static SessionFactory sessionFactory;
	
	private MyHibernateSessionFactory(){
		
	}
	//公有的静态方法，获得会话工厂
	public static SessionFactory getSessionFactory(){
		if(sessionFactory==null){
		 Configuration config=new Configuration().configure();
		 ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		   sessionFactory=config.buildSessionFactory(serviceRegistry);
		   return sessionFactory;
		}
		else{
			return sessionFactory;
		}
	}

}
