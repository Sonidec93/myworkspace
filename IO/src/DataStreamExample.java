import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataStreamExample {
	public static void main(String[] args) {

		try {
			FileOutputStream fout=new FileOutputStream("E:\\data.txt");
			DataOutputStream dout=new DataOutputStream(fout);
			dout.writeInt(65);

			dout.close();
			fout.close();
			
			FileInputStream fin=new FileInputStream("E:\\data.txt");
			DataInputStream din=new DataInputStream(fin);
			System.out.println(din.available());
			char c=(char)din.readInt();
			
			System.out.println(c);
			
			
			din.close();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
