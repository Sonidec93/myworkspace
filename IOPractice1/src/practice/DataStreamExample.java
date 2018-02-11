package practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamExample {

	public static void main(String arg[]) throws IOException{
		OutputStream out =new FileOutputStream("D:\\Practice1.txt");
		DataOutputStream dos=new DataOutputStream(out); 
		dos.writeBoolean(true);
		
		dos.writeChars("Mukul");
		
		dos.close();
		out.close();
		InputStream is=new FileInputStream("D:\\Practice1.txt");
		DataInputStream dis=new DataInputStream(is);
//		int i;
		byte arr []=new byte[dis.available()];
		dis.read(arr);
		System.out.print(new String(arr));
		
		dis.close();
	}
}
		