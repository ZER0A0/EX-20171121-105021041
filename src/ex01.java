import java.net.*;
import java.io.*;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ServerSocket svs = new ServerSocket(2525);
			
			System.out.println("���ݫȤ�ݪ��ШD��...");
			Socket s = svs.accept();
			System.out.println("�Ȥ�ݤw�s�u...");
			
			OutputStream out = s.getOutputStream();
			String str = "Honor shows the man.";
			System.out.println("��ƥ��b�ǰe��...");
			out.write(str.getBytes());
			out.close();
			s.close();
			System.out.println("��ƶǰe����...");
		}
		catch(Exception e){
			System.out.println("�o�ͤF" + e + "�N�~");
		}
	}

}
