package br.edu.ifpb.esp.poo.academico;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		Aluno a = new Aluno();
		a.setMatricula(1234l);
		a.setNome("Aluno 1"+r.nextInt());
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("academico");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(a);
		Professor p = new Professor();
		p.setNome("P1"+r.nextInt());
		em.persist(p);
		em.getTransaction().commit();
	}

}
