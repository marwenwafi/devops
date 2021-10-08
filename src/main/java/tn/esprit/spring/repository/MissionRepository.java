package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;


import tn.esprit.spring.entities.Mission;


public interface MissionRepository extends CrudRepository<Mission, Integer> {
	@Query(value="select count(*) FROM mission",nativeQuery=true)
	public float numberMissions();	

}
