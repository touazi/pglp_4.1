package uvsq_master1_gl.exo_4;

import java.time.LocalDate;

import uvsq_master1_gl.exo_4.PERSONNE.PERSONNEBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     PERSONNE p1,p2;
    p1 = new PERSONNEBuilder("TOUAZI", "LYLIA")
			.dateNaissance(LocalDate.parse("1997-04-22"))
			.fonction(fonction.directeur)
			.addNumeroTelephone(new NumeroTelephone( Type.fix_pro, "0667721012"))
			.build();	
    p2 = new PERSONNEBuilder("hamouche", "koussaila")
			.dateNaissance(LocalDate.parse("1997-04-22"))
			.fonction(fonction.directeur)
			.addNumeroTelephone(new NumeroTelephone( Type.fix_perso, "0104050506"))
			.build();	
    GroupePersonnel g = new GroupePersonnel();
    g.AjouterPersonnel(p1);
 
    
g.print();    
System.out.println(g.getlistepersonnel().size());
g.SuprimerPersonnel(p1);
g.SuprimerPersonnel(p2);
g.SuprimerPersonnel(p2);
g.print();

    
}}
