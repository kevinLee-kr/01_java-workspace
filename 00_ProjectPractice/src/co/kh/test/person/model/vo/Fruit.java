package co.kh.test.person.model.vo;

public class Fruit {

	private String fruit;
	private String color;
	
	public Fruit() {}

	public Fruit(String fruit, String color) {
		super();
		this.fruit = fruit;
		this.color = color;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [fruit=" + fruit + ", color=" + color + "]";
	}
	
	
	
}
