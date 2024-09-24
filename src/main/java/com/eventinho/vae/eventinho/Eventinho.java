package com.eventinho.vae.eventinho;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "eventos")
@Entity(name = "eventos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Eventinho {
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String title;
	    private String image;
	    private String price;
	    private String date;

	    public Eventinho(EventinhoRequestDTO data){
	        this.image = data.image();
	        this.price = data.price();
	        this.title = data.title();
	        this.date = data.date();
	    }
	    
	    public Eventinho() {
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}
	}