import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
	{
	public static void main(String args[])
		{
			ArrayList nameList=new ArrayList(4);
			
				nameList.add("Welcome");
				nameList.add("Romesh");
				nameList.add("Richa");
				nameList.add(1,"Ajay");
				

Iterator it = nameList.iterator();
while(it.hasNext())
System.out.println(it.next());



}
}
					