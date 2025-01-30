package com.MeuCarroMinhaVida.AppFinanciamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.MeuCarroMinhaVida.AppFinanciamento.models.Usuario;
import com.MeuCarroMinhaVida.AppFinanciamento.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private BCryptPasswordEncoder passwordEnconder = new BCryptPasswordEncoder();
	
	public Usuario salvarUsuario(Usuario usuario) {
		usuario.setSenha(passwordEnconder.encode(usuario.getSenha()));
		return usuarioRepository.save(usuario);
	}
}
