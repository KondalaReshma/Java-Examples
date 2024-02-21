package AggregationExample;

public class mobilephone {

	
	 private String brand;
     private String model;
     private String display;
     private String memory;
     private String color;
     private sim sim;
	public mobilephone(String brand, String model, String display, String memory, String color, sim sim) {
		super();
		this.brand = brand;
		this.model = model;
		this.display = display;
		this.memory = memory;
		this.color = color;
		this.sim = sim;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public sim getSim() {
		return sim;
	}
	public void setSim(sim sim) {
		this.sim = sim;
	}
     
     
}
