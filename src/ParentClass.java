public class ParentClass {

    public void Sound()
    {
        System.out.println("from parent class");
    }
   public void music()
   {
       System.out.println("from parent class");

   }
   
    public static void main(String [] args)
    {
        ParentClass prnt=new ParentClass();
        prnt.music();
        prnt.Sound();
    }

}
