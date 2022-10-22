package task2;

public class A extends Marks
{

    public A (int gradeChem, int gradeBio, int gradeCalc)
    {
        super(gradeChem, gradeBio, gradeCalc);
    }

    @Override
    public double getPercentage()
    {

        return ((double)(gradeChem + gradeBio + gradeCalc) / 3);
    }
}
