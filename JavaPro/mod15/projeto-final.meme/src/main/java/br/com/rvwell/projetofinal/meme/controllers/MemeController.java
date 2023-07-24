package br.com.rvwell.projetofinal.meme.controllers;

import br.com.rvwell.projetofinal.meme.entities.CategoriaMeme;
import br.com.rvwell.projetofinal.meme.entities.Meme;
import br.com.rvwell.projetofinal.meme.services.ServiceMeme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class MemeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MemeController.class);
    @Autowired
    private ServiceMeme serviceMeme;

    @GetMapping("/categorias")
    public List<CategoriaMeme> buscaCategorias() {
        LOGGER.info("Busca Efetuada Categorias");
        return serviceMeme.listaTodasCategorias();
    }

    @PostMapping("/categorias")
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return serviceMeme.novaCategoriaMeme(categoriaMeme);
    }

    @GetMapping("/memes")
    public List<Meme> buscaMemes() {
        LOGGER.info("Busca Efetuada memes");
        return serviceMeme.listaTodosMemes();
    }

    @PostMapping("/memes")
    public Meme novoMeme(@RequestBody Meme meme) {
        return serviceMeme.novoMeme(meme);
    }
}
