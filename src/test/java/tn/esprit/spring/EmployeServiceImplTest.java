	/*
package tn.esprit.spring;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.EmployeServiceImpl;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;
import tn.esprit.spring.services.ITimesheetService;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {
	
	@Autowired
	EmployeServiceImpl employeService;
	@Autowired
	ITimesheetService iTimesheetService;
	@Autowired
	IEmployeService iEmployeService;
	@Autowired
	IEntrepriseService iEntrepriseService;
	
	SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");


	@Test
	public void testAjouterEmploye() throws ParseException {
		Employe employe = new Employe( "Ghada", "Khedri", "ghada.khedri1@esprit.tn", true, Role.INGENIEUR);
		iEmployeService.ajouterEmploye(employe);
	
	}

	@Test
	public void testMettreAjourEmailByEmployeIdJPQL() throws ParseException {
		employeService.mettreAjourEmailByEmployeIdJPQL("ghadakhedrib@gmail.com",2);
	}
	
	@Test
	public void testAffectEmployDepartment() throws ParseException {
		employeService.affecterEmployeADepartement(2,1);
	}
	@Test
	public void testDesaffecterEmployeDuDepartement() throws ParseException {
		employeService.desaffecterEmployeDuDepartement(2,1);
	}  

	@Test
	public void testAjouterContrat() throws ParseException {
		Date date = dateFormatter.parse("10/10/2021");
		Contrat contrat = new Contrat(date,"stage pfe ",400);
		employeService.ajouterContrat(contrat);
	}
	
	@Test
	public void testAffecterContratAEmploye() throws ParseException {
		employeService.affecterContratAEmploye(1,2);
	}

	@Test
	public void testGetEmployePrenomById() throws ParseException {
		employeService.getEmployePrenomById(2);
	}  
	

	@Test
	public void testDeleteEmployeById() throws ParseException {
		employeService.deleteEmployeById(1);
	} 
	@Test
	public void testDeleteContratById() throws ParseException {
		employeService.deleteContratById(1);
	} 
	@Test
	public void testGetNombreEmployeJPQL() throws ParseException {
		employeService.getNombreEmployeJPQL();
	}

	@Test
	public void testGetEmployesByEntreprise() throws ParseException {
		Entreprise entreprise = new Entreprise("Trame","photographe");
		iEntrepriseService.ajouterEntreprise(entreprise);
		employeService.getAllEmployeByEntreprise(entreprise);
	}
	
	@Test
	public void testDeleteAllContratJPQL() throws ParseException {
		employeService.deleteAllContratJPQL();
	}
	@Test
	public void testGetSalaireMoyenByDepartementId() throws ParseException {
		employeService.getSalaireMoyenByDepartementId(1);
	}
	@Test
	public void testGetAllEmployeNamesJPQL() throws ParseException {
		employeService.getAllEmployeNamesJPQL();
	}
	
}
*/
