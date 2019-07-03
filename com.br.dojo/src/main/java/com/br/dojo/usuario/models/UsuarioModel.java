package com.br.dojo.usuario.models;

public class UsuarioModel {

	private int id;
	private String foto;
	private String nome;
	private int idade;
	private String estadoCivil;
	private String comentario;
	public UsuarioModel() {
		
	}
	public UsuarioModel(int id, String foto, String nome, int idade, String estadoCivil, String comentario) {
		
		this.id = id;
		this.foto = foto;
		this.nome = nome;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
		this.comentario = comentario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("foto: " + this.getFoto());
		modelo.append("\n");
		modelo.append("nome: " + this.getNome());
		modelo.append("\n");
		modelo.append("idade: "+ this.getIdade());
		modelo.append("\nEstado civil: " + this.getEstadoCivil());
		modelo.append("\nComentários: " + this.getComentario());
		
		return modelo.toString();
	}
	
	
}
