package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//�Ｚtv ����
		/*SamsungTV tv = new SamsungTV();
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();*/
	
		/*LgTV tv = new LgTV();
		tv.turnOn();
		tv.soundUp();
		tv.soundeDown();
		tv.turnOff();
	*/
		
		/*TV tv = new SamsungTV();
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		*/
		
		// �Լ��� �ñ״�ó�� �����ؼ� �ν��Ͻ� ���� �κи��� ��ü �����ν�  ������ �ٸ� �Լ��� ���� ��ų �� �ִ�. 
		/*TV tv = new LgTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();*/
		//������ beanfactory �� �Ѵ� main method�� �ϴ� ���� �ƴϰ� 
	/*	BeanFactory beanFactory = new BeanFactory();
		TV tv =(TV)beanFactory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	*/
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		
		//Loading XML bean definitions from class path resource [applicationContext.xml]
		//GenericXmlApplicationContext@7dc5e7b4
		
		
		//samsungTV�� ���������� �̹� ��������ٴ� ���� �ϰ� �����ű���
		/*INFO : org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loading XML bean definitions from class path resource [applicationContext.xml]
				INFO : org.springframework.context.support.GenericXmlApplicationContext - Refreshing org.springframework.context.support.GenericXmlApplicationContext@7dc5e7b4: startup date [Tue Oct 26 21:20:09 KST 2021]; root of context hierarchy
				samsungTV��ü ����*/
		
		
		// configuration xml ���ϸ� �����ϸ� tv�� �ν��Ͻ� ����� �ٲ��. 
		/*TV tv =(TV) factory.getBean("TV"); 
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		
		
		factory.close(); 
		*/
		
		//init destory ��� �����̳ʰ� �����Ǿ� ��ü�� �޸𸮿� �ø� �� �� ����Ǵ� �޼ҵ带 init �̶�� �ϸ� destory method�� ��ü�� ���� ó���ϱ� ������ ���Ǵ� �Լ��� �� �Ѵ�. 
		/*samsungTV��ü ����
		��ü �ʱ�ȭ �۾� ó��
		SamsungTV----������ Ų��.
		samsungTV----�Ҹ� �ø���.
		SamsungTv----�Ҹ�������
		samsungTV-----������ ����.
		INFO : org.springframework.context.support.GenericXmlApplicationContext - Closing org.springframework.context.support.GenericXmlApplicationContext@7dc5e7b4: startup date [Tue Oct 26 21:36:00 KST 2021]; root of context hierarchy
		��ü �������� ó���� ���� ó��
	}*/ 
		
		//���� �ּҸ� �����Ͽ� ����� �ϳ��� ��ü���� ����ϴ� ���
	/*	
		TV tv =(TV) factory.getBean("TV"); 
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff(); 
		TV tv2 = tv;
		TV tv3 = tv;
		
		
		
		
		factory.close();  
		*/
		
		
		//<bean id="TV" class="polymorphism.SamsungTV" lazy-init="true" scope="singleton"></bean> ó�� ������ ������ singleton ���� ����ڿ� �ϳ��� ��ü�� ����ϴ� ���
		
		
		
		TV tv =(TV) factory.getBean("TV");  
		TV tv2 =(TV) factory.getBean("TV");
		TV tv3 =(TV) factory.getBean("TV");
	
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff(); 
	}
}
