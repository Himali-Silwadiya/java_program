//importing the FileWriter class
import java.io.FileWriter;
public class Main
{
	public static void main(String[] args) {
	  String data="This is the data in the output file";
	  try{
	        //Creates a Writer using the FileWriter
	        FileWriter output=new FileWriter("a.txt");
	        //Writes string to the file
	        output.write(data);
	       System.out.println("Data is written in the file");
	       
	       //Closes the writer
	       output.close();
	    }
	    catch(Exception e){
	        e.getStackTrace();
	    }
	}
}
