package ncs.test1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String score=new String("");
		char team='A';
		for(int i=0; i<5; i++) {
			System.out.print(team++ +" �� ���� �Է� : ");
			score+=(sc.nextLine()+" ");
		}
		
		String[] scores=score.split(" ");
		int[] scoresI=new int[scores.length];
		for(int i=0; i<scoresI.length; i++) {
			scoresI[i]=Integer.parseInt(scores[i]);
		}
		
		double result=0;
		if(scores.length!=5) {
			System.out.println("�ٽ� �Է� �ϼ���");
		} else {
			for(int i=0; i<scoresI.length; i++) {
				if(scoresI[i]<10||scoresI[i]>99) {
					System.out.println("�ٽ� �Է� �ϼ���");
					return;
				}
			}
			result+=(((scoresI[0]+scoresI[1])/2.0)*0.6);
			result+=(((scoresI[2]+scoresI[3])/2.0)*0.2);
			result=(result+scoresI[4]*0.2);

			switch((int)result/10) {
			case 10:
			case 9:
				System.out.println("������ : "+(int)result+"��");
				System.out.println("Class : Gold Class");
				break;
			case 8:
				System.out.println("������ : "+(int)result+"��");
				System.out.println("Class : Silver Class");
				break;
			case 7:
				System.out.println("������ : "+(int)result+"��");
				System.out.println("Class : Bronze Class");
				break;
			default:
				System.out.println("������ : "+(int)result+"��");
				System.out.println("Class : Normal Class");
				break;
			}
		}
		
		
	}
}
