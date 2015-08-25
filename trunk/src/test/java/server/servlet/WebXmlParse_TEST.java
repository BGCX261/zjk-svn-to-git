/**
 * 
 */
package server.servlet;

import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.UnmarshallerHandler;

import org.glassfish.grizzly.servlet.ver25.ObjectFactory;
import org.glassfish.grizzly.servlet.ver25.WebAppType;

/**
 * @author ytsai1
 *
 */
public class WebXmlParse_TEST {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		String webXmlDir = "C:\\Documents and Settings\\ytsai1\\workspace_personal\\servlet\\WebContent\\WEB-INF\\web.xml";
		
		String packageName = ObjectFactory.class.getPackage().getName();
		JAXBContext jaxbContext = JAXBContext.newInstance(packageName);
		
		
		
		
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		
		JAXBElement<WebAppType> ele = (JAXBElement<WebAppType>) unmarshaller.unmarshal(new FileInputStream(webXmlDir));
		
		
		
		UnmarshallerHandler handler = unmarshaller.getUnmarshallerHandler();
		
		WebAppType webAppType = ele.getValue();
		
		List<JAXBElement<?>> descIconEles = webAppType.getDescriptionAndDisplayNameAndIcon();
		for(JAXBElement<?> tempEle : descIconEles){
			tempEle.getValue();
		}
		
		
//		javax.xml.bind.helpers.
//		webAppType.
//		print(ele);
		System.out.println("finished Successfully, obj:");
	}
	
	
	
	private static void print(JAXBElement ele){
		System.out.println();
		System.out.println("Name: "+ele.getName());
		System.out.println("scope: "+ele.getScope());
		System.out.println("DeclaredType: "+ele.getDeclaredType());
		System.out.println("Value: "+ele.getValue());
		
		
	}

}
