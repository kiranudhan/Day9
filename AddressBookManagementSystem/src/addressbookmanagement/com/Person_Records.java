package addressbookmanagement.com;

public class Person_Records {
	
		private String firstname;
	    private String lastname;
		 private String address;
		 private String city;
	    private String state;
		 private long zip;
		 private long mobileno;
		 
	      public Person_Records(String firstname, String lastname, String address, String city, String state, long zip,
				long mobileno) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.mobileno = mobileno;
		}

	      public String getFirstname() {
				return firstname;
			}
			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}
			public String getLastname() {
				return lastname;
			}
			public void setLastname(String lastname) {
				this.lastname = lastname;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
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
			public long getZip() {
				return zip;
			}
			public void setZip(long zip) {
				this.zip = zip;
			}
			public long getMobileno() {
				return mobileno;
			}
			public void setMobileno(long mobileno) {
				this.mobileno = mobileno;
			}
			
	}

