package com.MeuCarroMinhaVida.AppFinanciamento.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.MeuCarroMinhaVida.AppFinanciamento.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Optional<Usuario> findBySenha(String senha);
}
