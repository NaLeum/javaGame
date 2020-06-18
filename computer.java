package Four;

public class computer {

	static boolean cpu=false;
	static boolean mb=false;
	static boolean gpu=false;
	static boolean ram=false;
	static boolean power=false;
	static boolean toong=false;
	static boolean ssd=false;
	
	public computer() {
		System.out.println("_________________________");
		System.out.println();
		if(cpu==true) {
			System.out.println("cpu : 보유중");
		}else {
			System.out.println("cpu : ");
		}
		if(mb==true) {
			System.out.println("메인보드 : 보유중");
		}else {
			System.out.println("메인보드 : ");
		}
		if(gpu==true) {
			System.out.println("그래픽카드 : 보유중");
		}else {
			System.out.println("그래픽카드 : ");
		}
		if(ram==true) {
			System.out.println("Ram : 보유중");
		}else {
			System.out.println("Ram : ");
		}
		if(ssd==true) {
			System.out.println("하드디스크 : 보유중");
		}else {
			System.out.println("하드디스크 : ");
		}
		if(power==true) {
			System.out.println("파워서플라이 : 보유중");
		}else {
			System.out.println("파워서플라이 : ");
		}
		if(toong==true) {
			System.out.println("케이스 : 보유중");
		}else {
			System.out.println("케이스 : ");
		}
		System.out.println();
		System.out.println("_______________________");
		System.out.println();
	}
	
	
	
}
