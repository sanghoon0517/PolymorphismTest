
//general한 객체
class 요리사 {
	String name = "요리사";
	String job = "요리사";
}

//specific한 객체
//상속을 받고 메모리에 띄우면 부모의 객체도 같이 메모리에 뜬다.
//홍길동 인스턴스를 생성하면 요리사의 인스턴스 역시 같이 heap메모리 영역에 뜬다.
//단 요리사 인스턴스를 생성한다고 홍길동의 인스턴스가 같이 뜨는 것은 아니다. 
//(이건 요리사 인스턴스를 띄웠다고, 모든 특정 요리사의 인스턴스가 전부 띄워진다는 논리와 같다.)
class 홍길동 extends 요리사 {
	String name = "홍길동";
}

public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//홍길동 인스턴스를 생성하면 "홍길동"과 "요리사" 객체가 동시에 같이 뜬다.
		//홍길동 객체가 요리사 객체를 상속받았기 때문에
		홍길동 h = new 홍길동();
		요리사 y = new 홍길동(); //요리사 객체에도 홍길동의 인스턴스를 띄울 수 있다.
		
		//요리사 인스턴스를 생성하면 "요리사"만 heap 메모리에 띄워지기 때문에, 다른 객체를 인스턴스로 생성할 수 없다.
		요리사 y2 = new 요리사();
		//홍길동 h2 = new 요리사(); //heap메모리에 요리사 객체만 띄워지므로, 홍길동 객체에 요리사 인스턴스를 생성할 수는 없다.
		
	}

}
