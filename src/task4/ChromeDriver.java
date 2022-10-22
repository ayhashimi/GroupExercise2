package task4;

public class ChromeDriver implements RemoteWebDriver
{
    @Override
    public void navigate()
    {
        System.out.println("Test navigate method");
    }

    @Override
    public void getScreenshot()
    {
        System.out.println("Test getScreenshot method");
    }

    @Override
    public void open()
    {
        System.out.println("Test open method");
    }

    @Override
    public void close()
    {
        System.out.println("Test close method");
    }

    @Override
    public String getTitle()
    {
        return "Chrome";
    }
}
