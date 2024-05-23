package Datatype;

public class MainClass {
    public static void main(String args[])
    {
        Parent obj=new Child();
        Child objchild=(Child)obj;
        objchild.display();
        objchild.displayParent();
        objchild.displayChild();
    }
}