package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="thesis")
public class thesis {
	
	@Id
	@GeneratedValue
	private long tid;
	@Column(name="title", nullable=false)
	private String title;
	@Column(name="researcher", nullable=false)
	private String researcher;
	@Column(name="guides", nullable=false)
	private String guides;
	@Column(name="description", nullable=false)
	private String description;
	@Column(name="category", nullable=false)
	private String category;
	@Column(name="keywords", nullable=false)
	private String keywords;
	@Column(name="donorName", nullable=true)
	private String donorName;
	@Column(name="donationDate", nullable=false)
	private String donationDate;
	@Column(name="approved", nullable=false)
	private String approved;
	
	public long getTid() {
		return tid;
	}
	public void setTid(long tid) {
		this.tid = tid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getResearcher() {
		return researcher;
	}
	public void setResearcher(String researcher) {
		this.researcher = researcher;
	}
	public String getGuides() {
		return guides;
	}
	public void setGuides(String guides) {
		this.guides = guides;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	
	public thesis(long tid, String title, String researcher, String guides, String description, String category,
			String keywords, String donorName, String donationDate, String approved) {
		super();
		this.tid = tid;
		this.title = title;
		this.researcher = researcher;
		this.guides = guides;
		this.description = description;
		this.category = category;
		this.keywords = keywords;
		this.donorName = donorName;
		this.donationDate = donationDate;
		this.approved = approved;
	}
	public thesis() {
		super();
	}
	

}
