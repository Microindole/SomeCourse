package learn.ex2025.ex3;

import java.util.Scanner;

public class Main {

    public static void testFan(){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeed(fan2.MEDIUM);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

    public static void testTax(){
        String [] str = {"单身纳税人","已婚共缴纳税人或合法丧偶人士","已婚单缴纳税人","家庭纳税人"};
        Tax thisTax = new Tax();
        int [] taxStatus = {
                thisTax.SINGLE_FILER,
                thisTax.MARRIED_JOINTLY,
                thisTax.MARRIED_SEPARATEL14Y,
                thisTax.HEAD_OF_HOUSEHOLD,
        };
        for (int i = 0; i < str.length; i++) {
            thisTax.setFilingStatus(taxStatus[i]);
            for(double taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000){
                thisTax.setTaxableIncome(taxableIncome);
                thisTax.setTax();
                System.out.printf("纳税人种类: %s\t收入为: %.2f美元\t应该纳税: %.2f美元\n", str[thisTax.getFilingStatus()], thisTax.getTaxableIncome(), thisTax.getTax());
            }
        }
    }



    public static void testLocation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入二维数组的行数和列数: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        double [][] arr = new double[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextDouble();
            }
        }
        Location location = Location.locateLargest(arr);
        System.out.printf("最大元素及其下标是: "+location.getMaxValue()+" 在("+location.getRow()+","+location.getColumn()+")");
    }


    public static void main(String[] args) {

    }
}
