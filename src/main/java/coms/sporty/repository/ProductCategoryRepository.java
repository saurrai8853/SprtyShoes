package coms.sporty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.shoees.model.ProductCategory;

@Repository
public interface ProductCategoryRepository  extends JpaRepository<ProductCategory,Long >{

}
