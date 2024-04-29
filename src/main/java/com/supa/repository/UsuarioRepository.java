package com.supa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supa.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}