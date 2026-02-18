package com.example.demo.models;

import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class place2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Public code like DEST-001
    @Column(unique = true)
    private String placeCode;

    private String name;
    private String city;
    private String state;
    private String country;
    private String estimatedTravelTime;
    private Double startingCharges;
    private Double rating; // Average user rating
    private Integer totalRatings;

    @Column(length = 1500)
    private String description;

    private String imageUrl;
    private String category; // Beach, Temple, Hill Station etc.

    private Boolean isActive;// Useful if you want to hide a place without deleting it

    //ONE Place -> MANY Variants
    @OneToMany(mappedBy = "place", cascade = CascadeType.ALL)
    private List<place2variant> variants;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaceCode() {
		return placeCode;
	}

	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEstimatedTravelTime() {
		return estimatedTravelTime;
	}

	public void setEstimatedTravelTime(String estimatedTravelTime) {
		this.estimatedTravelTime = estimatedTravelTime;
	}

	public Double getStartingCharges() {
		return startingCharges;
	}

	public void setStartingCharges(Double startingCharges) {
		this.startingCharges = startingCharges;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Integer getTotalRatings() {
		return totalRatings;
	}

	public void setTotalRatings(Integer totalRatings) {
		this.totalRatings = totalRatings;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public List<place2variant> getVariants() {
		return variants;
	}

	public void setVariants(List<place2variant> variants) {
		this.variants = variants;
	}

    
    
}
