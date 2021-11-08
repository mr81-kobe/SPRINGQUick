package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//삼성tv 실행
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
		
		// 함수의 시그니처를 강제해서 인스턴스 생성 부분만을 교체 함으로써  간단히 다른 함수를 실행 시킬 수 있다. 
		/*TV tv = new LgTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();*/
		//생성은 beanfactory 가 한다 main method가 하는 것이 아니고 
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
		
		
		//samsungTV를 쓰기전에도 이미 만들어진다는 말을 하고 싶은거구나
		/*INFO : org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loading XML bean definitions from class path resource [applicationContext.xml]
				INFO : org.springframework.context.support.GenericXmlApplicationContext - Refreshing org.springframework.context.support.GenericXmlApplicationContext@7dc5e7b4: startup date [Tue Oct 26 21:20:09 KST 2021]; root of context hierarchy
				samsungTV객체 생성*/
		
		
		// configuration xml 파일만 수정하면 tv의 인스턴스 대상이 바뀐다. 
		/*TV tv =(TV) factory.getBean("TV"); 
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		
		
		factory.close(); 
		*/
		
		//init destory 출력 컨테이너가 생성되어 객체를 메모리에 올린 직 후 실행되는 메소드를 init 이라고 하며 destory method는 객체를 삭제 처리하기 직전에 사용되는 함수를 말 한다. 
		/*samsungTV객체 생성
		객체 초기화 작업 처리
		SamsungTV----전원을 킨다.
		samsungTV----소리 올린다.
		SamsungTv----소리내린다
		samsungTV-----전원을 끈다.
		INFO : org.springframework.context.support.GenericXmlApplicationContext - Closing org.springframework.context.support.GenericXmlApplicationContext@7dc5e7b4: startup date [Tue Oct 26 21:36:00 KST 2021]; root of context hierarchy
		객체 삭제전에 처리할 로직 처리
	}*/ 
		
		//같은 주소를 복사하여 사용해 하나의 객체만을 사용하는 방법
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
		
		
		//<bean id="TV" class="polymorphism.SamsungTV" lazy-init="true" scope="singleton"></bean> 처럼 스코프 설정을 singleton 으로 맞춘뒤에 하나의 객체만 사용하는 방법
		
		
		
		TV tv =(TV) factory.getBean("TV");  
		TV tv2 =(TV) factory.getBean("TV");
		TV tv3 =(TV) factory.getBean("TV");
	
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff(); 
	}
}
