package learn.ex2025.ex1;

public class ex0103 {

    public static double getPI(int i){
        double temp = 0;
        for(int j = 1;j <= i;j++){
            if( j % 2 == 1) temp +=1.0/(2 * j - 1);
            else temp -= 1.0/(2 * j - 1);
        }
        return 4 * temp;
    }

    public static void main(String[] args) {
        for(int i = 1;i<=100000000; i*=10) System.out.println("i="+i+"时π的值为: "+getPI(i));
    }

}
