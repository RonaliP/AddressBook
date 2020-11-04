import java.io.*;
import java.util.*;


class Person
{
    String name;
    String city;
    String state;
    long pin;
    long phone;
    String mail;

    Person(String name,String city,String state,long pin,long phone,String mail)
    {
        this.name=name;
        this.city=city;
        this.state=state;
        this.pin=pin;
        this.phone=phone;
        this.mail=mail;
    }


}



class AddressBook
{
    static ArrayList Address=new ArrayList();
    static int numberAdress=0;
    static Scanner stdin = new Scanner(System.in);


    public void addContacts() {
                System.out.println("Enter your name:");
                String name = stdin.next();
                System.out.println("Enter your city.");
                String city  = stdin.next();
                System.out.println("Enter your state.");
                String state = stdin.next();
                System.out.println("Enter pincode");
                long pin = stdin.nextLong();
                System.out.println("Enter phone number");
                long phone = stdin.nextLong();
  System.out.println("Enter Email-Id");
                String mail = stdin.next();

               // Address.add(new Person.setName(newName));
                Address.add(new Person(name,city,state,pin,phone,mail));

                    numberAdress++;

    }

    public void printContacts() {
        System.out.println("NAME"+" "+"CITY"+" "+"STATE"+" "+"PIN"+" "+"PHONE"+" "+"EMAIL");
        System.out.println("_______________________________________________________________");
                Iterator itr=Address.iterator();
                while(itr.hasNext())
                {
                Person p=(Person)itr.next();
                  System.out.println(p.name+"  "+p.city+"  "+p.state+"  "+p.pin+"  "+p.phone+"  "+p.mail);

                }

    }

    public void searchContact()
    {
        System.out.println("Enter the name whose address u want to see");
        String personName=stdin.next();
        int AddressBookLength=Address.size();

        System.out.println("The index is "+ Address.indexOf(personName));
            boolean answer=Address.contains(personName);

            if(answer)
            {
                System.out.println("Found"+personName);
  }
            else{
                System.out.println("NOOOOOO");
                }

    }


    public static void main(String[] args) throws IOException
    {
        AddressBook blackbook = new AddressBook();


        while(true)
        {
                menu();
                int choice = stdin.nextInt();

            if (choice == 1)
            {

                     blackbook.addContacts();

            }

                else if (choice == 2) {
                                System.out.println("What is the name of the contact you want to delete?");
                                //String name = stdin.next();
                                blackbook.searchContact();
                }
                else if (choice == 3) {
                                System.out.println("THE NUMBER OF ADDRESSES STORED IN YOUR ADDRESSBOOK ARE="+numberAdress );
                }

            else if(choice==4)
            {
                blackbook.printContacts();
            }
                else if (choice==5) {
                                break;
                }

        }

    }

    public static void menu() {
        System.out.println("_______________________________________________");
                System.out.println("1.Add a new address to your address book.");
                System.out.println("2.Delete an address from your address book.");
                System.out.println("3.Print out the number of address records you have.");
                System.out.println("4.Print full information of all of your Adressbook.");
                System.out.println("5.Quit.");
        System.out.println("Enter your choice Please:");
        System.out.println("_________________________________________________");
    }


}
