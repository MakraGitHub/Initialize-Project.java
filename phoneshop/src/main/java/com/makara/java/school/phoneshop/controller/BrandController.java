package com.makara.java.school.phoneshop.controller;

import com.makara.java.school.phoneshop.dto.BrandDTO;
import com.makara.java.school.phoneshop.entity.Brand;
import com.makara.java.school.phoneshop.service.BrandService;
import com.makara.java.school.phoneshop.service.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Rest api
@RestController
@RequestMapping("brands")
public class BrandController {

    @Autowired
    private BrandService brandService;
    //RequestBody អ្វីដែលយើង summit from front-end
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO){
        Brand brand = Mapper.toBrand(brandDTO);
        brand = brandService.create(brand);
       // return ResponseEntity.ok(brand);// called body
        return ResponseEntity.ok(Mapper.brandDTO(brand));

    }
}
