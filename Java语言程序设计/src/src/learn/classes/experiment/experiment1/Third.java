package learn.classes.experiment.experiment1;



public class Third {

    public static boolean LeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        int line = 0;
        for (int i= 101; i < 2100; i++){
            if (LeapYear(i)){
                if(line % 10 == 0){
                    System.out.println(i);
                }else {
                    System.out.print(i+" \t");
                }line++;
            }
        }
    }
}
