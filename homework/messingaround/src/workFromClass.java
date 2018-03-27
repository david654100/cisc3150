public class workFromClass {
    int i;
    workFromClass a;
    {
        i=10;
        a=new workFromClass();

    }
    public static void main(String[] args) {
        workFromClass a =new workFromClass();
        System.out.println(a.a.a.a.a.a.a.i);
    }
}
