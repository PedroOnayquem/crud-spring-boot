package com.onayquem.CRUD.controller;

import com.onayquem.CRUD.model.Usuario;
import com.onayquem.CRUD.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	private final UsuarioRepository repository;
	
	public UsuarioController(UsuarioRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping(consumes = "application/json")
	public Usuario criar (@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}
	
	@GetMapping
	public List<Usuario> listar(){
		return repository.findAll();
	}
	@GetMapping("/{id}")
	public Usuario buscar(@PathVariable Long id) {
		return repository.findById(id).orElse(null);
	}
	@PutMapping("/{id}")
	public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
		usuario.setId(id);
		return repository.save(usuario);
	}
	@DeleteMapping("{id}")
	public void deletar(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
