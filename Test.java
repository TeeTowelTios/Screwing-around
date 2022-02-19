public class Test{
    public static void main(String[] args) {

        int a = 8;

        System.out.println(a);
        System.out.println(doStuff(a));

    }

    public static int doStuff(int a){
        return a * a;
    }
}