package uvsq_master1_gl.exo_4;

import java.util.ArrayList;

public class GroupePersonnel implements ComportementPersonnel {
	private final ArrayList<ComportementPersonnel> listepersonnel ;
	public GroupePersonnel() {
		listepersonnel = new ArrayList<ComportementPersonnel>();
	}
	
	
	public GroupePersonnel(ArrayList<ComportementPersonnel> listepersonnel){
		this.listepersonnel=listepersonnel;}

	public void AjouterPersonnel(ComportementPersonnel p) {
		this.listepersonnel.add(p);}
	
	

	public void SuprimerPersonnel(ComportementPersonnel p) {
		this.listepersonnel.remove(p);}

	
	public ArrayList<ComportementPersonnel> getlistepersonnel() {
		return this.listepersonnel;}
	
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
			for (ComportementPersonnel per :listepersonnel) {
				per.print();  //Delegation
				}
			}





  

}
