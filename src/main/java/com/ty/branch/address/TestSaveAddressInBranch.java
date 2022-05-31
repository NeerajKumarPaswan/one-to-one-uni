package com.ty.branch.address;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveAddressInBranch {
public static void main(String[] args) {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	Branch branch=new Branch();
	branch.setName("TestYantra");
	branch.setState("Karnataka");
	branch.setCountry("Bharat");
	branch.setPhone(894654313l);
	
	Address address=new Address();
	address.setStreet("Bull temple Road");
	address.setLandmark("Main cirlce");
	address.setDistrict("Bendakaluru");
	address.setState("Karnataka");
	address.setPincode("560076");
	
	branch.setAddress(address);
	
	
	entityTransaction.begin();
	entityManager.persist(branch);
	entityManager.persist(address);
	entityTransaction.commit();
}
}
