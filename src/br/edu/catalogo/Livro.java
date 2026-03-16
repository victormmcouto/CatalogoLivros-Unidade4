package br.edu.catalogo;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicado;
	
	public Livro(String titulo, String autor, int anoPublicado) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicado = anoPublicado;
	}
	
	public void exibirInformacoes() {
		System.out.println("\nTitulo: " + titulo + 
				   		   "\nAutor: " + autor + 
				   		   "\nAno de publicação: " + anoPublicado);
	}
}
