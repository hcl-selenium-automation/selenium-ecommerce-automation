package shoppage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class verify_AscendingPrice  extends BaseTest{

	FilterProduct filter;
	
	@Test
	public void verify_lowtoHigh() {

	    filter = new FilterProduct(DriverFactory.getDriver());

	    filter.clickFilter();
	    filter.filter_low_High();

	    List<Double> actualPrices = filter.getAllProductPrices();
	    

	    System.out.println("Actual Prices: " + actualPrices);
 
	    List<Double> sortedPrices = new ArrayList<>(actualPrices);
	    Collections.sort(sortedPrices);

	    Assert.assertEquals(actualPrices, sortedPrices);
	}
}
