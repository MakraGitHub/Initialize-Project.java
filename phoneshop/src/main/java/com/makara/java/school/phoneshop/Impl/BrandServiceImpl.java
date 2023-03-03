package com.makara.java.school.phoneshop.Impl;

import com.makara.java.school.phoneshop.entity.Brand;
import com.makara.java.school.phoneshop.repository.BrandRepository;
import com.makara.java.school.phoneshop.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Component;

// using concept spring core @Component
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;
    // call it dependency injection

    @Override
    public Brand create(Brand brand) {
        //return null;
//        Brand brand2 = brandRepository.save(brand);
//        return brand2;
        return brandRepository.save(brand);

    }
}
