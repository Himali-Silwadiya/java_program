import java.util.Scanner;
import java.util.*;
public class Main
{
    public int linearSearch(int[] arr,int n,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    Main m=new Main();
	    int n;
	    int key;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements");
	    n=sc.nextInt();
	    int a[]=new int[n];
	    System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		System.out.println("Enter element to be searched:");
		key=sc.nextInt();
		int index=m.linearSearch(a,n,key);
		if(index==-1)
		System.out.println("Not found");
		else
		System.out.println(key+"is found at index:"+index);
	};
}
