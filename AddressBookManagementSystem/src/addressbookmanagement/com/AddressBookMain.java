package addressbookmanagement.com;
import java.util.*;
public class AddressBookMain {
    public static Scanner sc=new Scanner(System.in);	
    public static ArrayList<Person_Records>record=new ArrayList<Person_Records>();
  
   
   public static void main(String[] args) {
	    AddressBook addressBook = new AddressBook();
	    
	     while (true)
        {
            System.out.println("--------------ENTER-------------");
            System.out.println("1.Add new contact \t 2. Dislpay contact \t 3. edit \t 4.delete \t5.Quit");
            System.out.print("enter option:");
            int option = sc.nextInt();
            switch (option)
            {
                case 1:
                    addressBook.createNewContacts(record);
                    break;
                case 2:
                    addressBook.displayAllContacts(record);
                    break;
               case 3:
                    addressBook.editContactInfo(record);
                    break;
                case 4:
                    addressBook.deleteContact(record);
                    break;
                case 5:
                    System.out.println("quiting....!");
                    System.exit(0);
                default:
                    System.out.println("please enter the correct choice");
                    break;
            }
     }
  }
}

