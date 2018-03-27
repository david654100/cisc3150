public class Quine
{
    public static void main(String[] args)
    {
        EJava ejava = new EJava();
    }


    }

    class EJava {
        static {
            System.out.println("static block");
        }
        {
            System.out.println("hello world iib");
        }
       public EJava(){
           this(7);
           System.out.println("public");
       }
       private EJava(int var){
           this("sunday");
           System.out.println("private");
       }

       protected EJava(String val){
           System.out.println("protected ");
       }
    }