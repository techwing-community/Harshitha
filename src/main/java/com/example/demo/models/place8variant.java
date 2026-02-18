package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class place8variant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String variantName;  // Example: "Adult Entry", "VIP Pass"
	private Double charges; 
	
	@Column(length = 1000)
	private String description;
	private String estimatedTime;
	
	@ManyToOne
	@JoinColumn(name = "place_id")
	private place8 place;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVariantName() {
		return variantName;
	}

	public void setVariantName(String variantName) {
		this.variantName = variantName;
	}

	public Double getCharges() {
		return charges;
	}

	public void setCharges(Double charges) {
		this.charges = charges;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(String estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public place8 getPlace() {
		return place;
	}

	public void setPlace(place8 place) {
		this.place = place;
	}  
}



