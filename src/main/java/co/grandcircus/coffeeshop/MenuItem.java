package co.grandcircus.coffeeshop;

public class MenuItem {

	private Long id;
	private String name;
	private String description;
	private double price;

	public MenuItem() {
	}

	public MenuItem(Long id, String name, String description, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setItemName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "MenuItem [id =" + id + "name=" + name + ", description=" + description + ", price=" + price + "]";
	}

}
