package test.controller;

public class Test7 {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,9,10};
		double sum=0;
		for(int num:array) {
			if(num%2!=0) {
				System.out.println(num);
				sum+=num;
			}
		}
		System.out.println("�հ� : "+sum);
	}
}
