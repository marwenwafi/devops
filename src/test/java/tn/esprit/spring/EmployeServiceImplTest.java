package tn.esprit.spring;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {
	
	@Autowired
	IEmployeService emps;
	
	@Test
	public void testAjouterEmploye()
	{
		Employe employe = new Employe("flen", "ben flen", "flen@gmail.com", true, Role.ADMINISTRATEUR);
		emps.ajouterEmploye(employe);
	}

}
