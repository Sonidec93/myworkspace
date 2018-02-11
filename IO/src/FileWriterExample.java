import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterExample {
	public static void main(String[] args) {

		FileWriter fw;
		try {
			fw = new FileWriter("E:\\orange.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);
			System.out.println("By default the append value has been set to false so we need to pass true");
			bw.append("i have appended some text in the file111");

			bw.flush();
			bw.close();
			fw.close();
			FileReader fr=new FileReader("E:\\orange.txt");
			BufferedReader br=new BufferedReader(fr);
			System.out.println("to test whether the input stream is ready :"+br.ready());
			System.out.println(br.readLine());

			br.close();
			fr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
}
