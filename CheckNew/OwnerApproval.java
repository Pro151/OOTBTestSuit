

class OwnerApprove{
	
	public void ownerApproveMethod(){


		WebDriver d = new ChromeDriver();


		WebElelement taskList = driver.findElement(By.xpath("//a[@class='my-tasks-menu  msi-tooltip']"));
		taskList.click();

		WebElelement clickFirstTask = driver.findElement(By.xpath("(//a[@tabindex='-1'])[1]"));
		clickFirstTask.click();
		
		WebElelement clickOnSubmitToApprove = driver.findElement(By.xpath("//button[@id='btn-submit']"));
		clickOnSubmitToApprove.click();
		
		WebElelement clickToApproveTask = driver.findElement(By.xpath("//a[@aria-label='Approve']"));
		clickOnSubmitToApprove.click();


	}
	
	
	
	
	
	
	//======================================================================================
	
import org.testng.ITestListener;
import org.testng.ITestResult;

	public class MyCustomListener implements ITestListener {
		// Implement listener methods here
		// For example:

    @Override
    public void onTestStart(ITestResult result) {
        // This method will be invoked when a test method starts.
        System.out.println("Test started: " + result.getName());
    }

    // Implement other listener methods as needed.
}
