package com.scp.general_store;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
	import javax.persistence.PrimaryKeyJoinColumn;
	import javax.persistence.Table;
	import org.hibernate.annotations.Parameter;
	import org.hibernate.annotations.GenericGenerator;
	 
	 
	@Entity
	@Table(name = "Sale")
	public class Sales {

		
		 @Id
		    @Column(name="Sale_ID")
		    @GeneratedValue
		  private long id;
		 
		    @Column(name = "STREET")
		    private String street;
		 
		    @Column(name = "CITY")
		    private String city;
		 
		    @Column(name = "COUNTRY")
		    private String country;
		 
		    @OneToOne
		    @JoinColumn(name="worker_id")
		    private Counter count;

			public Sales(String street, String city, String country) {
				super();
				this.street = street;
				this.city = city;
				this.country = country;
			}

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getStreet() {
				return street;
			}

			public void setStreet(String street) {
				this.street = street;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getCountry() {
				return country;
			}

			public void setCountry(String country) {
				this.country = country;
			}

			public Counter getCount() {
				return count;
			}

			public void setCount(Counter count) {
				this.count = count;
			}
		    
		    
		 

	}



