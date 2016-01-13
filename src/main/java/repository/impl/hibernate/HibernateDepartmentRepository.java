package repository.impl.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.DepartmentRepository;
import models.Department;
import org.hibernate.Query;
import org.hibernate.Session;
import utils.exceptions.DataBaseException;

import java.util.List;

@Repository
public class HibernateDepartmentRepository implements DepartmentRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public List<Department> getAll() throws DataBaseException {

        Session session = sessionFactory.getCurrentSession();
        Query q = session.createQuery("from Department");

        return (List<Department>) q.list();
    }


    public void createDepartment(String title) throws DataBaseException {

        Department dep = new Department();
        dep.setTitle(title);
        Session session = sessionFactory.getCurrentSession();
        session.save(dep);
    }

    public void deleteDepartment(int id) throws DataBaseException {

        Session session = sessionFactory.getCurrentSession();
        Department dep = (Department) session.load(Department.class, id);
        session.delete(dep);

    }


    public Department getDepartmentById(int id) throws DataBaseException {

            Session  session = sessionFactory.getCurrentSession();
            String hql = "from Department where department_id=:id";
            Query q = session.createQuery(hql);
            q.setParameter("id", id);

        return (Department) q.uniqueResult();
    }


    public void editDepartment(String test, int id) throws DataBaseException {

            Session session = sessionFactory.getCurrentSession();
            String hql = "UPDATE Department SET title =:test WHERE department_id =:id";
            Query q = session.createQuery(hql);
            q.setParameter("test", test);
            q.setParameter("id", id);
            q.executeUpdate();

    }
}
