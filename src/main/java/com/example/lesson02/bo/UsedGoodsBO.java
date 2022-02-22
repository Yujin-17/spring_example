package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.dao.UsedGoodsDAO;
import com.example.lesson02.model.UsedGoods;

@Service
public class UsedGoodsBO {
	
	@Autowired	// DI(Dependency Injection) 의존성 주입 // @Autowired 하면. new하지 않아도 바로 사용 가능. 내가 필요할 때 어느때나 그 객체를 사용할 수 있다.  
	private UsedGoodsDAO usedGoodsDAO;		// DAO에게 요청을 해야하기때문에 DAO를 가져온다.
	
	public List<UsedGoods> getUsedGoodsList(){
		List<UsedGoods> usedGoodsList = usedGoodsDAO.selectUsedGoodsList();
		return usedGoodsList;
	}
}
