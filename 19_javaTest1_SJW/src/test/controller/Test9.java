package test.controller;

public class Test9 {

	public static void main(String[] args) {
		int[][] array= {{12,41,36,56},{82,10,12,61},{14,16,18,78},{45,26,72,23}};

		int max=array[0][0];
		int min=array[0][0];
		for(int[] num1:array) {
			for(int num2:num1) {
				if(num2<=min) {//min값이 num2보다 작거나 같다면:최소값
					min=num2;
				}
				if(num2>=max) {//max값이 num2보다 작거나 같다면:최대값
					max=num2;//값을 max에 넣는다
				}
			}
		}
		System.out.println("가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);
	}
}
