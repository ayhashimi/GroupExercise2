package task2;

public class B extends Marks
{
    int gradeStat;

    public B (int gradeChem, int gradeBio, int gradeCalc, int gradeStat)
    {
        super(gradeChem, gradeBio, gradeCalc);
        this.gradeStat = gradeStat;

    }

    @Override
    public double getPercentage()
    {
        return ((double)(gradeChem + gradeBio + gradeCalc + gradeStat) / 4);
    }
}
