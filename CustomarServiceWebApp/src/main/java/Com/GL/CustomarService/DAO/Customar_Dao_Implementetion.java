package Com.GL.CustomarService.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Com.GL.CustomarService.Model.Customar;

@Repository
public class Customar_Dao_Implementetion implements CustomarDao {

	@Autowired
	SessionFactory sessionFactory;
	Session session;

	@Override
	@Transactional
	public void saveCustomar(Customar customar) {

		session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customar);
	}

	@Override
	@Transactional
	public void DeleteCustomar(int id) {
		session = sessionFactory.getCurrentSession();
		Customar customar = session.get(Customar.class, id);
		session.delete(customar);
	}

	@Override
	@Transactional
	public List<Customar> findAll() {
		session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Customar.class);
		return criteria.list();
	}

	@Override
	@Transactional
	public Customar findbyid(int id) {
		session = sessionFactory.getCurrentSession();
		Customar customar = session.get(Customar.class, id);
		return customar;
	}

}
