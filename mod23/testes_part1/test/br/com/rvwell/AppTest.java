package br.com.rvwell;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testTodasAsPessoasSaoDoSexoFeminino() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "f"));
        pessoas.add(new Pessoa("João", "m"));
        pessoas.add(new Pessoa("Maria", "f"));
        pessoas.add(new Pessoa("José", "m"));

        List<Pessoa> apenasFeminino = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("f"))
                .collect(Collectors.toList());

        assertEquals(2, apenasFeminino.size());
    }

}
