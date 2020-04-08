package uvsq_master1_gl.exo_4;
import  uvsq_master1_gl.exo_4.PERSONNE.PERSONNEBuilder;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


	
	public class PersonnelTest {
		
		private PERSONNE personne;
		
		@Before()
		public void setUp() {
			personne = new PERSONNEBuilder("TOUAZI", "LYLIA")
					.dateNaissance(LocalDate.parse("1997-04-22"))
					.fonction(fonction.directeur)
					.addNumeroTelephone(new NumeroTelephone( Type.fix_perso, "0104050506"))
					.addNumeroTelephone(new NumeroTelephone( Type.portable, "0667721010"))
					.addNumeroTelephone(new NumeroTelephone( Type.fix_pro, "0667721012"))
					.build();	
			
			
		}
		
		
		@Test()
		public void testGetNom() {
			assertEquals(personne.getNom(), "TOUAZI");
		}
		
		@Test()
		public void testprenom() { assertEquals(personne.getPrenom(), "LYLIA");}
		
		@Test()
		public void testfonction() { assertEquals(personne.getFonction(), fonction.directeur);}
		@Test()
		public void testfonction1() {
			NumeroTelephone t=new NumeroTelephone (Type.fix_perso,"0667721012");
			assertEquals(t.getTelephone(),"0667721012");}
		public void testfonction2() {
			NumeroTelephone t=new NumeroTelephone (Type.fix_perso,"0667721012");
			assertEquals(t.getType(),Type.fix_perso);}
		@Test()
		public void testdatedenaissane() {
			assertEquals(personne.getDateNaissance(),LocalDate.parse("1997-04-22"));
		}
		
		 @After
		  public void nettoyer() throws Exception {
		    personne = null;
		  }
		
	}