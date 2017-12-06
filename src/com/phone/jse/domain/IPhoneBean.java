package com.phone.jse.domain;

public class IPhoneBean extends CelPhoneBean{
	protected String data;
	private final static String KIND = "스마트폰 "
								,BRAND = "아이폰";
	public void setData(String data) {
		setMove("이동중");
		this.data = data;
		
	}
	public String getData() {
		return data;
	}
	@Override
	public String toString() {
	
		return String.format("%s 이기때문에  %s 상태에서  %s 으로  %s 에게  %s 라고 보냄",
								KIND, move,BRAND,call,data);
	}
	//[스마트폰]이기 떄문에 [이동]상태에서 [ 아이폰]으로 [홍길동]에게
	//[안녕]이라고 문자를 보냄
}
