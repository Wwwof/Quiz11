package day250430;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import net.coobird.thumbnailator.Thumbnails;

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
			//System.out.println("입력하지 않았어");
			test = true;
			break;
		}else {
			fileName = new File(you);
			if(!fileName.exists()) {
				//System.out.println("없다");
				System.out.println("파일이 없습니다. 다시 입력해주세요");
			}else if(fileName.exists()) {
				//System.out.println("있다");
				break;
			}
		}
		}
		
		if(fileName.exists()) {
			System.out.print("변환할 크기의 가로픽셀을 입력해주세요: ");
			int rkfh = scan.nextInt();
			System.out.print("변환할 크기의 세로픽셀을 입력해주세요: ");
			int tpfh = scan.nextInt();
			scan.nextLine();
			System.out.print("변환할 파일명을 입력해주세요: ");
			String youNew = scan.nextLine();
			File fileNameNew = new File(youNew);
			try {
				Thumbnails.of(fileName)
				.size(rkfh, tpfh)
				.outputFormat("jpg")
				.toFile(fileNameNew);
			}catch (IOException gg) {
				gg.printStackTrace();
			}
		}
		
		if(test == true) {
			System.out.println("허허허허허허");
		}
		scan.close();
		
		
		
		
	}

}
