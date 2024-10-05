package entities;

public class Product implements Comparable<Product> {
	// Atributo
	private String name;
	private Double price;
	
	// Método Getter e Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	// Método Construtor
	public Product() {
		
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product other) {
		// Fazer a ordenação por nome ou preço
		// ordenar por nome
		
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
	
	// Método
	
}
