package practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriterExample {
	/*
	 * The writer is an abstract class for writing character streams . The
	 * subclass has to implement write(char[],int,int),flush() and close()
	 */
	public static void main(String[] arg) {

		try {
			Writer w = new FileWriter("D:\\WriterPractice.txt");
			w.write("I want to be the best of myself");
			w.close();

			Reader r = new FileReader("D:\\WriterPractice.txt");
			int i;
			while((i=r.read())!=-1){
				System.out.print((char)i);
			}
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
