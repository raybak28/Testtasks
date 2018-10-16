package by.epam.cdptr.main;

import java.util.Random;
import java.util.Scanner;

public class Test1task4 {

	public static void main(String[] args) {
		int N;
		
		N = enterNValue();
		int[] A = new int[N];
		enterRandomArray(A, N);
		for (int i = 0; i < A.length; i++) {
			System.out.print("A[" + i + "]=" + A[i] + "; ");
			System.out.println();
		}
		findSimpleNumbers(A);
	}
		
	public static int enterNValue() {
		int N = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите N :");
		if (sc.hasNextInt()) {
			N = sc.nextInt();
		}
		return N;		
	}


    public static void enterRandomArray(int[] A, int N) {
    	Random rand = new Random();
    	for (int i = 0; i < A.length; i++) {
    		A[i] = rand.nextInt(N);
    	}
    }
    
    public static void findSimpleNumbers(int[] A) {
    	 System.out.println("Элементы массива с простыми числами : ");
    	for (int i = 0; i < A.length; i++) {
    		int flag = 0;
        	int j = 2;
        	int index = 0;
    		while (j < (A[i] - 1)) {   
    		  
    		  if (A[i] % j == 0) {  
    			  flag = 1;
    			  break;
    		  } else {
    			  flag = 0;
    			  j++;
    		 }
    		  
    	 
    	  }
    	  if ((flag == 0)&&(A[i] != 0)) {
    		  index = i;
     		 //System.out.println("Простое число массива A[" + i + "]" + " равно : " + A[i] + "  Элемент массива: " + index);
    		  System.out.print(index + " , ");
     	 }	
    		
    	} 
    	}
    	   
}   