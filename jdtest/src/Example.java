import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

public class Example {

    // Mooctest Selenium Example


    // <!> Check if selenium-standalone.jar is added to build path.

    public static void test(WebDriver driver) {
        // TODO Test script
        // eg:driver.get("https://www.baidu.com/")
        // eg:driver.findElement(By.id("wd"));
    	try {
        	driver.get("https://www.jd.com/");
			Thread.sleep(2000);
        	driver.findElement(By.xpath("//*[@id=\"ttbar-mycity\"]/div[1]/span")).click();
        	driver.findElement(By.linkText("����")).click();
			Thread.sleep(1000);
        	driver.findElement(By.xpath("//*[@id=\"J_cate\"]/ul/li[14]/a[1]")).click();
        	
        	String currentWindow = driver.getWindowHandle();
        	Set<String> handles = driver.getWindowHandles();//��ȡ���д��ھ��
        	Iterator<String> it = handles.iterator();
        	while(it.hasNext()) {
        		if(currentWindow.equals(it.next())) {
        			driver.switchTo().window(it.next());//�л����´���
        			break;
        		}
        	}
    		Thread.sleep(2000);
        	driver.findElement(By.id("key")).clear();
        	driver.findElement(By.id("key")).sendKeys("�������������");
    		Thread.sleep(1000);
        	driver.findElement(By.cssSelector("#search-2014 > div > button")).click();
        	
        	handles = driver.getWindowHandles();//��ȡ���д��ھ��
        	it = handles.iterator();
        	while(it.hasNext()) {
    			driver.switchTo().window(it.next());//�л����´���
        	}
			Thread.sleep(2000);
        	driver.findElement(By.xpath("//*[@id=\"J_selector\"]/div[3]/div/div[2]/div[1]/ul/li[1]/a")).click();
        	driver.findElement(By.xpath("//*[@id=\"J_filter\"]/div[1]/div[1]/a[5]")).click();
			Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@id=\"J_filter\"]/div[1]/div[1]/a[5]")).click();
			Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@id=\"J_selectorPrice\"]/div[1]/div[1]/input")).sendKeys("35");
	    	driver.findElement(By.xpath("//*[@id=\"J_selectorPrice\"]/div[1]/div[2]/input")).sendKeys("60");
	    	driver.findElement(By.xpath("//*[@id=\"J_selectorPrice\"]/div[1]/div[2]/input")).click();
	    	driver.findElement(By.xpath("//*[@id=\"J_selectorPrice\"]/div[2]/a[2]")).click();
	    	driver.findElement(By.xpath("//*[@id=\"J_store_selector\"]/div[1]/div")).click();
			Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@id=\"J_store_selector\"]/div[2]/div[1]/a[1]")).click();
	    	driver.findElement(By.xpath("//*[@id=\"J_store_selector\"]/div[2]/div[2]/div[1]/ul/li[12]/a")).click();
			Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@id=\"J_store_selector\"]/div[2]/div[1]/a[2]")).click();
	    	driver.findElement(By.xpath("//*[@id=\"J_store_selector\"]/div[2]/div[2]/div[2]/ul/li[1]/a")).click();
			Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@id=\"J_store_selector\"]/div[2]/div[1]/a[3]")).click();
	    	driver.findElement(By.xpath("//*[@id=\"J_store_selector\"]/div[2]/div[2]/div[3]/ul/li[8]/a")).click();
			Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@id=\"J_feature\"]/ul/li[1]")).click();

			Thread.sleep(2000);
	    	List<WebElement> list = driver.findElements(By.cssSelector("div[class=p-img]"));
	    	list.get(2).click();
	    	
	    	currentWindow = driver.getWindowHandle();
        	handles = driver.getWindowHandles();//��ȡ���д��ھ��
        	it = handles.iterator();
        	while(it.hasNext()) {
        		if(currentWindow.equals(it.next())) {
        			driver.switchTo().window(it.next());//�л����´���
        			break;
        		}
        	}
    		Thread.sleep(2000);
        	driver.findElement(By.linkText("+")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id=\"InitCartUrl\"]")).click();
    		
    		handles = driver.getWindowHandles();//��ȡ���д��ھ��
        	it = handles.iterator();
        	while(it.hasNext()) {
    			driver.switchTo().window(it.next());//�л����´���
        	}
        	driver.findElement(By.xpath("//*[@id=\"GotoShoppingCart\"]")).click();

        	handles = driver.getWindowHandles();//��ȡ���д��ھ��
        	it = handles.iterator();
        	while(it.hasNext()) {
    			driver.switchTo().window(it.next());//�л����´���
        	}
    		Thread.sleep(2000);
        	driver.findElement(By.linkText("-")).click();
    		Thread.sleep(2000);
    		driver.findElements(By.className("btn-area")).get(0).click();
        			
    		Thread.sleep(10000);//��10sȥ��¼
    		handles = driver.getWindowHandles();//��ȡ���д��ھ��
        	it = handles.iterator();
        	while(it.hasNext()) {
    			driver.switchTo().window(it.next());//�л����´���
        	}
    		Thread.sleep(1000);
    		driver.findElement(By.linkText("ȥ����")).click();
    		
    		handles = driver.getWindowHandles();//��ȡ���д��ھ��
        	it = handles.iterator();
        	while(it.hasNext()) {
    			driver.switchTo().window(it.next());//�л����´���
        	}
    		Thread.sleep(1000);
    		
    		/*
    		driver.findElement(By.linkText("�����ջ���ַ")).click();
    		Thread.sleep(1000);
    		driver.switchTo().frame("dialogIframe");//�л���iframe
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//*[@id=\"jd_area\"]/div[1]/div")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id=\"jd_area\"]/div[2]/div[1]/a/em")).click();
    		driver.findElement(By.xpath("//*[@id=\"jd_area\"]/div[2]/div[2]/div[1]/ul/li[12]/a")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id=\"jd_area\"]/div[2]/div[1]/a[2]/em")).click();
    		driver.findElement(By.xpath("//*[@id=\"jd_area\"]/div[2]/div[2]/div[2]/ul/li[1]/a")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id=\"jd_area\"]/div[2]/div[1]/a[3]/em")).click();
    		driver.findElement(By.xpath("//*[@id=\"jd_area\"]/div[2]/div[2]/div[3]/ul/li[8]/a")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id=\"consignee_name\"]")).sendKeys("�ջ���");
    		driver.findElement(By.xpath("//*[@id=\"consignee_address\"]")).sendKeys("�Ͼ���ѧ");
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id=\"consignee-form\"]/div[4]/div/div/ul/li[1]/div/span[1]")).click();
    		driver.findElement(By.xpath("//*[@id=\"consignee_mobile\"]")).sendKeys("13713713711");
    		driver.findElement(By.xpath("//*[@id=\"saveConsigneeTitleDiv\"]")).click();
    		driver.switchTo().defaultContent();
    		Thread.sleep(2000);
    		*/
    		driver.findElement(By.xpath("//*[@id=\"order-submit\"]")).click();
    		
    		handles = driver.getWindowHandles();//��ȡ���д��ھ��
        	it = handles.iterator();
        	while(it.hasNext()) {
    			driver.switchTo().window(it.next());//�л����´���
        	}
    		Thread.sleep(2000);
    		driver.findElement(By.linkText("�ҵĶ���")).click();
    		
    		handles = driver.getWindowHandles();//��ȡ���д��ھ��
        	it = handles.iterator();
        	while(it.hasNext()) {
    			driver.switchTo().window(it.next());//�л����´���
        	}
    		Thread.sleep(2000);
    		driver.findElement(By.linkText("������")).click();
    		
    		handles = driver.getWindowHandles();//��ȡ���д��ھ��
        	it = handles.iterator();
        	while(it.hasNext()) {
    			driver.switchTo().window(it.next());//�л����´���
        	}
    		Thread.sleep(5000);
    		/*
    		driver.findElements(By.linkText("ȡ������")).get(0).click();
    		Thread.sleep(1000);
    		
    		driver.switchTo().frame("dialogIframe");//�л���iframe
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div")).click();
    		driver.findElement(By.linkText("�ύ")).click();
    		*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }

    public static void main(String[] args) {
        // Run main function to test your script.
        WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally {
        	driver.quit(); 
        }
    }

}
