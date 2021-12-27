package org.comstudy21.saram.view;

import org.comstudy21.saram.R;
import org.comstudy21.saram.model.SaramVo;

public class SaramDelete extends SaramView {
	@Override
	public void display() {
		System.out.println("::::: 사람 정보 삭제 :::::");
		
		if(R.type == R.SEARCH) {
			System.out.println("누구의 정보를 삭제하시겠습니까 ?");
			System.out.println("삭제 할 이름 >> ");
			String name = scan.next();
			R.saramVo = new SaramVo(0, name, null, null);
			
		}
		
		
		
	}
}
