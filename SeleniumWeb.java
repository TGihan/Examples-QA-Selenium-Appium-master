System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		ChromeDriver chromeDriver =new ChromeDriver();
		chromeDriver.get("http://www.slt.lk");
		
//		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame().close();
		chromeDriver.quit();