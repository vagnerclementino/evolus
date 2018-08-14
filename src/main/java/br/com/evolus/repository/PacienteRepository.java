package br.com.evolus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.evolus.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>  {

}
