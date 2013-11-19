package tk.wangjinzone.businessledger.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDao {
	
	private SessionFactory sessionFactory;

	@Autowired
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public Object getObjectById(Object object,Integer id){
		return this.getSession().get(object.getClass(), id);
	}
}
