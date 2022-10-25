package firstloginpractice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int pass = 0; //로그인 성공 여부
		System.out.println("로그인을 위해 ID와 비밀번호를 입력하세요. ");
		System.out.println("ID 입력 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력 : ");
		String pw = sc.nextLine();

		//파일 입출력 선언
		File file = new File("data/file");
		//회원가입은 파일에 쓰고(writer), 로그인은 파일을 읽어온다(reader)
		try {
			FileReader fileReader = new FileReader(file);
			//파일리더로 읽어온 내용을 저장하는 버퍼리더
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line ="";
			try {
				while((line = bufferedReader.readLine()) != null)  {
					System.out.println(line.indexOf(id) + "\t" + line.indexOf(pw));
					int passId = line.indexOf(id);
					int passPw = line.indexOf(pw);
					if(passId != -1 && passPw != -1) {
						System.out.println("로그인 성공");
						pass = 1; //로그인 성공
					}

				}
				if(pass == 0) { 
					System.out.println("로그인 실패");
				}
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
