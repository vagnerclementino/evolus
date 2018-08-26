package br.com.evolus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.evolus.entity.Paciente;
import br.com.evolus.service.PacienteService;

@RestController
@RequestMapping("/pacientes/")
public class PacienteController {
	
	
	@Autowired
	private PacienteService pacienteService;
	 
	@GetMapping
    public List<Paciente> listaLivros(Model model) {
          List<Paciente> listaPacientes = this.pacienteService.getAllPacientes();
          return listaPacientes;
    }
	
	@GetMapping("{IdPaciente}")
	public Optional<Paciente> obtemPaciente(@PathVariable Long IdPaciente){
		
		return this.pacienteService.getPaciente(IdPaciente);
		
	}

}
