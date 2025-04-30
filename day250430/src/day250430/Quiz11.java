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
		
//			fileName = new File(scan.nextLine());
//				//아무것도 입력하지 않았을 경우, 종료
//				if(!fileName.canRead()) {
//					System.out.println("아무것도 입력 안함");
//					test = true;
//					break;
//				}else if(fileName.exists()){
//					System.out.println("있다");
//					
//				}
//		}while(true);  //파일이 없을 경우는 재입력 → 파일이 있을 때까지 반복
//		
//		if(test==true) {
//			System.out.println("안나와야 한다고");
//		}
//		scan.close();
//		
//		System.out.println("있어서 나왔어");
		
		
		
		
		
	}

}
