package test.controller;

public class Test2 {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			if(i%2!=0&&i<6) {//ù��° ���� ¦���� �ƴ϶��:Ȧ��
				for(int j=1; j<10; j++) {
					if(j%2!=0) {//�ι�° ���� ¦���� �ƴ϶��
						System.out.println(i+"*"+j+"="+i*j);
					}
				}
			}
		}
	}
}
