package org.comstudy21.saram.view;

import java.util.Scanner;

import org.comstudy21.saram.R;
import org.comstudy21.saram.model.SaramVo;

public class SaramEdit extends SaramView {
	
	@Override
	public void display() {
		System.out.println("::::: 사람 정보 수정 :::::");
		
		
		while(R.type == R.SEARCH) {
			System.out.println("누구의 정보를 수정하시겠습니까 ?");
			System.out.println("수정 할 이름 >> ");
			String name = scan.next();
			R.saramVo = new SaramVo(0, name, null, null);
			break;
		}
					
		while(true) {
			System.out.print("어떤 정보를 수정할까요? 1.이름 2.번호 3.이메일");
			int select = scan.nextInt();
			if(select == 1) {
				System.out.print("새로운 이름을 입력하세요");
				String name = scan.next();
				R.saramVo.setName(name);
				break;
			} else if (select == 2) {
				System.out.print("새로운 번호 >> ");
				String phone = scan.next();
				R.saramVo.setPhone(phone);
				break;
			} else if (select == 3) {
				System.out.print("새로운 이메일 >> ");
				String email = scan.next();
				R.saramVo.setEmail(email);
				break;
			} else {
				System.out.print("잘못 입력하셨습니다. 번호를 다시 입력해주세요.\n");
						
			}
			
		}
		
	}
}
	

