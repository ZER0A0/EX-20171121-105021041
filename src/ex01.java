import java.net.*;
import java.io.*;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ServerSocket svs = new ServerSocket(2525);
			
			System.out.println("等待客戶端的請求中...");
			Socket s = svs.accept();
			System.out.println("客戶端已連線...");
			
			OutputStream out = s.getOutputStream();
			String str = "Honor shows the man.";
			System.out.println("資料正在傳送中...");
			out.write(str.getBytes());
			out.close();
			s.close();
			System.out.println("資料傳送完畢...");
		}
		catch(Exception e){
			System.out.println("發生了" + e + "意外");
		}
	}

}
