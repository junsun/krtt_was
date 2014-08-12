package com.passionpeople.krtt_was.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Order;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.passionpeople.krtt_was.vo.UserAuth;

@Repository
public class UserAuthDao {
 
    @Autowired
    MongoTemplate mongoTemplate;
 
    private static String COLLECTION_NAME = "user_auth";
 
    public UserAuth insert(UserAuth user) {
        mongoTemplate.insert(user, COLLECTION_NAME);
        return user;
    }
 
    public UserAuth getUserByEmail(String email){
    	Query query = new Query();
    	query.addCriteria(new Criteria("email").is(email));
    	query.sort().on("rgstYmdt", Order.DESCENDING);
    	return mongoTemplate.findOne(query, UserAuth.class, COLLECTION_NAME);
    }
    
    public UserAuth getUserCount(String email, int authId){
    	Query query = new Query();
    	query.addCriteria(new Criteria("email").is(email));
    	query.sort().on("rgstYmdt", Order.DESCENDING);
    	return mongoTemplate.findOne(query, UserAuth.class, COLLECTION_NAME);
    }
    
    
//    public UserAuth getUser(UserAuth user) {
//    	return mongoTemplate.findById(user.getId(), UserAuth.class, COLLECTION_NAME);
//    }
// 
//    public List<UserAuth> getUsers() {
//        return (List<UserAuth>) mongoTemplate.findAll(UserAuth.class, COLLECTION_NAME);
//    }
// 
//    public void deleteUser(UserAuth user) {
//        Query query = new Query(new Criteria("id").is(user.getId()));
//        mongoTemplate.remove(query, COLLECTION_NAME);
//    }
 
}