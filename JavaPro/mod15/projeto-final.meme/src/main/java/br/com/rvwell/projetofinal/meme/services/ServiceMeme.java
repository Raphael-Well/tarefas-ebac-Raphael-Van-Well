package br.com.rvwell.projetofinal.meme.services;

import br.com.rvwell.projetofinal.meme.entities.CategoriaMeme;
import br.com.rvwell.projetofinal.meme.entities.Meme;
import br.com.rvwell.projetofinal.meme.repositories.RepositorioCategoriaMeme;
import br.com.rvwell.projetofinal.meme.repositories.RepositorioMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceMeme {
    @Autowired
    private RepositorioMeme repositorioMeme;
    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    public Meme novoMeme(Meme meme) {
        return repositorioMeme.save(meme);
    }

    public List<Meme> listaTodosMemes() {
        return repositorioMeme.findAll();
    }

    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        return repositorioCategoriaMeme.save(categoriaMeme);
    }

    public List<CategoriaMeme> listaTodasCategorias() {
        return repositorioCategoriaMeme.findAll();
    }
}
