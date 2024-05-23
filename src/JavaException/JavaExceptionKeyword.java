package JavaException;

public class JavaExceptionKeyword {
    public static void main(String args[]){
        try {
            String s="abc";
            int i=Integer.parseInt(s);
/*
            int a[]=new int[5];
            a[10]=50;
*/
        }catch (ArrayIndexOutOfBoundsException e)
        {System.out.println(e);}
        System.out.println("rest of the code...");
    }
}
