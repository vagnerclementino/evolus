package br.com.evolus.service;

import java.util.List;
import java.util.Optional;

import br.com.evolus.entity.Paciente;


public interface PacienteService {
	
  public List<Paciente> getAllPacientes();
  
  public Optional<Paciente> getPaciente(Long IdPaciente);
}
