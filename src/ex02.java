import java.net.*;
import java.io.*;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte buff[] = new byte[1024];
		try{
			System.out.println("���b�P���A���إ߳s�u...");
			Socket s = new Socket("127.0.0.1",2525);
			System.out.println("�w�g�P���A�����o�s�u...");
			InputStream in = s.getInputStream();
			int n = in.read(buff);
			System.out.print("�q���A���ݦ���G");
			System.out.println(new String(buff,0,n));
			in.close();
			s.close();
		}
		catch(Exception e){
			System.out.println("�o�ͤF" + e + "�N�~");
		}
	}

}
