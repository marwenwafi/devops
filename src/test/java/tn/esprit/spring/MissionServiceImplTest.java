/*package tn.esprit.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.text.ParseException;

import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.MissionExterne;
import tn.esprit.spring.services.IMissionService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MissionServiceImplTest {
	@Autowired
	IMissionService iMissionService;
	
	@Test
	public void testAddMissionExterne() throws ParseException{
		MissionExterne mission = new MissionExterne("Mission1","Lorem Ipsum","mission1@test.com",56);
		iMissionService.addMission(mission);
	}

	@Test
	public void testAddMission() throws ParseException{
		Mission mission = new Mission("Mission2","Lorem Ipsum dolore");
		iMissionService.addMission(mission);
<<<<<<< HEAD
		assertThat(mission.getName()).isEqualTo("Mission2");
	} 
	
		@Test
=======
	} 
	
	@Test
>>>>>>> parent of 9880eb7 (Merge branch 'main' of https://github.com/marwenwafi/devops)
	public void testDisplayMissions() throws ParseException{
		iMissionService.getAllMissions();
	}
	
<<<<<<< HEAD
	
	@Test
	public void testDeleteMission()  throws Exception {
		iMissionService.deleteMission(2);;
		Optional<Mission> deletedMission = missionRepository.findById(2);
		assertThat(deletedMission).isEmpty();
		}
	
	
	@Test
	public void testUpdateMission() throws ParseException {
		iMissionService.updateMissionName(3,"MissionUpdated");
		assertThat(missionRepository.findById(3).get().getName()).isEqualTo("MissionUpdated");
	}
=======
>>>>>>> parent of 9880eb7 (Merge branch 'main' of https://github.com/marwenwafi/devops)


}*/
