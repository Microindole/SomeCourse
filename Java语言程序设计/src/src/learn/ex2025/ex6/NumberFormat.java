package learn.ex2025.ex6;
public class NumberFormat {
    public static int bin2Dec(String binaryString) throws NumberFormatException {
        for(int i = 0;i<binaryString.length();i++) {
            if(binaryString.charAt(i) !='0' && binaryString.charAt(i)!='1') {
                throw new NumberFormatException(binaryString + "不是一个有效的二进制串！");
            }
        }
        int decimalValue = 0;
        for(int i = 0;i<binaryString.length();i++){
            decimalValue = decimalValue * 2 + (binaryString.charAt(i) - '0');
        }
        return decimalValue;
    }
    public static void main(String[] args) {
        try{
            System.out.println("1010");
            System.out.println(bin2Dec("1014"));
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
