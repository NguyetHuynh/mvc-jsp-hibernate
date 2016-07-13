package spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StockDao {
	SessionFactory template;  
	Session session;
	public StockDao() {
		template = HibernateUtil.getSessionFactory();
		session = template.openSession();
	}
	
	public void saveStock(Stock s)
	{
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
	}
	
	public void closeSession()
	{
		this.session.close();
	}
	
	
}
