package tn.esprit.spring.services;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import tn.esprit.spring.EntrepriseServiceImplTest;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.MissionRepository;

@Service
public class MissionServiceImpl implements IMissionService {
	
//	private static final Logger logger = Logger.getLogger(TimesheetServiceImpl.class);
	private static final Logger logger = LogManager.getLogger(TimesheetServiceImpl.class);

	@Autowired
	MissionRepository missionRepository;
	@Autowired
	DepartementRepository departementRepository;

	@Override
	public List<Mission> getAllMissions() {
		List<Mission> missions= (List<Mission>) missionRepository.findAll();
		logger.info("Mission's List :" + missions);
		return missions;
	}

	@Override
	public void addMission(Mission mission) {
		missionRepository.save(mission);
		logger.info("success");
		
	}

	@Override
	public int nbrMissions() {
		int nb = (int) missionRepository.numberMissions();
		logger.info("Nbr of missions: " +nb);
		return nb;
	}

	@Override
	public List<Mission> getMissionsByDepartement(int departementId) {
		Departement dep = departementRepository.findById(departementId).get();
		List<Mission> missions = new ArrayList<>();
		for(Mission mis : missionRepository.findAll()){
			if (mis.getDepartement() == dep){
				missions.add(mis);			
			}
		}	
		logger.info("Mission's by departments :" + missions);
		
		return missions;
		
	}

	
	
}
