package shoppage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverFactory;

public class verify_DescendingPrice {
	
	  FilterProduct filter;
	
	@Test
	public void verify_HightoLow() {

	    filter = new FilterProduct(DriverFactory.getDriver());

	    filter.clickFilter();
	    filter.filter_high_Low();

	    List<Double> actualPrices = filter.getAllProductPrices();
	    

	    System.out.println("Actual Prices: " + actualPrices);
 
	    List<Double> sortedPrices = new ArrayList<>(actualPrices);
	    Collections.sort(sortedPrices, Collections.reverseOrder());

	    Assert.assertEquals(actualPrices, sortedPrices);
	}

}
