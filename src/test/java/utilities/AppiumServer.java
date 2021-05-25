package utilities;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServer {
	
	public static AppiumDriverLocalService service;
	
	public static void start(){
		
		//AppiumServiceBuilder builder = new AppiumServiceBuilder().usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"));
		//builder.withAppiumJS(new File("C:\\Users\\cuongbv5\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"));
		//builder.usingAnyFreePort();
		 service = AppiumDriverLocalService.buildDefaultService();
				service.start();
				
	}
	
	
	public static void stop(){
		
		service.stop();
		
	}

}
