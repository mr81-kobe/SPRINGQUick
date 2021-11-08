package polymorphism;

import org.springframework.stereotype.Component;
/*
@Component("apple")*/
public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("¾ÖÇÃ º¼·ý UP");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("¾ÖÇÃ º¼·ý´Ù¿î");
	}

}
