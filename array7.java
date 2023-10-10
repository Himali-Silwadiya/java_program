import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int a[]={10,30,2,5,6,7};
	    int e=0,o=0;
		for(int i:a)
		{
		    if(i%2==0)
		    e++;
		    else
		    o++;
		}
		System.out.println("Even"+" "+e);
		System.out.println("Odd"+" "+o);
	}
}
