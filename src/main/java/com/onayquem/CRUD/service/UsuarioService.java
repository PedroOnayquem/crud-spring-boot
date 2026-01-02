package com.onayquem.CRUD.service;

import com.onayquem.CRUD.model.Usuario;
import com.onayquem.CRUD.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
	
	private final UsuarioRepository repository;
	
	public UsuarioService(UsuarioRepository repository) {
		this.repository = repository;
	}
	public Usuario salvar (Usuario usuario) {
		return repository.save(usuario);
	}
	public List<Usuario> listar(){
		return repository.findAll();
	}
	public Usuario buscarPorid(Long id) {
		return repository.findById(id).orElse(null);
	}
	public Usuario atualizar(Long id, Usuario usuario) {
		usuario.setId(id);
		return repository.save(usuario);
	}
	public void deletar(Long id) {
		repository.deleteById(id);
	}
}
