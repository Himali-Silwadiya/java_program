//Append
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    try{
	    File file=new File("a.txt");
	    FileWriter fr=new FileWriter(file,true);
	    fr.write(".....Data....\n Handling");
	    fr.close();
	    }
	   catch(Exception e){
	       e.getStackTrace();
	   }
	}
}
