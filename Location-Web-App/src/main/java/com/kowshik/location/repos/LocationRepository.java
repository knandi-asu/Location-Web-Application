package com.kowshik.location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.kowshik.location.entities.Location;


public interface LocationRepository extends JpaRepository<Location, Integer> {
	
	@Query("select l.type,count(l.type) from Location l group by l.type")
	public List<Object[]> findTypeAndTypeCount();
}
