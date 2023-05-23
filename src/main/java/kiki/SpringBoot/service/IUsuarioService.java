package kiki.SpringBoot.service;

import java.util.List;

import kiki.SpringBoot.entity.Usuario;



public interface IUsuarioService {

    public List<Usuario> buscarTodos();

    public Usuario buscarPorId(Long id);
    
    public Usuario novoUsuario(Usuario usuario);

   
}
