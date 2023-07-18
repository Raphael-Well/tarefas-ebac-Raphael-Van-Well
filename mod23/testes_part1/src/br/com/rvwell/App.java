package br.com.rvwell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome e sexo das pessoas separados por virgula:");
        String input = sc.next();

        List<String> nomes = new ArrayList<>(Arrays.asList(input.split(",")));

        for (String nome : nomes){
            List<String> classsificacao = new ArrayList<>(Arrays.asList(nome.split("-")));
            pessoas.add(new Pessoa(classsificacao.get(0), classsificacao.get(1)));
        }

        pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("f"))
                .forEach(pessoa -> System.out.println(pessoa.getNome()));
    }

}
