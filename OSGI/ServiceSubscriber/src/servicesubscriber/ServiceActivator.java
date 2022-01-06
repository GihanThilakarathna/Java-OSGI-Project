package servicesubscriber;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import servicepublisher.ServicePublish;

public class ServiceActivator implements BundleActivator {

	ServiceReference serviceReference;
	
	public void start(BundleContext context) throws Exception {

		System.out.println(" Subscriber Start");

		
		serviceReference = context.getServiceReference(ServicePublish.class.getName());

		ServicePublish servicePublish = (ServicePublish) context.getService(serviceReference);
	
		new Calculator(servicePublish);
	}

	public void stop(BundleContext context) throws Exception {

		System.out.println("client stopped");

		context.ungetService(serviceReference);

	}

}
