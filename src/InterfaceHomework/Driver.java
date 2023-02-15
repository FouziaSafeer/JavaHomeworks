package InterfaceHomework;
interface WebDriver{
     void openBrowser();
   void closeBrowser();
   void maximizeWindow();
   void findElement();
}
public class Driver {
    public static void main(String[] args) {
        WebDriver[] webDrivers={new ChromeDriver(),new FirefoxDriver()};
        for (WebDriver wd:webDrivers) {
            wd.openBrowser();
            wd.maximizeWindow();
            wd.findElement();
            wd.closeBrowser();

        }

    }
    /*Create a WebDriver Interface that will have the following unimplemented behaviour:
     openBrowser(), closeBrowser(), maximizeWindow(), findElement().
     Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.*/
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Chrome browser open");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome browser close");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome browser maximize");

    }

    @Override
    public void findElement() {
        System.out.println("Chrome browser find element");

    }
}
class FirefoxDriver implements WebDriver{


    @Override
    public void openBrowser() {
        System.out.println("Firefox browser open");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox browser close");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Firefox browser maximize");

    }

    @Override
    public void findElement() {
        System.out.println("Firefox browser find element");

    }
}
