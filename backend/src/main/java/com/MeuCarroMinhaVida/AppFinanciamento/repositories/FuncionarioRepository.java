package com.MeuCarroMinhaVida.AppFinanciamento.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.MeuCarroMinhaVida.AppFinanciamento.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	Optional<Funcionario> findBySenha(String senha);
}
