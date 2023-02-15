package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Patient;

public class PatientDao

{

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Patient patient) {
		entityTransaction.begin();
		entityManager.persist(patient);
		entityTransaction.commit();
	}

	public void update(int pid, long pph_no) {
		Patient patient = entityManager.find(Patient.class, pid);

		if (patient != null) {
			entityTransaction.begin();
			patient.setPph_no(pph_no);
			entityManager.merge(patient);
			entityTransaction.commit();
		}

		else

		{
			System.out.println("data not found");
		}
	}

	public void remove(int pid) {
		Patient patient3 = entityManager.find(Patient.class, pid);
		if (patient3 != null) {
			entityTransaction.begin();
			entityManager.remove(patient3);
			entityTransaction.commit();
		} else {
			System.out.println("data not found");
		}
	}

}