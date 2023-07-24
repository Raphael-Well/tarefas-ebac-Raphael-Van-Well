package br.com.rvwell.projetofinal.usuario.repositories;

import br.com.rvwell.projetofinal.usuario.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryUsuario extends CrudRepository<Usuario, Long> {
}
