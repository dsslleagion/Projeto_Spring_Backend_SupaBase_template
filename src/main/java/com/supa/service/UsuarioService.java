package com.supa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supa.entity.Usuario;
import com.supa.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> buscarTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarUsuarioPorId(long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletarUsuario(long id) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            usuario.desativar(); // Desativa o usuário
            usuarioRepository.save(usuario); // Salva as alterações
        } else {
            // Lógica para tratamento se o usuário não for encontrado
        }
    }

   
    public void excluirUsuario(long id) {
        usuarioRepository.deleteById(id);
    }
    
}
