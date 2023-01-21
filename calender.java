package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class calender {

	public static void select_month(WebDriver Driver, By cal_select_locator, By month_year_locator, String m_year ,By next_Button_locator) {
		//Click on calender
		wait.clickable(Driver,cal_select_locator);
		//Select month and year from calender
		while (true) {
		String month_year =	wait.visible(Driver, month_year_locator).getText();
			if (month_year.equalsIgnoreCase(m_year))
			{
			   break;
			}
			else
			{
				System.out.println("Desired value of month&year is not found ,hence clicking on next Button");
				wait.clickable(Driver, next_Button_locator);
			}
		}
	}

	public static void select_date(WebDriver driver, By xpath, By xpath2, String string) {
		// TODO Auto-generated method stub
		
	}
}
