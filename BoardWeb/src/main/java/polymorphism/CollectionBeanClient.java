package polymorphism;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean collectionBean = (CollectionBean) factory.getBean("collectionBean"); 
		List<String> list= collectionBean.getAddressList();
		
		for(String word: list){
			
			System.out.println(word);
			
		}
		factory.close();
	}

}
