/*package polymorphism;

public class LgTV {

	public LgTV() {
		// TODO Auto-generated constructor stub
	}
	public void turnOn(){
		System.out.println("LgTV----������ Ų��.");
		
		
	}
	public void turnOff(){
		
		System.out.println("LgTV------������ ����.");
		
	}
	public void soundUp(){
		System.out.println("LgTV------�Ҹ��� �ø���.");	
		
	}
	public void soundeDown(){
		System.out.println("LgTV-----�Ҹ��� ���δ�.");
	}
}
*/

package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("TV")

public class LgTV implements TV {

	public LgTV() {
		// TODO Auto-generated constructor stub
	}

	/*@Autowired
	@Qualifier("apple")*/ 
	/*@Resource(name="apple")*/
	@Autowired
	private Speaker speaker;

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV----������ Ų��.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub

		System.out.println("LgTV------������ ����.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		speaker.volumeDown();
	}
}
