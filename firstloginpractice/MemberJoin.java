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
				System.out.println("ȸ�������� ���� ID�� ��й�ȣ�� �Է����ּ���. ");
				System.out.println("ID �Է� : ");
				fileWriter.append(sc.nextLine());
				fileWriter.append("\t"); //�� ����
				System.out.println("��й�ȣ �Է� : ");
				fileWriter.append(sc.nextLine()); //append�� ���Ͽ� �߰�
				fileWriter.append("\r"); 
				System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�.");
				
			}
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
