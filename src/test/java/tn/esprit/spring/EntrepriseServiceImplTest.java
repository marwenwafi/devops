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
	Entreprise entreprise = new Entreprise("Talan4", "raisonSocial" );
	Entreprise entrepriseid = new Entreprise("testgetid", "raisonSocial2" );

	@Test
	@Order(1)
	public void testAjouterEntreprise()
	{
		try {
			IEntreprise.ajouterEntreprise(entreprise);
		L.info("Ajouter avec succes",entreprise.getId());
		//IEntreprise.deleteEntrepriseById(entreprise.getId());
		}catch (Exception e) { L.error("Erreur dans testAjouterEntreprise() : " + e); }
		
	}
	@Test
	public void testgetEntrepriseById()
	{
		try{
		IEntreprise.ajouterEntreprise(entrepriseid);
		IEntreprise.getEntrepriseById(entrepriseid.getId());
		}catch (Exception e) { L.error("Erreur dans testgetEntrepriseById() : " + e); }
	}
	@Test
	@Order(2)
	public void testdeleteEntrepriseById() {
		IEntreprise.deleteEntrepriseById(entreprise.getId());
	}


}
