package com.likeycakey.cake.detailView.model.dao;

import com.likeycakey.cake.biz.model.vo.BizMember;
import com.likeycakey.cake.detailView.model.vo.ProductBoard;
import com.likeycakey.cake.detailView.model.vo.ProductOrder;
import com.likeycakey.cake.detailView.model.vo.ProductReview;
import com.likeycakey.cake.member.model.vo.BizWithMember;
import com.likeycakey.cake.member.model.vo.MemberLike;

import java.util.ArrayList;

public interface ProductBoardDao {

	public ArrayList<ProductBoard> selectTopList();

	public ProductBoard selectTodaysCake();

	public BizMember selectBizMember(String id);

	public ArrayList<ProductBoard> selectNewArrivalList();

	public String selectBizAddress(String id);

	public ArrayList<ProductBoard> selectBestSellerList();

	public ArrayList<ProductBoard> selectBestLikeyList();

	public int insertHeartMember(String pbNum, String id);

	public int updateLikeyBoard(String pbNum);

	public ArrayList<MemberLike> selectMemberLikeList(String id);

	public int updateSubtractLikeyBoard(String pbNum);

	public int deleteHeartMember(String pbNum, String id);

	public ProductBoard selectProductDetail(String pbNum);

	public BizWithMember selectProductDetailBiz(String id);

	public ArrayList<ProductReview> selectReviewList(String pbNum);

	public int insertProductAddCart(ProductOrder productOrder);

	public int updatePReviewReply(ProductReview productReview);

	public int delectPReviewReply(ProductReview productReview);

	public int insertPReviewReply(ProductReview productReview);
	
	

}
