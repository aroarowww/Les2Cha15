package practice;

//import practice.Phone;
//import practice.Flying;

public class FlyingPhone implements Phone, Flying {
	// プログラムを作成
	private int minutes;
	public FlyingPhone(int minutes) {
		this.minutes = minutes;
	}
	@Override
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}
	@Override
	public void fly() {
		System.out.println(minutes + "分間、飛びます。");
	}
	@Override
	public void powerOff() {
		Flying.super.powerOff();
	}
}
