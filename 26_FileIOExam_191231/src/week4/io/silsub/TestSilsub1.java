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
			System.out.print("사용할 파일명을 입력 : ");
			BufferedReader bf=
					new BufferedReader(
							new InputStreamReader(System.in));
			fileName=bf.readLine()+".txt";
			FileWriter fw=new FileWriter(fileName);
			while(true) {
			System.out.println("파일에 저장할 내용을 입력하시오. (exit입력시 종료)");
			System.out.print("내용 : ");
			bf=new BufferedReader(
					new InputStreamReader(System.in));
			fileContent=bf.readLine();
			if(fileContent.equals("exit")) {
				break;
			} else {				
				fw.write(fileContent+"\r\n");
				}
			}
			System.out.println("파일이 성공적으로 저장되었습니다.");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		
	}
}
