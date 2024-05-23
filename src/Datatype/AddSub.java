package Datatype;

public class AddSub {
    int a = 20;
    int b = 30;
    int c;

    public void add() {
        int c = a + b;
        System.out.println("Sum is :" + c);

    }

    public void sub() {
        int c = a - b;
        System.out.println("Subtraction is :" + c);

    }

    public static void main(String args[]) {
        AddSub obj = new AddSub();
        obj.add();//creating obj
        obj.sub();
    }
}

