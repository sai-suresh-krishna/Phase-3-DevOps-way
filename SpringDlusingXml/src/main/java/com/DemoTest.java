package com;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class DemoTest {
	public static void main(String [] args) {

		//Employee emp1=new Employee();
		//emp1.display();
		
		Resource rs=new ClassPathResource("beans.xml");
        BeanFactory bb=new XmlBeanFactory(rs);
		Employee emp1 =(Employee)bb.getBean("emp1");
		emp1.display();
		
		Employee emp3 =(Employee)bb.getBean("emp1");
		emp3.display();
		
		Employee emp2 =(Employee)bb.getBean("emp2");
		emp2.display();
		
		Employee emp4 =(Employee)bb.getBean("emp2");
		emp4.display();
	}
}
