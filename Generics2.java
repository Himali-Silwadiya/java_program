class  Example <E>{
    int count=0;
       public <E> void Search(E arr[],E key)
     {
          
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("element found at "+i+"index");
            }else{
                count++;
            }
        }
        if(count>arr.length-1)
        System.out.println("element not found");
        
    }
     }

public class Main{
    public static void main(String args[])
    {
        Example<Integer> m=new Example<Integer>();
        Integer[] i={1,2,3,4};
        m.<Integer>Search(i,4);
      Example<String> m1=new Example<String>();

        String[] s1=new String[]{"Ishika","ishi","img","dhkall"};
        m.<String>Search(s1,"i");
        

    }
}
