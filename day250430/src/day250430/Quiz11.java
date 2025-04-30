package day250430;

import java.io.File;
import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File fileName = null;
		boolean test = false;
		
//		do {
			//크기를 줄일 파일명 받기
		while(true) {
		System.out.print("크기를 줄일 파일명을 입력해주세요: ");
		String you = scan.nextLine();
		
		if(you.equals("")){
			System.out.println("입력하지 않았어");
			test = true;
			break;
		}else {
			fileName = new File(you);
			if(!fileName.exists()) {
				System.out.println("없다");
				System.out.println("파일이 없습니다. 다시 입력해주세요");
			}else if(fileName.exists()) {
				System.out.println("있다");
				break;
			}
		}
		}
		
		if(test == true) {
			System.out.println("허허허허허허");
		}
		scan.close();
		
		
		
		
	}

}
