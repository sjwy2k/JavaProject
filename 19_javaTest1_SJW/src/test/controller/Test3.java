package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int sum=0;
		int num=1;
		while(true) {
			sum+=num;
			num++;
			if(num>100) {
				break;
			}
		}
		System.out.println("1���� 100������ �հ� : "+sum);
		System.out.println("��� : "+(double)sum/(num-1));//101�� ���� �������Ƿ�..
		
		
	}
}
