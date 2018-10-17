package by.epam.cdptr.main;


class Basket {
	
	public static void main(String[] args) {
		
		int k = 5;
		Ball[] mas = new Ball[k];
		mas[0] = new Ball(1.5, "blue");
		mas[1] = new Ball(3.5, "green");
		mas[2] = new Ball(1.3, "red");
		mas[3] = new Ball(6, "yellow");
		mas[4] = new Ball(4.5, "blue");
		countTotalWeight(mas);
		defineCount(mas);
	}
		
		public static void countTotalWeight(Ball[] mas) {
		double totalWeight = 0;
		for (int i = 0; i < mas.length; i++) {
			
			totalWeight = totalWeight + mas[i].getWeight();
		}
		System.out.println("Total weight = " + totalWeight);
		}
		
		public static void defineCount(Ball[] mas) {
		int count = 0;
        for (int i = 0; i < mas.length; i++) {
			
        	if (mas[i].getColor() == "blue") {
			count++;
		}
        }	
		System.out.println("Count of blue balls = " + count);
		}
}		
		