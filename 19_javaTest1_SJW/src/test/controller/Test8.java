package test.controller;

public class Test8 {

	public static void main(String[] args) {
		int[][] array= {{12,41,36,56},{82,10,12,61},{14,16,18,78},{45,26,72,23}};
		double sum=0;
		int count=0; 
		for(int[] num1:array) {
			for(int num2:num1) {
				sum+=num2;
				count++;
			}
		}
		System.out.println("ÇÕ°è : "+sum);
		System.out.println("Æò±Õ : "+sum/count);
	}
}
