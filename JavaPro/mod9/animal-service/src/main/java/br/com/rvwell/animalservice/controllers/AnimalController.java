package br.com.rvwell.animalservice.controllers;

import br.com.rvwell.animalservice.entidades.Animal;
import br.com.rvwell.animalservice.repositorios.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository){
        this.repository = repository;
    }
    @GetMapping
    private List<Animal> findAll(){
        return repository.findAll();
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted(){
        return repository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted(){
        return repository.findAdopted();
    }

    @GetMapping("/animals-employ-date")
    private List<Animal> findAnimalsInDate(@RequestParam Date startDate, @RequestParam Date endDate, @RequestParam String nome) {
        return repository.findAnimalsPerEmployInDateRange(startDate, endDate, nome);
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal){
        return repository.save(animal);
    }
}
