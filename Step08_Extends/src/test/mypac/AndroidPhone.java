package test.mypac;

public class AndroidPhone extends HandPhone {
	public AndroidPhone() {
		System.out.println("AndroidPhone 생성자 호출됨");
	}
	
	//메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	//메소드
	public void showPlatform() {
		System.out.println("안드로이드 운영체제 입니다.");
	}
	
	// 아래의 @Override 는 해당 메소드가 재정의(부모 메소드) 되었다고 단순히 표시하는 용도이며 특별한 기능을 가지지는 않는다.
	// HandPhone 타입으로 받아도 재정의 됐기때문에 재정의된걸로 출력됨
	@Override 
	public void takePicture() {
		super.takePicture(); //부모 클래스 메소드 그대로 호출
		System.out.println("1000 만 화소의 사진을 찍어요!"); //새로운걸로 호출
	}
}
