public class prac extends ChildClass {





    public void Sound()
    {
        System.out.println("from parent class");
    }

    public static void main(String[] args)
    {
        String txt= "hello,World!";
      for(int i=txt.length()-1; i>=0;i--)
      {
          System.out.println(txt.charAt(i));
      }


    }




}
