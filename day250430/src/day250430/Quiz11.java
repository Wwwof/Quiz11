package day250430;

import java.io.File;
import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File fileName = null;
		
		do {
			//크기를 줄일 파일명 받기
			System.out.print("크기를 줄일 파일명을 입력해주세요: ");
			fileName = new File(scan.nextLine());
				//아무것도 입력하지 않았을 경우, 종료
				if(!fileName.canRead()) {
					System.out.println("아무것도 입력 안함");
				}else if(fileName.exists()){
					System.out.println("있다");
					break;
				}
		}while(true) { //파일이 없을 경우는 재입력 → 파일이 있을 때까지 반복
			System.out.println("있다");
		}
	}

}
