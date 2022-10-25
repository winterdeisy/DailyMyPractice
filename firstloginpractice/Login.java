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
		int pass = 0; //�α��� ���� ����
		System.out.println("�α����� ���� ID�� ��й�ȣ�� �Է��ϼ���. ");
		System.out.println("ID �Է� : ");
		String id = sc.nextLine();
		System.out.println("��й�ȣ �Է� : ");
		String pw = sc.nextLine();

		//���� ����� ����
		File file = new File("data/file");
		//ȸ�������� ���Ͽ� ����(writer), �α����� ������ �о�´�(reader)
		try {
			FileReader fileReader = new FileReader(file);
			//���ϸ����� �о�� ������ �����ϴ� ���۸���
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line ="";
			try {
				while((line = bufferedReader.readLine()) != null)  {
					System.out.println(line.indexOf(id) + "\t" + line.indexOf(pw));
					int passId = line.indexOf(id);
					int passPw = line.indexOf(pw);
					if(passId != -1 && passPw != -1) {
						System.out.println("�α��� ����");
						pass = 1; //�α��� ����
					}

				}
				if(pass == 0) { 
					System.out.println("�α��� ����");
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
