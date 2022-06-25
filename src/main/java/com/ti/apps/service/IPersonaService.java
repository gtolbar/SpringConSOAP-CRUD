package com.ti.apps.service;

import java.util.List;

import com.ti.apps.entity.Persona;

public interface IPersonaService {
	
	public Persona ListarPorId(Integer id);
	public List<Persona> listarTodos();

}
