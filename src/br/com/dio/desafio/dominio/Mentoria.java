package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

	private String titulo;
	private String descrico;
	private LocalDate date;
	
	public Mentoria(String titulo, String descrico, LocalDate date) {
		super();
		this.titulo = titulo;
		this.descrico = descrico;
		this.date = date;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescrico() {
		return descrico;
	}
	public void setDescrico(String descrico) {
		this.descrico = descrico;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descrico=" + descrico + ", date=" + date + "]";
	}
	
	
}
