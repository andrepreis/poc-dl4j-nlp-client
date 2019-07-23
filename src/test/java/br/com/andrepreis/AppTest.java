package br.com.andrepreis;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.andrepreis.dto.CellBrand;
import br.com.andrepreis.services.ClassifyCellPhone;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
	

	ClassifyCellPhone cellPhoneClassService ;
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName){
        super(testName);
    }


    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite(AppTest.class);
    }

    public void testApp(){        
    	
    	CellBrand marca = null;
    	 try {
    		 cellPhoneClassService = new ClassifyCellPhone();
			 marca = cellPhoneClassService.findBrandByCellDesc("Celular SmartPhone S10");
			 if(marca == null) {
				 assertFalse(true);
			 }else {
				 assertTrue(true);
			 }
		} catch (Exception e) {			
			e.printStackTrace();
			assertFalse(true);
		}    	    	
    }
}
