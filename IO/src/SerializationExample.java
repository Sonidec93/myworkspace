import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	private String name;
	public student(int age,String name){
		this.age=age;
		this.name=name;

	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

public class SerializationExample {
	public static void main(String[] args) {

		try {
			FileOutputStream fout=new FileOutputStream("E:\\data.txt");
			ObjectOutputStream oot=new ObjectOutputStream(fout);
			student obj=new student(22, "Rahul");
			oot.writeObject(obj);

			oot.close();
			fout.close();

			FileInputStream fin=new FileInputStream("E:\\data.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);

			student obj2=(student)oin.readObject();

			System.out.println(obj2.getAge());
			System.out.println(obj2.getName());

			oin.close();
			fin.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}