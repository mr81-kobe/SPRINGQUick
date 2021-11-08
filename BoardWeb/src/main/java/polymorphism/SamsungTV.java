/*package polymorphism;

public class SamsungTV {

	public SamsungTV() {
		// TODO Auto-generated constructor stub
	}
	
	public void powerOn(){
		
		System.out.println("SamsungTV----전원을 킨다.");
	}

	public void powerOff(){
		System.out.println("samsungTV-----전원을 끈다.");
		
	}
	
	public void volumeUp(){
		
		System.out.println("samsungTV----소리 올린다.");
		
	}

	public void volumeDown(){
		
		System.out.println("SamsungTv----소리내린다");
	}
}
*/

/*package polymorphism;

public class SamsungTV implements TV{
	
	
	public void initMethod(){
		System.out.println("객체 초기화 작업 처리");
	}
	public SamsungTV() {
		// TODO Auto-generated constructor stub
		System.out.println("samsungTV객체 생성");
	}
	@Override
	public void powerOn(){
		
		System.out.println("SamsungTV----전원을 킨다.");
	}
	@Override
	public void powerOff(){
		System.out.println("samsungTV-----전원을 끈다.");
		
	}
	@Override
	public void volumeUp(){
		
		System.out.println("samsungTV----소리 올린다.");
		
	}
	@Override
	public void volumeDown(){
		
		System.out.println("SamsungTv----소리내린다");
	}
	
	public void destroyMethod(){
		System.out.println("객체 삭제전에 처리할 로직 처리");
	}*/

/*package polymorphism;

public class SamsungTV implements TV{
	
	private SonySpeaker speaker;
	public void initMethod(){
		System.out.println("객체 초기화 작업 처리");
	}
	public SamsungTV() {
		// TODO Auto-generated constructor stub
		System.out.println("samsungTV객체 생성");
	}
	@Override
	public void powerOn(){
		
		System.out.println("SamsungTV----전원을 킨다.");
	}
	@Override
	public void powerOff(){
		System.out.println("samsungTV-----전원을 끈다.");
		
	}
	@Override
	public void volumeUp(){
		speaker= new SonySpeaker();
		speaker.volumeUp();
	
		
	}
	@Override
	public void volumeDown(){
		speaker= new SonySpeaker();
		speaker.volumeDown();
	}
	
	public void destroyMethod(){
		System.out.println("객체 삭제전에 처리할 로직 처리");
	}*/

package polymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;

	public void initMethod() {
		System.out.println("객체 초기화 작업 처리");
	}

	// 기본생성자 말구 매개변수가 있는 생성자
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("---->삼성tv 객체생성2");
		this.speaker = speaker;
		this.price = price;
	}

	public SamsungTV() {
		// TODO Auto-generated constructor stub
		System.out.println("samsungTV객체 생성");
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void powerOn() {

		System.out.println("SamsungTV----전원을 킨다. 가격은" + price);
	}

	@Override
	public void powerOff() {
		System.out.println("samsungTV-----전원을 끈다.");

	}

	@Override
	public void volumeUp() {

		speaker.volumeUp();

	}

	@Override
	public void volumeDown() {

		speaker.volumeDown();
	}

	public void destroyMethod() {
		System.out.println("객체 삭제전에 처리할 로직 처리");
	}
}
