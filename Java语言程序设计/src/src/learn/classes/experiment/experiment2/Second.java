package learn.classes.experiment.experiment2;

public class Second {

    public static boolean isPrime(int num){
        int num1 = (int) Math.sqrt(num);
        if(num == 1)
            return false;
        else if(num == 2)
            return true;
        else{
            for(int i = 2; i <= num1; i++){
                if (num % i == 0)
                    return false;
            }return true;
        }
    }

    public static boolean isPalindrome(int num){
        int length = String.valueOf(num).length();
        int [] numArray = new int[length];
        for(int i = length - 1; i >= 0; i--){
            numArray[i] = num % 10;
            num /= 10;
        }
        int iEnd = length / 2;
        for(int i = 0; i < iEnd; i++){
            if(numArray[i] != numArray[length - i - 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int i = 1;
        int num = 2;
        while(i <= 100){
            if(isPrime(num) && isPalindrome(num)){
                if(i % 10 == 0){
                    System.out.println(num);
                }else{
                    if (num<100)
                        System.out.print(num+"   \t");
                    else
                        System.out.print(num+" \t");
                }i++;
            }num++;
        }
    }
}
