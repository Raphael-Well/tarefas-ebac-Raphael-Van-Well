package br.com.rvwell.projetofinal.meme.repositories;

import br.com.rvwell.projetofinal.meme.entities.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoriaMeme extends JpaRepository<CategoriaMeme, Long> {
}
