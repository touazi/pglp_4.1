package uvsq_master1_gl.exo_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public final class PERSONNE {
	private final String nom ;
	private final String prenom ;
	private final fonction fonction ;
	private final LocalDate dateNaissance;
	private final List<NumeroTelephone> numerosTelephone;
public static class PersonnelBuilder {
		
		
		private final String nom;
		private final String prenom;
		//private final uvsq_master1_gl.exo_4.fonction fonction;
		
		// Optionnel
		private LocalDate dateNaissance = null;
		private List<NumeroTelephone> numerosTelephone = new ArrayList<NumeroTelephone>();
		private uvsq_master1_gl.exo_4.fonction fonction;
		
		public PersonnelBuilder(String nom, String prenom) {
			this.nom = nom;
			this.prenom = prenom;
		}
	}


	public String getNom() {
		return nom;
	}

	
	public String getPrenom() {
		return prenom;
	}


	public fonction getFonction() {
		return fonction;
	}


	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	
	public List<NumeroTelephone> getNumerosTelephone() {
		return numerosTelephone;
	}
	
	/*@Override
	public boolean isGroupe() {
		return false;
	}
	*/
	
}
