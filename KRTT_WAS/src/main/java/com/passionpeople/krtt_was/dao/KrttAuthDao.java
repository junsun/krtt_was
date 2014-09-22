package com.passionpeople.krtt_was.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Order;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.passionpeople.krtt_was.vo.KrttAuth;

@Repository
public class KrttAuthDao {
	@Autowired
	MongoTemplate mongoTemplate;

	private static String COLLECTION_NAME = "krtt_auth";

	public KrttAuth insert(KrttAuth user) {
		mongoTemplate.insert(user, COLLECTION_NAME);
		return user;
	}

	public KrttAuth getUserByEmail(String email) {
		Query query = new Query();
		query.addCriteria(new Criteria("email").is(email));
		query.sort().on("rgstYmdt", Order.DESCENDING);
		return mongoTemplate.findOne(query, KrttAuth.class, COLLECTION_NAME);
	}

	public KrttAuth getUserCount(String email, String authId) {
		Query query = new Query();
		query.addCriteria(new Criteria("email").is(email));
		query.sort().on("rgstYmdt", Order.DESCENDING);
		return mongoTemplate.findOne(query, KrttAuth.class, COLLECTION_NAME);
	}

}