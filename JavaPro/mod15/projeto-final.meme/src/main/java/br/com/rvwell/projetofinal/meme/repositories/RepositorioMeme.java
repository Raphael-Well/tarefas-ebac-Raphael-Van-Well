package br.com.rvwell.projetofinal.meme.repositories;


import br.com.rvwell.projetofinal.meme.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMeme extends JpaRepository<Meme, Long> {
}
