package practice;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermission1 {

	public static void main(String [] arg){
		
		String value="D:\\Practice1.txt";
		/*here - will mean permission applies to all subdirectories and files
			& D:\\* will mean permission is applied to all directories and files excluding subdirectories
		**/
		FilePermission file=new FilePermission("D:\\-","read");
		FilePermission file2=new FilePermission("D:\\Practice1.txt","write");
		PermissionCollection pc=file.newPermissionCollection();
		pc.add(file);
		pc.add(file2);
		if(pc.implies(new FilePermission(value,"read,write"))){
			System.out.println("Both read and write enabled for "+value);
		}
	}
}
