package com.makara.java.school.phoneshop.repository;

import com.makara.java.school.phoneshop.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// 1 layer
public interface BrandRepository extends JpaRepository<Brand, Integer> {//name entity (Datatype entity)




}
