package uvsq_master1_gl.exo_4;

import java.util.ArrayList;
/**.
 * class GroupePersonnel.
 *
 * @author lylia touazi
 */
public class GroupePersonnel implements
ComportementPersonnel {
	/**constatnte mille.*/
	static final int MILLE = 1;

	/**l'id du groupe.*/
	private int idGroupe;
	/**listepersonnel.*/
	private ArrayList<ComportementPersonnel> listepersonnel;
	/**Constructeur GroupePersonnel.
	 * */
	public GroupePersonnel() {
		listepersonnel = new ArrayList<ComportementPersonnel>();
		idGroupe = 1 + (int) (Math.random() * ((MILLE - 1) + 1));
	}
	/**Constructeur GroupePersonnel.
	 * @param listepersonnell la liste des personne
	 * */
	public GroupePersonnel(
			final ArrayList<ComportementPersonnel>
	listepersonnell) {
		this.listepersonnel = listepersonnell;
	}
	/**methode AjouterPersonnel.
	 * @param p la personne a ajouter.*/
	public final void ajouterPersonnel(
			final ComportementPersonnel p) {
		this.listepersonnel.add(p);
	}
	/**methode SuprimerPersonnel.
	 * @param p la personne a suprimer.*/
	public final void suprimerPersonnel(
			final ComportementPersonnel p) {
		if (this.listepersonnel.contains(p)) {
			this.listepersonnel.remove(p);
		}
	}
	/**
	 * La methode getlistepersonnel.
	 *
	 * @return la liste des personne.
	 */
	public final ArrayList<ComportementPersonnel> getlistepersonnel() {
		return this.listepersonnel;
	}
	/**methode getId.
	 * @return id groupe.*/
	public final String getId() {
		return idGroupe + " ";
	}
	/** la methode print. */
	public final void print() {
		// TODO Auto-generated method stub
		for (ComportementPersonnel p : listepersonnel) {
			p.print();
		}
	}
}
