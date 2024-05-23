package ControlFlow;

public class ReturnClass {
    public int CompareNum()
    {
        int x = 3;
        int y = 8;
        System.out.println("x = " + x + "\ny = " + y);
        if(x>y)
            return x;
        else
            return y;
    }
}
