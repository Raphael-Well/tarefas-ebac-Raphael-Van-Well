package br.com.rvwell.projetofinal.usuario.services;

import br.com.rvwell.projetofinal.usuario.entities.Usuario;
import br.com.rvwell.projetofinal.usuario.repositories.RepositoryUsuario;
import org.springframework.stereotype.Component;

@Component
public class ServiceUsuario {

    private RepositoryUsuario repositorioUsuario;

    public ServiceUsuario(RepositoryUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Usuario novoUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    public Iterable<Usuario> listaTodosUsuarios() {
        return repositorioUsuario.findAll();
    }
}
