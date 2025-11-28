package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Curso Java", "Descrição Curso", 8);
		System.out.println(curso);


		Mentoria mentoria = new Mentoria("Mentodria", "Descrição Mentoria Java", LocalDate.now()); /* Atribuindo a data atual*/
		System.out.println(mentoria);
		
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp", "Descrição Bootcamp Java Devoleper",null, null);
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev = new Dev("Ana", null, null);
		
		
		

		
	}

}
