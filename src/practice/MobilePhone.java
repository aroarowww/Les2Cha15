package practice;

//import practice.Phone;
//import practice.Camera;

public class MobilePhone implements Phone, Camera {
	private String number;

	public MobilePhone(String number) {
		this.number = number;
	}
	@Override
	public void takePicture() {
		System.out.println("写真をとります。");
	}	
	@Override
	public void call(String number) {
		System.out.println(number + " から " + number + " に電話をかけます。");
	}
}
