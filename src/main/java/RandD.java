public class RandD extends TestWQ {
    //m2();
    public static void main(String[] args) {
        System.out.println(StaticClass.s.length());
        //TestWQ.m2();
        System.out.println(Integer.parseInt("12"));
        System.out.println(Integer.parseInt("A",10));
        System.out.println(Integer.valueOf("12"));

        RandD randD = new RandD();
        randD.m2();
    }

    static class StaticClass {
        static String s = "Java";
    }

    class Hello {
        //m2();


    }
}