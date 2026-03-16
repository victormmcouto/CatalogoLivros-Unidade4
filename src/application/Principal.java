package application;

import br.edu.catalogo.Livro;

public class Principal {

	public static void main(String[] args) {
		
		Livro[]livros = new Livro[5];
		
		livros[0] = new Livro("Java: Como Programar 10e", " Deitel & Deitel", 2023);
		livros[1] = new Livro("UML 2.0 do Requisito à Solução", "Adilson da Silva Lima", 2007);
		livros[2] = new Livro("The Blind Watchmaker", "Richard Dawkins", 1996);
		livros[3] = new Livro("Java para Iniciantes", "Kathy Sierra e Bert Bates", 2024);
		livros[4] = new Livro("A Grande História da Evolução", "Richard Dawkins", 2009);
		
		System.out.println("===== Livros que contêm 'Java' no título =====");
		for (Livro livro : livros) {
			if (livro.getTitulo().contains("Java")) livro.exibirInformacoes();
		}
	}

}
