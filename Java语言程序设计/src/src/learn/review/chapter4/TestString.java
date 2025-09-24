package learn.review.chapter4;

public class TestString {
    public static void main(String[] args) {
        test3equals();
    }




    public static void test1(){
        String string = "  fdfoaoif   foagmfo  ffjod  ";
        System.out.println(string.charAt(5));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.concat("  dsaoncoasnvp "));
        System.out.println(string.length());
        System.out.println(string.trim());
    }

    public static void test2(){
        String str2 = "ILoveLuo";
        System.out.println(str2.startsWith("I"));
        System.out.println(str2.endsWith("idnf"));
        System.out.println(str2.substring(1));
        System.out.println(str2.substring(5,8));
    }

    public static void test3equals(){
        String st1 = "Luo";
        String st2 = "Java";
        String st3 = new String("Luo");
        System.out.println(st1 == st3);
        System.out.println(st1.equals(st3));
    }
}
