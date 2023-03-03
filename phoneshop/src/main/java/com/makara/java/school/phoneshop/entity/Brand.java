package com.makara.java.school.phoneshop.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
//@Table(name = "brands")
@Table(name= "brands")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brand_id")
	private Integer id;

	@Column(name = "brand_name")
	private String name;
}
