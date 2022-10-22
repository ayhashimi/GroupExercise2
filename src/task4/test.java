package task4;

public class test
{
    public static void main(String[] args)
    {
        ChromeDriver cDriver = new ChromeDriver();
        FirefoxDriver fDriver = new FirefoxDriver();
        SafariDriver sDriver = new SafariDriver();

        System.out.println(cDriver.getTitle());
        cDriver.open();
        cDriver.navigate();
        cDriver.getScreenshot();
        cDriver.close();
        System.out.println();

        System.out.println(fDriver.getTitle());
        fDriver.open();
        fDriver.navigate();
        fDriver.getScreenshot();
        fDriver.close();
        System.out.println();

        System.out.println(sDriver.getTitle());
        sDriver.open();
        sDriver.navigate();
        sDriver.getScreenshot();
        sDriver.close();
    }
}
