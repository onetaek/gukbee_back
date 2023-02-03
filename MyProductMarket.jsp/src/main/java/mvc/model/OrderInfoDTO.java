package mvc.model;

import java.util.Date;

public class OrderInfoDTO {
	private String orderNo;//주문 번호
	private String memberId;//주문자 아이디
	private String orderName;//주문자 이름
	private String orderTel;//주문자 전화번호
	private String orderEmail;//주문자 이메일
	
	private String receiveName;//받는이 이름
	private String receiveTel;//받는이 전화번호
	private String receieAddress;//받는이 주소

	private String payMethod;//결제 방법 선택
	private String carryNo;//운반 번호
	private String orderSteop;//주문 단계 
	
	private Date dateOrder;//주문 일
	private Date datePay;//입금 일
	private Date dataCarry;//배송 일
	private Date dateDone;//배송 완료 일
}
