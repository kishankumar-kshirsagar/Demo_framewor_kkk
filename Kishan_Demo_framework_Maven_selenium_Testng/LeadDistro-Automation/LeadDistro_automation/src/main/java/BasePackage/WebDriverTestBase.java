package BasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.io.IOException;

public abstract class WebDriverTestBase {

    public abstract void scrollPageOnview(WebDriver driver,WebElement element);

 //   public abstract void expWait(By data);

  //  public abstract void verifyToastMessage(By actualToastMessageXpath, String expToastMessage);

  //  public abstract void clickJavaScriptExecutor(WebElement element);

  //  public abstract void clickOnLinkOrButton(By by);

   // public abstract void clearTextBox(By by);

   // public abstract void waitForLoadingIconDisappear() throws InterruptedException, IOException;

  //  public abstract String getText(By by);

  //  public abstract void imageUpload(String fileName) throws AWTException;

    public abstract String readProperties(String proPath, String proData) throws IOException;

  //  public abstract void pause(long timeout);

  //  public abstract String createXpath(String xpathExp, Object... args);

  //  public abstract int splitString(String countOnUser, String splitParam, int index);

   // public abstract void selectDropdown(By expandDropdown, By selectValue);

   // public abstract void scrollUpPage();

  //  public abstract void waitForLoadingIconDisappearIOT() throws IOException, InterruptedException;
    
    
}
