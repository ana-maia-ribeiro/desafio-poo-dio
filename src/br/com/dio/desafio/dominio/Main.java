package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Curso Java", "Descrição Curso", 8);
		System.out.println(curso);
		
		Mentoria mentoria = new Mentoria("Mentodria", "Descrição Mentoria Java", LocalDate.now()); /* Atribuindo a data atual*/
		System.out.println(mentoria);

	}

}
