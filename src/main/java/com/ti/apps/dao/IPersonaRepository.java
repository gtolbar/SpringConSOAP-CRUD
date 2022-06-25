package com.ti.apps.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ti.apps.entity.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Integer>{
	
	@Query("select c from Persona c where c.id=:id")
	public Persona getCollaborator(@Param("id") Integer id);
	
	@Query("select c from Persona c")
	public List<Persona> getListAllCollaborator();

}
