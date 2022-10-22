package task2;

import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        A studentA = new A(95, 91, 97);

        B studentB = new B(100, 94, 91, 99);

        double temp1 = studentA.getPercentage();
        double temp2 = studentB.getPercentage();

        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println("Student A received the following grades in their classes:" +
                "\n Chem: 95 - Bio: 91 - Calc: 97\nTheir overall average is:");
        System.out.println(df.format(temp1));

        System.out.println("Student B received the following grades in their classes:" +
                "\n Chem: 100 - Bio: 94 - Calc: 91 - Statistics: 99\nTheir overall average is:");
        System.out.println(df.format(temp2));

    }
}
