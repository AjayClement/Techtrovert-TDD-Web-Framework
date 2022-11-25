package com.ttt.commonutils;


	import java.io.File;
	import java.io.FileInputStream;
	import java.util.HashMap;
	import java.util.Map.Entry;

	import com.ttt.enums.BrowserType;
	import com.ttt.runconstants.RunConstants;

	import java.util.Properties;

	public class PropertyManager {

		

		private PropertyManager() {
			
		}
		
		private static final HashMap<Object, Object> CONFIG_MAP =  new HashMap<>();
		private static final Properties properties = new Properties();
		
		static  {
				
			File objFile = new File(System.getProperty("user.dir")+RunConstants.getPropertyFilePath());
				try {
					FileInputStream propertyFile =  new FileInputStream(objFile);
					properties.load(propertyFile);
					for(Entry<Object, Object> entry : properties.entrySet()) {
						CONFIG_MAP.put(entry.getKey(), entry.getValue());
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
		}
		
			
		public static BrowserType getBrowserTypeProperty() {
		    return BrowserType.valueOf(CONFIG_MAP.get("browser").
		    		   toString().toUpperCase());
		}
		
		public static String getUrlProperty() {
			return CONFIG_MAP.get("url").toString();
		}
		
		public static int getGlobalPageWaitTimeProperty() {
			return Integer.valueOf(
					CONFIG_MAP.get("globalPageWaitTime").toString());
		}
		
		public static int getGlobalElementWaitTimeProperty() {
			return Integer.valueOf(
					CONFIG_MAP.get("globalElementWaitTime").toString());
		}
	
}
