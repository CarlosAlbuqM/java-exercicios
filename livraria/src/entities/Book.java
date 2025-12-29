package entities;

public class Book {
	
	private String autor;
	private String titulo;
	private double preco;
	private int estoque;
	
	
	public Book(String autor, String titulo, double preco) {
		this.autor = autor;
		this.titulo = titulo;
		this.preco = preco;
	}


	public String getAutor() {
		return autor;
	}



	public String getTitulo() {
		return titulo;
	}



	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getEstoque() {
		return estoque;
	}
	
	public void addBooks(int quantidade) {
		this.estoque += quantidade;
	}

	public void removeBooks(int quantidade) {
		if (quantidade <= this.estoque) {
	        this.estoque -= quantidade;
	    } else {
	        System.out.println("Erro: Quantidade em estoque insuficiente!");
	    }
	}
	
	public String toString() {
		return "Dados do Livro: "
				+ titulo
				+ ", Autor: "
				+ autor
				+ ", preço: $ "
				+ String.format("%.2f", preco)
				+ ", Estoque:"
				+ estoque;
		
	}
	
}


