package test.controller;

public class Test10 {

	public static void main(String[] args) {
		int[][] array= {{12,41,36,56},{82,10,12,61},{14,16,18,78},{45,26,72,23}};
		int[] copyAr=new int[array.length*array[array.length-1].length];
		int[] ar=new int[array.length*array[array.length-1].length];
		
		
		int count=0;
		for(int[] num1:array) {
			for(int num2:num1) {
				if(num2%3==0) {//3으로 나누어 떨어지면 3의 배수
					copyAr[count]=num2;
					count++;
				}
			}
		}
		count=1;
		for(int i=1; i<copyAr.length; i++) {
			if(copyAr[i-1]==copyAr[i]) {
				continue;
			}
			copyAr[count++]=copyAr[i];
		}
	
		System.out.print("copyAr : ");
		for(int i:copyAr) {
			if(i!=0) System.out.print(i+" ");
		}
		
		
	}
}
