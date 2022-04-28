package id.artifact.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class LCAppInit  implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("delhi>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// TODO Auto-generated method stub
//		XmlWebApplicationContext webCtx = new XmlWebApplicationContext();
//		webCtx.setConfigLocation("classpath:configXYZ.xml");
//		
		
		AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
		webAppContext.register(LCAppInit.class);
		
		DispatcherServlet dS = new DispatcherServlet(webCtx);
		ServletRegistration.Dynamic myCustomDS =  servletContext.addServlet("dad" , dS);
		myCustomDS.setLoadOnStartup(1);
		myCustomDS.addMapping("/home.com/*");
		*/
	}

}
