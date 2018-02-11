package practice;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayStreamExample {

	public static void main(String []arg){
		
		try {
			FileOutputStream fout1=new FileOutputStream("D:\\Practice1.txt");
			ByteArrayOutputStream bos=new ByteArrayOutputStream();
			bos.write(65);
			bos.write(66);
			
			bos.writeTo(fout1);
			
			System.out.println(bos.toString());
				
			bos.close();
			fout1.close();
			
			FileInputStream fin=new FileInputStream("D:\\Practice1.txt");
			byte arr[]=new byte[fin.available()];
			
			fin.read(arr);
			ByteArrayInputStream bin=new ByteArrayInputStream(arr);
			
			byte arr1 []=new byte[bin.available()];
			
			bin.read(arr1);
			System.out.println(new String(arr1));
			
			bin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
