package co.kh.model.vo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Food implements Serializable{

	private String name;
	private int kcal;

	public Food() {
	}

	public Food(String name, int kcal) {
		super();
		this.name = name;
		this.kcal = kcal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}
	public void fileSave(String fileName) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));) {

			oos.writeObject(new Food("사과", 20));

		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}
}
