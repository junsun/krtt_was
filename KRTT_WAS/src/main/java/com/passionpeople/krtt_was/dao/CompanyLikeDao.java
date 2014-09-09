package com.passionpeople.krtt_was.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Order;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.passionpeople.krtt_was.vo.Company;
import com.passionpeople.krtt_was.vo.CompanyLiked;
import com.passionpeople.krtt_was.vo.UserAuth;

@Repository
public class CompanyLikeDao {

    @Autowired
    MongoTemplate mongoTemplate;
 
    private static String COLLECTION_NAME = "companylist_liked";
 
    public CompanyLiked insert(CompanyLiked companyLiked) {
        mongoTemplate.insert(companyLiked, COLLECTION_NAME);
        return companyLiked;
    }
    
    public void remove(String cpId, String email) {
    	Query query = new Query();
    	query.addCriteria(new Criteria("userEmail").is(email).and("cpId").is(cpId));
        mongoTemplate.remove(query, COLLECTION_NAME);
    }
 
    public List<CompanyLiked> getCompanyList(String email) {
    	Query query = new Query();
    	query.addCriteria(new Criteria("userEmail").is(email));
    	query.sort().on("cpNm", Order.ASCENDING);
        return mongoTemplate.find(query, CompanyLiked.class, COLLECTION_NAME);
    }
    
}
