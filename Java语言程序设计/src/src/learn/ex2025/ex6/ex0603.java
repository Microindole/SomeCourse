package learn.ex2025.ex6;
public class ex0603 {
    public static void main(String[] args) {
        System.out.println("main开始执行");
        try {
            System.out.println("main进入 try 块");
            method1();
            System.out.println("main执行statement1");
        } catch (Exception1 ex1) {
            System.out.println("main捕获到 Exception1 - " + ex1.getMessage());
            System.out.println("main执行Process ex1");
        }
        System.out.println("main执行statement2");
        System.out.println("main执行结束");
    }
    public static void method1() throws Exception1 {
        System.out.println("  method1开始执行");
        try {
            System.out.println("  method1进入 try 块");
            method2();
            System.out.println("  method1执行statement3");
        } catch (Exception2 ex2) {
            System.out.println("  method1捕获到 Exception2 - " + ex2.getMessage());
            System.out.println("  method1执行Process ex2");
        }
        System.out.println("  method1执行statement4");
        System.out.println("  method1执行结束");
    }
    public static void method2() throws Exception1, Exception2 {
        System.out.println("    method2开始执行");
        try {
            System.out.println("    method2进入 try 块");
            method3();
            System.out.println("    method2执行statement5");
        } catch (Exception3 ex3) {
            System.out.println("    method2捕获到 Exception3 - " + ex3.getMessage());
            System.out.println("    method2执行Process ex3");

        }
        System.out.println("    method2执行statement6");
        System.out.println("    method2执行结束");
    }
    public static void method3() throws Exception1, Exception2, Exception3 {
        System.out.println("      method3开始执行");
        boolean throwEx1 = false;
        boolean throwEx2 = false;
        boolean throwEx3 = false;
        double num = Math.random();
        if(num >= 0.1 && num < 0.4) throwEx1 = true;
        if(num >= 0.4 && num < 0.7) throwEx2 = true;
        if(num >= 0.7) throwEx3 = true;
        if (throwEx1) {
            System.out.println("      method3: 准备抛出 Exception1");
            throw new Exception1("在 method3 中抛出了 Exception1");
        }
        if (throwEx2) {
            System.out.println("      method3: 准备抛出 Exception2");
            throw new Exception2("在 method3 中抛出了 Exception2");
        }
        if (throwEx3) {
            System.out.println("      method3: 准备抛出 Exception3");
            throw new Exception3("在 method3 中抛出了 Exception3");
        }
        System.out.println("      method3: 执行结束 (无异常抛出)");
    }
}
