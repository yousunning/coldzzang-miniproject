package food.service.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import food.service.FoodDTO;



@Repository
public class FoodDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public List<FoodDTO> getFoodList(FoodDTO foodDTO) {
		return  mybatis.selectList("FoodDAO.getFoodList", foodDTO);
	}
	
}
