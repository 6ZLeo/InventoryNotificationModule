package com.example.erp.service.impl;

import com.example.erp.entity.InboundOrder;
import com.example.erp.entity.Product;
import com.example.erp.entity.User;
import com.example.erp.repository.InboundOrderRepository;
import com.example.erp.repository.ProductRepository;
import com.example.erp.repository.UserRepository;
import com.example.erp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private InboundOrderRepository inboundOrderRepository;
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public String createProduct(Product product) {
        productRepository.save(product);
        return "创建产品成功";
    }
