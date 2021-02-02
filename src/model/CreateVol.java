package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Vol;


public class CreateVol {
	   public static void main( String[ ] args ) {
		   
		      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ApiVol" );
		      
		      EntityManager entitymanager = emfactory.createEntityManager( );
		      entitymanager.getTransaction( ).begin( );

		      Vol v= new Vol( ); 
		      v.setNumVol("1");
		      v.setHeureDepart(1230);
		      v.setVilleArrivee("Strasbourg");
		      v.setVilleDepart("Mulhouse");
		      
		      entitymanager.persist( v );
		      entitymanager.getTransaction( ).commit( );

		      entitymanager.close( );
		      emfactory.close( );
		   }
}
