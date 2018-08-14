package br.com.evolus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.evolus.entity.Paciente;
import br.com.evolus.repository.PacienteRepository;

@Service
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;

	@Override
	public List<Paciente> getAllPacientes() {

		return this.pacienteRepository.findAll();
	}

	@Override
	public Optional<Paciente> getPaciente(Long IdPaciente) {
		return this.pacienteRepository.findById(IdPaciente);
	}

}
