package test.controller;

public class Test9 {

	public static void main(String[] args) {
		int[][] array= {{12,41,36,56},{82,10,12,61},{14,16,18,78},{45,26,72,23}};

		int max=array[0][0];
		int min=array[0][0];
		for(int[] num1:array) {
			for(int num2:num1) {
				if(num2<=min) {//min���� num2���� �۰ų� ���ٸ�:�ּҰ�
					min=num2;
				}
				if(num2>=max) {//max���� num2���� �۰ų� ���ٸ�:�ִ밪
					max=num2;//���� max�� �ִ´�
				}
			}
		}
		System.out.println("���� ū �� : "+max);
		System.out.println("���� ���� �� : "+min);
	}
}
