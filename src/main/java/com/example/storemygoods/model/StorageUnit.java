package com.example.storemygoods.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor @Data @Builder @ToString
public class StorageUnit {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private Integer sqFeet;
    private Integer price;
    private String about;
    private String status="notBooked";
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getSqFeet() {
		return sqFeet;
	}
	public void setSqFeet(Integer sqFeet) {
		this.sqFeet = sqFeet;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
}
