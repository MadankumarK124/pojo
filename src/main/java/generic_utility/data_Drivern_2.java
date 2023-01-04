package generic_utility;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_Drivern_2 {
@DataProvider
public Object[][] provider() throws Throwable
{
	excelUtility elib = new excelUtility();
	Object[][] data = elib.excelData(null);
	return data;
}

@Test(dataProvider = "provider")
public void getdata()
{
	
}
}