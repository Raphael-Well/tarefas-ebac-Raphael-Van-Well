package br.com.rvwell.animalservice.repositorios;

import br.com.rvwell.animalservice.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada DESC")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataEntrada BETWEEN :startDate AND :endDate AND a.nomeRecebedor = :nome")
    List<Animal> findAnimalsPerEmployInDateRange(Date startDate, Date endDate, String nome);
}
