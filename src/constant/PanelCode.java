package constant;

/*
 * 각 패널명을 정의 하기 위한 이넘 클래스
 * enum : 열거형으로, 서로 연관된 상수들의 집함.
 * 열거체를 비교할때, 실제 값뿐만 아니라 타입체크도 이루어짐
 * 열거체의 상수값이 재정의 되더라도 컴파일 할 필요가 없음.
 */


public enum PanelCode {
	
	APP_BASE("appBase"),
	APP_START("appStart"),
	APP_MAIN("appMain"),
	APP_RANDOM("appRandom"),
	APP_CATEGORY("appCategory"),
	APP_RANDOM_RESULT("appRandomResult");
	
	private String value;	//이넘은 생성자를 가질 수 있음.
							//이넘의 접근제어자는 private만을 허용
	PanelCode(String value){
		this.value = value;
	}
	
	public String getValue() {	//열거형은 메소도를 가질 수 있음.
		return value;
	}

}
