package week4.io.silsub;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSilsub1 {

	public static void main(String[] args) {
		new TestSilsub1().fileSave();
	}
	
	public void fileSave() {
		String fileName, fileContent;
		try {
			System.out.print("����� ���ϸ��� �Է� : ");
			BufferedReader bf=
					new BufferedReader(
							new InputStreamReader(System.in));
			fileName=bf.readLine()+".txt";
			FileWriter fw=new FileWriter(fileName);
			while(true) {
			System.out.println("���Ͽ� ������ ������ �Է��Ͻÿ�. (exit�Է½� ����)");
			System.out.print("���� : ");
			bf=new BufferedReader(
					new InputStreamReader(System.in));
			fileContent=bf.readLine();
			if(fileContent.equals("exit")) {
				break;
			} else {				
				fw.write(fileContent+"\r\n");
				}
			}
			System.out.println("������ ���������� ����Ǿ����ϴ�.");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		
	}
}
