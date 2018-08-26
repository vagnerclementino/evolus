package br.com.evolus;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.evolus.entity.Convenio;
import br.com.evolus.entity.Paciente;
import br.com.evolus.repository.ConvenioRepository;
import br.com.evolus.repository.PacienteRepository;

@SpringBootApplication
public class EvolusApplication implements CommandLineRunner{
	
	@Autowired
	private ConvenioRepository convenioRepository;
	
	@Autowired
	private PacienteRepository pacienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(EvolusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Convenio convenvio1 = new Convenio(null, "11111111111", "UNIMED");
		Convenio convenio2 = new Convenio(null,"000000000000" , "PROMED");
		
		Paciente paciente1 = new Paciente(null, "Vagner Clementino dos Santos", convenvio1);
		Paciente paciente2 = new Paciente(null, "Andreza Vieira Lelis da Silva", convenio2);
		
		convenioRepository.saveAll(Arrays.asList(convenvio1,convenio2));
		
		pacienteRepository.saveAll(Arrays.asList(paciente1,paciente2));
				
	}
}
