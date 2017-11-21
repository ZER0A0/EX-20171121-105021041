import java.net.*;
import java.io.*;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte buff[] = new byte[1024];
		try{
			System.out.println("正在與伺服器建立連線...");
			Socket s = new Socket("127.0.0.1",2525);
			System.out.println("已經與伺服器取得連線...");
			InputStream in = s.getInputStream();
			int n = in.read(buff);
			System.out.print("從伺服器端收到：");
			System.out.println(new String(buff,0,n));
			in.close();
			s.close();
		}
		catch(Exception e){
			System.out.println("發生了" + e + "意外");
		}
	}

}
