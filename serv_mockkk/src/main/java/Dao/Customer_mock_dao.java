package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dto.Customer_dto;
import controller.Customer_mock;

public class Customer_mock_dao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();	
	EntityTransaction et = em.getTransaction();
	
	
	public void save(Customer_mock customer_mock) {
		et.begin();
		em.persist(customer_mock);
		et.commit();
	}
	
	public List<Customer_mock> check_email(String c_email) {
		List<Customer_mock> list1 = em.createQuery("select x from Customer_mock x where c_email=?1")
				.setParameter(1, c_email).getResultList();
		return list1;
	}

	
	
	public List<Customer_mock> check_mob(Long mob) {
		List<Customer_mock> list2 = em.createQuery("select x from Customer_mock x where mob=?1").setParameter(1, mob)
				.getResultList();
		return list2;
	}

//	public Customer_mock login(int customerid) {
//		Customer_mock customer = et.find(Customer_mock.class, customerid);
//		return customer;
//	}

	}

