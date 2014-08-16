package com.passionpeople.krtt_was.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.passionpeople.krtt_was.vo.Company;

public class CompanyDao  {
 
    @Autowired
    MongoTemplate mongoTemplate;
 
    private static String COLLECTION_NAME = "companylist";
 
    public Company insert(Company company) {
        mongoTemplate.insert(company, COLLECTION_NAME);
        return company;
    }
 
    public List<Company> getCompanyList() {
        return mongoTemplate.findAll(Company.class, COLLECTION_NAME);
    }
    
    
}