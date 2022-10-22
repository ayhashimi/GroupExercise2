package task4;

public class test
{
    public static void main(String[] args)
    {
        RemoteWebDriver [] array = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

        for (RemoteWebDriver temp : array)
        {
            System.out.println(temp.getTitle());
            temp.open();
            temp.navigate();
            temp.getScreenshot();
            temp.close();
            System.out.println();
        }
    }
}













/*

interface calculator
{

    long valueOfE =  <insert value of E here>;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    double divide(int num1, int num2);
    int multiplication(int num1, int num2);

}

interface programmingCalc
{
    String convertToBinary(int num);
}








abstract class calculator
{
    final double valueOfE =  2.17243534152435353425;
    //more constants...

    abstract int add(int num1, int num2);
    abstract int substract(int num1, int num2);
    abstract int divide(int num1, int num2);
    abstract int multiply(int num1, int num2);

    void display(int value)
    {
        //work inside of methods = implementation
        System.out.println(value);
    }
}





*/





