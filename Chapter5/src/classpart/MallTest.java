package classpart;

public class MallTest {
	public static void main(String[]args) {
		
		Mall mall = new Mall();
		
		mall.ordernumber = 201907210001L;
		mall.ID = "abc123";
		mall.Date = "2019년 7월 21일";
		mall.name = "이호준";
		mall.packnumber = "PD0345-12";
		mall.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + mall.ordernumber);
		System.out.println("주문자 아이디 : " + mall.ID);
		System.out.println("주문 날짜 : " + mall.Date);
		System.out.println("주문자 이름 : " + mall.name);
		System.out.println("주문 상품 번호 : " + mall.packnumber);
		System.out.println("배송 주소 : " + mall.address);
		
	}

}