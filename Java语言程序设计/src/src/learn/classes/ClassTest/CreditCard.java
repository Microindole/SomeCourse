package learn.classes.ClassTest;

public class CreditCard {

    private String cardNumber;

    CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    int [] getDigits() {
        int [] digits = new int[cardNumber.length()];
        for (int i = 0; i < cardNumber.length(); i++) {
            digits[i] = Character.getNumericValue(cardNumber.charAt(i));
        }
        return digits;
    }

    int getSumNumbers(int [] digits) {
        int sum = 0;
        int[] doubleDigit = new int [digits.length];
        for(int i = 0;i<digits.length;i++){
            int newNumber = digits[i];
            if(newNumber>9){
                newNumber = newNumber/10 + newNumber%10;
            }
            doubleDigit[i] = newNumber;
        }
        for(int i = 0;i<doubleDigit.length;i++){
            sum += doubleDigit[i];
        }
        return sum;
    }



    boolean isValid() {
        return true;
    }


}
