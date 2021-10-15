package tn.esprit.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.EmployeServiceImpl;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTest {
	@Autowired
	IEntrepriseService IEntreprise;
	private static final Logger L = LogManager.getLogger(EntrepriseServiceImplTest.class);
	Entreprise entreprise = new Entreprise("Entreprise", "raisonSocial" );
	Entreprise entreprise2 = new Entreprise("entreprise2", "raisonSocial2" );

	@Test
	public void testAjouterEntreprise()
	{
		try {
			int id;
			id=IEntreprise.ajouterEntreprise(entreprise);
			L.info("Ajouter avec succes"+id);
		}catch (Exception e) { L.error("Erreur dans testAjouterEntreprise() : " + e); }
		
	}
	@Test
	public void testgetEntrepriseById()
	{
		try{
			int id;
		id=IEntreprise.ajouterEntreprise(entreprise2);
		Entreprise e=IEntreprise.getEntrepriseById(id);
		L.info("entreprise:"+ e);
		}catch (Exception e) { L.error("Erreur dans testgetEntrepriseById() : " + e); }
	}
	@Test
	public void testdeleteEntrepriseById() {
		int id;
		Entreprise entrepriseSupprimer = new Entreprise("supptal", "raisonSocial2" );
		id=IEntreprise.ajouterEntreprise(entrepriseSupprimer);
		IEntreprise.deleteEntrepriseById(id);
	}


}
