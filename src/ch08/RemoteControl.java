package ch08;

// 인터페이스가 가질수 있는 멤버는 정적멤버(상수, 정적메서드), 추상메서드, 디폴트메서드임
public interface RemoteControl {
	// 자동으로 final static 키워드가 적용됨
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	
	// abstract 키워드를 빼도 상관없음
	// 인터페이스가 가질수 있는 메서드는 추상 메서드밖에 없기 때문에
	// 자동으로 abstract 키워드가 적용됨
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	public default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다");
		}
		else {
			System.out.println("무음 해제합니다");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
	
}