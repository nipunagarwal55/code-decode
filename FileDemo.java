import java.io.*;
public class FileDemo
{

	public static void main(String args[]){
String path ="";
try{
File file =new File("javaFile123.txt");
if(file.createNewFile()){
System.out.println("New File is created!");
}
else{
System.out.println("File already created");
}
System.out.println(file);
File file2 =file.getCanonicalFile();
System.out.println(file);
path=file.getAbsolutePath();
System.out.println(path);
}


catch(IOException e){
e.printStackTrace();}
}
}