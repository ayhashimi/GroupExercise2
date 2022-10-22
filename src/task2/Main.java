package task2;

public class Main
{
    public static void main(String[] args)
    {
        A studentA = new A(95, 91, 97);

        B studentB = new B(100, 94, 91, 99);

        double temp1;
        double temp2;

        System.out.println("Student A received the following grades in their classes:" +
                "\n Chem: 95 - Bio: 91 - Calc: 97\nTheir overall average is:");
        System.out.println(studentA.getPercentage());

        System.out.println("Student B received the following grades in their classes:" +
                "\n Chem: 100 - Bio: 94 - Calc: 91 - Statistics: 99\nTheir overall average is:");
        System.out.println(studentB.getPercentage());




        value = value * Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);
    }
}
