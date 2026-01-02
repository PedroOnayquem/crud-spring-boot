package com.onayquem.CRUD.controller;

import com.onayquem.CRUD.model.Usuario;
import com.onayquem.CRUD.service.UsuarioService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	private final UsuarioService service;
	
	public UsuarioController(UsuarioService service) {
		this.service = service;
	}	
	@PostMapping
	public Usuario criar (@RequestBody @Valid Usuario usuario) {
		return service.salvar(usuario);
	}	
	@GetMapping
	public List<Usuario> listar(){
		return service.listar();
	}
	@GetMapping("/{id}")
	public Usuario buscar(@PathVariable Long id) {
		return service.buscarPorid(id);
	}
	@PutMapping("/{id}")
	public Usuario atualizar(@PathVariable Long id, @RequestBody @Valid Usuario usuario) {
		return service.atualizar(id, usuario);
	}
	@DeleteMapping("{id}")
	public void deletar(@PathVariable Long id) {
		service.deletar(id);
	}
}
