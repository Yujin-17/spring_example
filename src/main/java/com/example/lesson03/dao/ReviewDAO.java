package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {

	public Review selectReview(int id);
	
	public int insertReview(Review review);
	
	public int insertReviewAsField(
			@Param("storeId") int storeId, // 5개의 값이 하나의 Map으로 합쳐지는 @Param 어노테이션 사용 
			@Param("menu") String menu, 
			@Param("userName") String userName, 
			@Param("point") double point, 
			@Param("review") String review);
}
