package addressbookmanagement.com;

import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook extends AddressBookMain{

	 public void createNewContacts( ArrayList<Person_Records> record) {
		    sc.nextLine();
		    System.out.println("Enter Firstname :: ");
		    String firstname=sc.nextLine();
		    System.out.println("Enter Lastname :: ");          
			String lastname=sc.nextLine();
			System.out.println("Enter Address:: ");
		    String address=sc.nextLine();
		    System.out.println("Enter City :: ");
		    String city=sc.nextLine();
		    System.out.println("Enter State :: ");
		    String state=sc.nextLine();
		    System.out.println("Enter Zip :: ");
		    long z=sc.nextLong();
		    System.out.println("Enter Mobile Number ::");
		    long no=sc.nextLong();	    
		    sc.nextLine();
		    record.add(new Person_Records  (firstname,lastname,address,city,state,z,no));
	  }

	public void displayAllContacts(ArrayList<Person_Records> record ) {
			  for(int i=0;i<record.size();i++) { 
			  System.out.println(" person details : ");
		      System.out.println("FirstName : "+record.get(i).getFirstname());
			  System.out.println(" LastName : "+record.get(i).getLastname());
			  System.out.println(" Address : "+record.get(i).getAddress());
			  System.out.println(" City : "+record.get(i).getCity());
			  System.out.println(" State : "+record.get(i).getState());
			  System.out.println(" ZipCode : "+record.get(i).getZip());
			  System.out.println(" MobileNo : "+record.get(i).getMobileno());
			  }
		}
	
   public void editContactInfo( ArrayList<Person_Records> record) {
		System.out.println("Enter a Firstname of person which data you want to edit :");
		String name=sc.next();
		
		Iterator<Person_Records> iterator = record.listIterator();

		while (iterator.hasNext()) {
			Person_Records person= iterator.next();

			if (name.equals(person.getFirstname())) {
		
				System.out.println("Choose field you want to add:");
				System.out.println("1.Last Name\t2.Phone Number\t3.City\t4.Zip\t5. State");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Re-Correct your lastname");
					person.setLastname(sc.next());
					break;
				case 2:
					System.out.println("Re-Correct your Phone Number");
					person.setMobileno(sc.nextLong());
					break;
				case 3:
					System.out.println("Re-Correct your City");
					person.setCity(sc.next());
					break;
				case 4:
					System.out.println("Re-Correct your Zip");
					person.setZip(sc.nextLong());
					break;
				case 5:
					System.out.println("Re-Correct your State");
					person.setState(sc.next());
					break;
				case 6:
					System.out.println("Re-Correct your Address");
					person.setAddress(sc.next());
					break;
				}

			}
		}
}

	public void deleteContact(ArrayList<Person_Records> record) {
		System.out.println("Enter a Firstname of person which data you want to delete :");
		String name=sc.next();
		Iterator<Person_Records> iterator = record.listIterator();
		if(iterator.hasNext()) {
			Person_Records person=iterator.next();
			if(name.equals(person.getFirstname())) {
				record.remove(person);
			}
		}
	}
	public void quit() {
		System.exit(0);
	}
}
