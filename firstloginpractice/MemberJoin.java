package firstloginpractice;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemberJoin {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		File file = new File("data/file");
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			if(file.isFile() && file.canWrite()) {
				System.out.println("회원가입을 위해 ID와 비밀번호를 입력해주세요. ");
				System.out.println("ID 입력 : ");
				fileWriter.append(sc.nextLine());
				fileWriter.append("\t"); //탭 저장
				System.out.println("비밀번호 입력 : ");
				fileWriter.append(sc.nextLine()); //append로 파일에 추가
				fileWriter.append("\r"); 
				System.out.println("회원 가입이 완료되었습니다.");
				
			}
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
