package polymorphism;

import org.springframework.stereotype.Component;

/*@Component("sony")*/
public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		// TODO Auto-generated constructor stub 
		System.out.println("----->sony speaker ��ü ����");
		
	}
	
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp(){
		System.out.println("SonySpeaker---�Ҹ��ø���.");
		
	}
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown(){
		System.out.println("SonySpeaker---�Ҹ� ������.");
	}

}
