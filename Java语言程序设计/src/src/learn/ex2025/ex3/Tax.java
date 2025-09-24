package learn.ex2025.ex3;

public class Tax {
    final int SINGLE_FILER = 0;
    final int MARRIED_JOINTLY = 1;
    final int MARRIED_SEPARATEL14Y = 2;
    final int HEAD_OF_HOUSEHOLD = 3;

    private final int [][] brackets = {
            {0, 27050,65550, 136750, 297350},
            {0, 45200, 109250, 166500, 297350},
            {0, 22600, 54625, 83250, 148675},
            {0, 36250, 93650, 151650, 297350}
    };
    private final double [] rates = {
            0.15, 0.275, 0.305, 0.355, 0.391
    };

    private int filingStatus;
    private double taxableIncome;
    private double tax;

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public void setTax() {
        // 要计算税额
        int bracketIndex = 0;
        double tax = 0;
        while((taxableIncome - brackets[filingStatus][bracketIndex + 1] > 0) && bracketIndex < 4){
            tax += (brackets[filingStatus][bracketIndex + 1]
                    - brackets[filingStatus][bracketIndex]) * rates[bracketIndex];
            bracketIndex++;
        }
        tax += (taxableIncome - brackets[filingStatus][bracketIndex]) * rates[bracketIndex];
        this.tax = tax;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public double getTax() {
        return tax;
    }



}
