package learn.review.chapter5;

public class PrimeNumber {
    public static void main(String[] args) {
        numOfPrime(50);
    }

    public static void numOfPrime(int NUMBER_OF_PRIMES){
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0, number = 2;
        System.out.println("The first " + NUMBER_OF_PRIMES
                + "prime numbers are \n");
        while (count < NUMBER_OF_PRIMES){
            boolean isPrime = true;
            for(int divisor = 2;divisor <= number / 2; divisor++){
                if(number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
                    System.out.println(number);
                }else{
                    System.out.print(number + "\t");
                }
            }
            number++;
        }
    }
}
