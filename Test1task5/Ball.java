package by.epam.cdptr.main;

class Ball {
	

	private double weight;
	private String color;
	
	public Ball(double weight, String color) {
		this.weight = weight;
		this.color = color;
	}
	
		
	public String toString(){
	       return weight + color;
	    }
	
	public double getWeight() {
		return weight;
	}
	
	public String getColor() {
		return color;
	}
	
	
}
