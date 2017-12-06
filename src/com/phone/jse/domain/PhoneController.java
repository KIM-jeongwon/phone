package com.phone.jse.domain;

import javax.swing.JOptionPane;

public class PhoneController {
	public static void main(String[] args) {
		PhoneBean phone = null;
		CelPhoneBean celPhone = null;
		IPhoneBean iPhone = null;
		while (true) {
			switch (Integer.parseInt(JOptionPane.showInputDialog("0.종료" + "1.일반전화 " + "2.휴대폰" + "3.전화걸기"))) {
			case 0:
				JOptionPane.showMessageDialog(null, "종료합니다");
				return;
			case 1:
				// 어디제품 -> 금성 전화기
				// 누구에게겁니까?
				// [금성전화기]로, [홍길동]에게 전화를 걸다
				phone = new PhoneBean();
				phone.setCompany(JOptionPane.showInputDialog("어디 제품?"));
				phone.setCall(JOptionPane.showInputDialog("누구에게 전화를 거시겠습니까?"));
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case 2:
				celPhone = new CelPhoneBean();
				celPhone.setMove((JOptionPane.showInputDialog(
								"휴대폰 맞습니까?(맞으면 y, 틀리면 n)")
								.equals("y")) ? "이동중에": "정지중에");				
				celPhone.setCompany(JOptionPane.showInputDialog("휴대폰 종류"));
				celPhone.setCall(JOptionPane.showInputDialog("누구에게 겁니까?"));
				JOptionPane.showMessageDialog(null,celPhone.toString());
				break;
				//노키아 휴대폰을 가지고 이동하면서 홍길동에게 전화를 건다.
			case 3:
				iPhone = new IPhoneBean();
				iPhone.setData(JOptionPane.showInputDialog("보내실 문자를 입력하세요."));
				iPhone.setCall(JOptionPane.showInputDialog("누구에게 보낼 것입니까?"));
				JOptionPane.showMessageDialog(null,iPhone.toString());
				
				// 누구에게 겁니까?
				// 뭐라고 보낼까요? 
				// 이동하면서 홍길동에게 전화를 검.
				// [스마트폰]이기 떄문에 [이동]상태에서 [아이폰]으로, [홍길동]에게 [강남]이라고 전화를 걸다.
			}	//					null						null
		}
	}
}