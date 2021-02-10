package com.practice.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public List<Employee> findAll() {

		// define field for entity manager

		private EntityManager entityManager;

		// setup constructor injection
		@Autowired
		public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
			this.entityManager = theEntityManager;
		}

		return null;
	}

}
