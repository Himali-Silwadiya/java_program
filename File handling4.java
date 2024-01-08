import java.io.File;
public class Main
{
	public static void main(String[] args) {
	    //creates a file Object
	    File file=new File("a.txt");
	    //deletes the File
	    boolean value=file.delete();
	    if(value){
	        System.out.println("The file is deleted");
	    }
	    else{
	        System.out.println("The file is not deleted");
	    }
	}
}
