package com.onayquem.CRUD.repository;

import com.onayquem.CRUD.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}