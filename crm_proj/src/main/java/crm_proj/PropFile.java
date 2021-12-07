package crm_proj;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropFile {
	public String readDataFromProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\noahl\\git\\crm_project\\crm_proj\\common.properties.txt");
		Properties pf=new Properties();
		pf.load(fis);
		String value = pf.getProperty(key);
		return value;
		
	}
}
