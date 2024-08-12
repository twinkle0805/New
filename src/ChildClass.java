public class ChildClass extends ParentClass {


    public void Sound()

    {
        super.Sound();
        System.out.println("from Child class");
    }
    public void music()
    {
        System.out.println("from parent class");

    }

    public static void main(String[] args)
    {

        ChildClass cc = new ChildClass();
        cc.music();
        cc.Sound();
    }



}
