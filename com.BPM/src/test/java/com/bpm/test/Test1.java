package com.bpm.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bpm.base.BaseFramework;
import com.bpm.pageactions.BPMHomeActions;

public class Test1 {

	@Test
	public void testApi() throws FileNotFoundException, IOException {
		
		WebDriver dirver = null;
		BaseFramework base = new BaseFramework();
		base.loadconfig();
		BPMHomeActions home = new BPMHomeActions(dirver);
		home.postNewPurchase();
		
	}
	
}
