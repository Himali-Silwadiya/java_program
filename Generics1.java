class  Mydata <E>{
    E i;
    public  void setter(E i1)
    {
        i=i1;
    }
    public E get()
    {
        return (i);
    }
}
public class Example{
    public static void main(String args[])
    {
        Mydata<Integer> m=new Mydata<Integer>();
        Integer i1=3;
        m.setter(i1);
        m.get();
        System.out.println( m.get());
        Mydata<String> s=new Mydata<String>();
        String s1="HIIIII";
        s.setter(s1);
        s.get();
                System.out.println( s.get());

    }
}
