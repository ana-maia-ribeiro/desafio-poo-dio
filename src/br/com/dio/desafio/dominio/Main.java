package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição curso JS");
		curso2.setCargaHoraria(4);
		
		Conteudo conteudo = new Curso();
		Conteudo conteudo1 = new Mentoria();
		
		List<String> palavras = new ArrayList<>();
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria JAVA");
		mentoria.setDate(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp JAva Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev = new Dev();
		dev.setNome("Ana Beatriz");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Contéudos Inscritos" + dev.getConteudosInscritos());
		dev.progredir();
		System.out.println("----------------");
		System.out.println("Contéudos Inscritos" + dev.getConteudosInscritos());
		System.out.println("Contéudos Concluídos" + dev.getConteudosConcluidos());
		System.out.println("XP:" + dev.calcularTotalXP());
		
		System.out.println("-------------------------------------------------------------------------");
		
		Dev dev1 = new Dev();
		dev.setNome("João");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Contéudos Inscritos" + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("----------------");
		System.out.println("Contéudos Inscritos" + dev1.getConteudosInscritos());
		System.out.println("Contéudos Concluídos" + dev1.getConteudosConcluidos());
		System.out.println("XP:" + dev1.calcularTotalXP());
		
		
		/*System.out.print(curso1);
		System.out.print(curso2);
		System.out.print(mentoria);*/
		
		

		
	}

}
