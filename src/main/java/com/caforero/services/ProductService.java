package com.caforero.services;

import com.caforero.models.Product;

import java.util.List;

public interface ProductService {

    public List<Product> listAll();

    public void save(Product product);

    public Product get (Long id);

    public void delete(Product product);
}
