package com.springboot.app.dms.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	
		public Feedback() {
			super();
		}
		@Id
		long Feedbackid;
		String Feedback;
		
		public long getFeedbackid() {
			return Feedbackid;
		}
		public void setFeedbackid(long feedbackid) {
			Feedbackid = feedbackid;
		}
		
		public Feedback(long feedbackid, String feedback) {
			super();
			Feedbackid = feedbackid;
			Feedback = feedback;
			
		}
		public String getFeedback() {
			return Feedback;
		}
		public void setFeedback(String feedback) {
			Feedback = feedback;
		}
		

	}
