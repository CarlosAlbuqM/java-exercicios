package entities;

public class Product {
	
	public String name;
	public int quantity;
	
	public void adicionar(int x) {
		quantity += x;
	}
	
	public void remover(int y) {
		quantity -= y;
	}

}
