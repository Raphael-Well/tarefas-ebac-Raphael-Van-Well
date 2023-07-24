package br.com.rvwell.projetofinal.usuario.controllers;

import br.com.rvwell.projetofinal.usuario.entities.Usuario;
import br.com.rvwell.projetofinal.usuario.services.ServiceUsuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")
public class ControllerUsuario {
    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerUsuario.class);
    private ServiceUsuario serviceUsuario;

    public ControllerUsuario(ServiceUsuario serviceUsuario) {
        this.serviceUsuario = serviceUsuario;
    }

    @GetMapping
    public Iterable<Usuario> buscaUsuarios() {
        LOGGER.info("Busca Efetuada");
        return serviceUsuario.listaTodosUsuarios();
    }

    @PostMapping
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        LOGGER.info("Usuario Criado {}", usuario);
        return serviceUsuario.novoUsuario(usuario);
    }

}
