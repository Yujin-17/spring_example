package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewDAO;
import com.example.lesson03.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	public Review getReviewById(int id) {		// int = 필수로 받아야 함. Integer = null포함 필수 x 
		return reviewDAO.selectReview(id);
	}
	
	public int addReview(Review review) {
		return reviewDAO.insertReview(review);		// 메소드 명 같으면 오버로딩으로 값이 다르게 사용할 수 있다. 
	}

	public int addReviewAsField(int storeId, String menu, String userName, double point, String review) {
		return reviewDAO.insertReviewAsField(storeId, menu, userName, point, review);
	}
	
}
