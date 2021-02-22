package com.dam.DAMHibernate_Consultas;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Principal {

	public static void main(String[] args) {
		
		StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
		
		Session session = sf.openSession();
		
		
		session.getTransaction().begin();
		
			//Consulta que devuelva todos los datos de los actores
		    Query actores = session.createQuery("SELECT a FROM Actor a");
		    List<Actor> listaActores = actores.getResultList();
		    for (Actor a: listaActores) {
		    	System.out.println("Código: " + a.getActor_id() + "; Nombre: " + a.getNombre());
		    }
		  /*  
		  //Consulta que devuelva todos nombres de los actores
		    Query actores2 = session.createQuery("SELECT a.nombre FROM Actor a");
		    List<Object[]> listaActores2 = (List<Object[]>)actores2.getResultList();
		    for (Object[] a: listaActores2) {
		    	System.out.println("Nombre: " + (String)a[0]);
		    }
		    */
		    
		    Query query = session.createQuery("SELECT a.nombre FROM Actor a");	
	     	List<Object[]> lista = (List<Object[]>) query.getResultList();
	     	for (Object[] objeto: lista) {
	     		System.out.print((String)objeto[0] + ", ");
	            System.out.println((String)objeto[1]);
	       }
		
		session.getTransaction().commit();
		
		session.close();
		sf.close();

	}

}
