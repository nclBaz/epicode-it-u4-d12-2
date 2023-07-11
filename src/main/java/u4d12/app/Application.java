package u4d12.app;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import u4d12.entities.Student;
import u4d12.entities.StudentsDAO;
import u4d12.util.JpaUtil;

public class Application {
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();


	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();
		System.out.println("CIAO");

		Student ajeje = new Student("Ajeje", "Brazorf");
		StudentsDAO sd = new StudentsDAO(em);

		// *************** SAVE ***************

//		sd.save(ajeje);

		// *************** FIND BY ID **********

		Student aldoFromDB = sd.findById(UUID.fromString("ffccbd82-cedb-48ac-b724-3653c7d67ea7"));
		System.out.println(aldoFromDB);

		// ***************** DELETE **************

		sd.findByIdAndDelete(UUID.fromString("ffccbd82-cedb-48ac-b724-3653c7d67ea7"));

		// ****************** REFRESH *************
		sd.refresh(UUID.fromString("4d2c44ea-29a3-4489-8189-bcda5f6a6866"));

		// Ricordiamoci di chiudere entity manager & factory
		em.close();
		emf.close();

	}
}
