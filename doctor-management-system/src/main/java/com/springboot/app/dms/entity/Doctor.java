package com.springboot.app.dms.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Doctor {
	public Doctor() {
			super();
		}
		@Id
		Long id;
		String Name;
		String Email;
	         public Doctor(Long id, String name, String email) {
			super();
			this.id = id;
			Name = name;
			Email = email;
		}
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public String getName() {
				return Name;
			}
			public void setName(String name) {
				Name = name;
			}
			public String getEmail() {
				return Email;
			}
			public void setSpeaclist(String speaclist) {
				Email = email;
			}
	}

