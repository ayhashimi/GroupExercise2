package task2;

public abstract class Marks
{
    int gradeChem;
    int gradeBio;
    int gradeCalc;

    public Marks (int gradeChem, int gradeBio, int gradeCalc)
    {
        this.gradeChem = gradeChem;
        this.gradeBio = gradeBio;
        this.gradeCalc = gradeCalc;

    }

    abstract public double getPercentage();
}
