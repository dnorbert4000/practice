public class Hiding {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A x = b;

        System.out.println("Example 2");
        System.out.println(" 1: " + a.go());
        System.out.println(" 2: " + b.go());
        System.out.println(" 3: " + x.go());
        System.out.println("--------------------------------");
        System.out.println("Testing overriding1 " + a.test() );
        System.out.println("Testing overriding2 " + b.test() );
        System.out.println("Testing overriding3 " + x.test() );
    }
}

class A {
    public static String go() {
        return "A1";
    }

    public String test() {
        return "a test";
    }
}

class B extends A {
    public static String go() {
        return "B1";
    }
    @Override
    public String test() {
        return "b test";
    }
}