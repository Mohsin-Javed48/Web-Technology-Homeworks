import java.lang.*;

class task3{
    static double totalAnnualPay(double payAmount, int payPeriod, double annualPay){

        annualPay = payAmount * payPeriod;
        return annualPay;
    }
    
    public static void main(String[] args){
        
        double payAmount = 2000.0;
        int payPeriod  = 12;
        double annualPay = 0;

        System.out.println(totalAnnualPay(payAmount,payPeriod,annualPay));

    
    }
}
