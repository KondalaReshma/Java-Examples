package com.springorm.dao;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springorm.models.*;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void save() {
		Session session = sessionFactory.getCurrentSession();
		User user = new User(101,"Sam","Jacob","sam@studytonight.com");
		session.save(user);
	}
}