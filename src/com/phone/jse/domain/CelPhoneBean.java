package com.phone.jse.domain;

public class CelPhoneBean extends PhoneBean{
	protected String move;	

	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	@Override
	public String toString() {
		return String.format("%s 휴대폰을 가지고 %s %s 에게  전화를 겁니다",company,move,call);
	}
}
