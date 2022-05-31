package com.ty.company.gst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Company company=new Company();
		company.setName("INFOSYS");
		company.setPhone(7799885545l);
		company.setWeb("www.infosysindia.com");
		
		GST gst=new GST();
		gst.setGstNumber("INFOSYSHTR558897531");
		gst.setState("KARNATAKA");
		gst.setCountry("INDIA");
		
		gst.setCompany(company);
		
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}
