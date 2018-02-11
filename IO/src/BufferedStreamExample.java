import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferedStreamExample {


	public static void main(String[] args) {

		System.out.println("Java uses the concept of buffered stream make the I/O operstions faster");
		System.out.println("it stores an internal buffer");

		try {
			FileInputStream fin= new FileInputStream("E:\\example.txt");

			BufferedInputStream bin=new BufferedInputStream(fin);

			int i;

			while((i=bin.read())!=-1){
				System.out.print((char)i);

			}
			bin.close();
			fin.close();

			FileOutputStream fout=new FileOutputStream("E:\\example.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String text="using just bufferedOutput stream i am not able to append";

			byte [] bs=text.getBytes();

			bout.write(bs);
			bout.flush();
			bout.close();
			fout.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
