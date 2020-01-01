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
		System.out.println("1부터 100까지의 합계 : "+sum);
		System.out.println("평균 : "+(double)sum/(num-1));//101로 빠져 나왔으므로..
		
		
	}
}
