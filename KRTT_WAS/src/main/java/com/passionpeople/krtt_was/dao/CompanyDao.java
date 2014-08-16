package com.passionpeople.krtt_was.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Order;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.passionpeople.krtt_was.vo.Company;
import com.passionpeople.krtt_was.vo.UserAuth;

@Repository
public class CompanyDao  {
 
    @Autowired
    MongoTemplate mongoTemplate;
 
    private static String COLLECTION_NAME = "companylist";
 
    public Company insert(Company company) {
        mongoTemplate.insert(company, COLLECTION_NAME);
        return company;
    }
 
    public List<Company> getCompanyList() {
    	Query query = new Query();
    	query.addCriteria(new Criteria());
    	query.sort().on("cpNm", Order.ASCENDING);
        return mongoTemplate.find(query, Company.class, COLLECTION_NAME);
    }
    
    
}