package com.caforero.services.impl;

import com.caforero.models.Product;
import com.caforero.repository.ProductRepository;
import com.caforero.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> listAll() {
        return productRepository.findAll();
    }

    @Transactional
    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product get(Long id) {
        return productRepository.findById(id).get();
    }

    @Transactional
    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }
}
