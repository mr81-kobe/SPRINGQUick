/*package polymorphism;

public class SamsungTV {

	public SamsungTV() {
		// TODO Auto-generated constructor stub
	}
	
	public void powerOn(){
		
		System.out.println("SamsungTV----������ Ų��.");
	}

	public void powerOff(){
		System.out.println("samsungTV-----������ ����.");
		
	}
	
	public void volumeUp(){
		
		System.out.println("samsungTV----�Ҹ� �ø���.");
		
	}

	public void volumeDown(){
		
		System.out.println("SamsungTv----�Ҹ�������");
	}
}
*/

/*package polymorphism;

public class SamsungTV implements TV{
	
	
	public void initMethod(){
		System.out.println("��ü �ʱ�ȭ �۾� ó��");
	}
	public SamsungTV() {
		// TODO Auto-generated constructor stub
		System.out.println("samsungTV��ü ����");
	}
	@Override
	public void powerOn(){
		
		System.out.println("SamsungTV----������ Ų��.");
	}
	@Override
	public void powerOff(){
		System.out.println("samsungTV-----������ ����.");
		
	}
	@Override
	public void volumeUp(){
		
		System.out.println("samsungTV----�Ҹ� �ø���.");
		
	}
	@Override
	public void volumeDown(){
		
		System.out.println("SamsungTv----�Ҹ�������");
	}
	
	public void destroyMethod(){
		System.out.println("��ü �������� ó���� ���� ó��");
	}*/

/*package polymorphism;

public class SamsungTV implements TV{
	
	private SonySpeaker speaker;
	public void initMethod(){
		System.out.println("��ü �ʱ�ȭ �۾� ó��");
	}
	public SamsungTV() {
		// TODO Auto-generated constructor stub
		System.out.println("samsungTV��ü ����");
	}
	@Override
	public void powerOn(){
		
		System.out.println("SamsungTV----������ Ų��.");
	}
	@Override
	public void powerOff(){
		System.out.println("samsungTV-----������ ����.");
		
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
		System.out.println("��ü �������� ó���� ���� ó��");
	}*/

package polymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;

	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��");
	}

	// �⺻������ ���� �Ű������� �ִ� ������
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("---->�Ｚtv ��ü����2");
		this.speaker = speaker;
		this.price = price;
	}

	public SamsungTV() {
		// TODO Auto-generated constructor stub
		System.out.println("samsungTV��ü ����");
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void powerOn() {

		System.out.println("SamsungTV----������ Ų��. ������" + price);
	}

	@Override
	public void powerOff() {
		System.out.println("samsungTV-----������ ����.");

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
		System.out.println("��ü �������� ó���� ���� ó��");
	}
}
