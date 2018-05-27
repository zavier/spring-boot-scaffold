package com.zavier.scaffold.service;

import com.zavier.scaffold.dao.CustomerMapper;
import com.zavier.scaffold.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoService {
    @Autowired
    private CustomerMapper customerMapper;

    public String test() {
        return "DemoService";
    }

    @Transactional
    public void testRollBack() {
        Customer customer = new Customer();
        customer.setName("roll1");
        customerMapper.insertSelective(customer);
        Customer customer1 = new Customer();
        customer1.setName("testrollbackdadfa2");
        customerMapper.insertSelective(customer1);
    }

    @Transactional
    public void testRollBack1() {
        Customer customer = new Customer();
        customer.setName("roll1");
        customerMapper.insertSelective(customer);
        throw new RuntimeException("就是不让你提交，看事物好用不");
    }
}
