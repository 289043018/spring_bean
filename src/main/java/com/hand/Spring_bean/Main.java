package com.hand.Spring_bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	Resource r =new FileSystemResource("spring-bean.xml");
    	BeanFactory beanFactory = new XmlBeanFactory(r);
//       BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-bean.xml");
       Boss boss1=beanFactory.getBean("boss1", Boss.class);
       Boss boss2=beanFactory.getBean("boss2", Boss.class);
       Boss boss3=beanFactory.getBean("boss3", Boss.class);
       System.out.println(boss1.getCar());
       System.out.println(boss2.getCar());
       System.out.println(boss3.getCar());
    }
}
