package org.comstudy21.saram.controller;

import org.comstudy21.saram.R;
import org.comstudy21.saram.ViewContainer;
import org.comstudy21.saram.model.SaramDao;

public class SaramController {
	private ViewContainer vc = new ViewContainer();
	private SaramDao dao = new SaramDao();
	public void action() {
		System.out.println(">>>> SaramController 실행 ...");
		if(R.no == 0) {
			vc.run(R.menuView); // 동적 바인딩 처리된다.
		}
		
		switch(R.no) {
		case 1 :
			vc.run(R.insertView);
			dao.insert(R.saramVo);
			break;
		case 2 : 
			R.saramArr = dao.selectAll();
			vc.run(R.saramListView); 
			break;
		case 3 : 
			R.type = R.SEARCH;
			vc.run(R.saramDetail); 
			R.type = R.DEDAIL;
			R.saramVo = dao.selectOne(R.saramVo);
			vc.run(R.saramDetail);
			break;
		case 4 : 
			R.type = R.SEARCH;
			vc.run(R.saramDetail);
			R.saramVo = dao.selectOne(R.saramVo);
			R.type = R.DEDAIL;
			dao.update(R.saramVo);
			vc.run(R.saramEdit);
			break;
		case 5 : 
			R.type = R.SEARCH;
			vc.run(R.saramDelete); 
			R.saramVo = dao.selectOne(R.saramVo);
			R.type = R.DEDAIL;
			dao.delete(R.saramVo);
			dao.update(R.saramVo);
			
			break;
		case 6 :
			System.out.println("프로그램 종료");
			System.exit(0);
			break;
		default :
			System.out.println("해당 기능이 없습니다!");
		
		}
		// 재귀 호출
		R.no = 0;
		action();
	}
}
