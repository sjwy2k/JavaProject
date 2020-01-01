package test.controller;

public class Test2 {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			if(i%2!=0&&i<6) {//첫번째 단이 짝수가 아니라면:홀수
				for(int j=1; j<10; j++) {
					if(j%2!=0) {//두번째 곱이 짝수가 아니라며
						System.out.println(i+"*"+j+"="+i*j);
					}
				}
			}
		}
	}
}
