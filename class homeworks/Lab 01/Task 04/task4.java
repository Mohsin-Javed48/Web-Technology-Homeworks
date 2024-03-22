import java.lang.*;

class task4{
    static double customer_one_more(int customer)
    {
        return (customer * 14)/100;
    }
    static double customer_citrus_flavored(int customer)
    {
        return (customer * 64)/100;
    }
    public static void main(String args[])
    {
        int customer = 12467;
        System.err.println(customer_one_more(customer));
        System.err.println(customer_citrus_flavored(customer));

    }
}