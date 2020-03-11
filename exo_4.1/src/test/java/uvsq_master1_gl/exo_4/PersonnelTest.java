package uvsq_master1_gl.exo_4;
import  uvsq_master1_gl.exo_4.PERSONNE.PersonnelBuilder;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.util.ArrayList;
	import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


	
	public class PersonnelTest {

		private PERSONNE personne;
		
		@Before()
		public void setUp() {
			personne = new PersonnelBuilder("TOUAZI", "LYLIA")
					.dateNaissance(LocalDate.parse("1997-04-22"))
					.fonction(fonction.directeur)
					.addNumeroTelephone(new NumeroTelephone( Type.fix_perso, "0104050506"))
					.addNumeroTelephone(new NumeroTelephone( Type.portable, "0667721010"))
					.addNumeroTelephone(new NumeroTelephone( Type.fix_pro, "0667721012"))
					.build();	
			
		}
		
		
		 @After
		  public void nettoyer() throws Exception {
		    personne = null;
		  }
		
	}