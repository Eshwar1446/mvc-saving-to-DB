package com.org.xworkz.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;



@Component

public class ActorDTO implements Serializable{
	
	private String leadActorName;
	private String leadSupportingActorName;
	
	public ActorDTO() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "ActorDTO [leadActorName=" + leadActorName + ", leadSupportingActorName=" + leadSupportingActorName
				+ "]";
	}

	public String getLeadActorName() {
		return leadActorName;
	}

	public void setLeadActorName(String leadActorName) {
		this.leadActorName = leadActorName;
	}

	public String getLeadSupportingActorName() {
		return leadSupportingActorName;
	}

	public void setLeadSupportingActorName(String leadSupportingActorName) {
		this.leadSupportingActorName = leadSupportingActorName;
	}
	

}
