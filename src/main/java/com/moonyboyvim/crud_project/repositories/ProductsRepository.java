package com.moonyboyvim.crud_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moonyboyvim.crud_project.entity.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
