package Java_projects;

public class Task00 {
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a);
        var b = 12.34;
        System.out.println(b);
        System.out.println(getType(a));
        System.out.println(getType(b));
        String s = "ewfas";
        System.out.println(s);
        System.out.println(s.charAt(0));
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
