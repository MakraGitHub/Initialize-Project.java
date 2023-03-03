package com.makara.java.school.phoneshop.service.util;

import com.makara.java.school.phoneshop.dto.BrandDTO;
import com.makara.java.school.phoneshop.entity.Brand;

public class Mapper {

    public static Brand toBrand(BrandDTO dto){
        Brand brand = new Brand();
        //brand.setId(dto.getId());
        brand.setName(dto.getName());
        return brand;
    }
    public static BrandDTO brandDTO(Brand brand){
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setName(brand.getName());
        return brandDTO;
    }
}
