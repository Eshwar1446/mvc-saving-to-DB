package com.org.xworkz.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;



@Component

public class AwardDTO implements Serializable {

	private String awardName;
	private String sponser;
	private String gift;

	public AwardDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "AwardDTO [awardName=" + awardName + ", sponser=" + sponser + ", gift=" + gift + "]";
	}

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public String getSponser() {
		return sponser;
	}

	public void setSponser(String sponser) {
		this.sponser = sponser;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}

}
