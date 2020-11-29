// Garrick Morley
// ISYS 216 001, Fall 2019
// Dr. Kinuthia
// Assignment Seven Source

package phonebookentry;

//import array stuff
import java.util.*;

public class PhoneBookEntry {
    
    public PhoneBookEntry(String name, String number) {
        
        //specify using "this"
        this.name = name;
        this.number = number;
        
    }
    
    //declare variables
    private String name;
    private String number;
    
    //"get" methods
    public  String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    
    ///"set" methods
    public void setName(String ID) {
        name = ID;
    }
    public void setNumber(String phone) {
        number = phone;
    }
    
    //program to create objects and print contents
    public static void main(String args[]){
    
    //create array list
    List<PhoneBookEntry> object;
        object = new ArrayList<>();
    
    //create and initialize 5 objects
    PhoneBookEntry alpha = new PhoneBookEntry("Dennis", "(576) 529-3099");
    PhoneBookEntry beta = new PhoneBookEntry("Charlie", "(398) 973-7369");
    PhoneBookEntry charlie = new PhoneBookEntry("Mac", "(323) 538-2195");
    PhoneBookEntry delta = new PhoneBookEntry("Deandra", "(692) 856-1806");
    PhoneBookEntry echo = new PhoneBookEntry("Frank", "(831) 344-9772");

    //put the objects into the array list
    List<PhoneBookEntry> info = new ArrayList<>();
        info.add(alpha);
        info.add(beta);
        info.add(charlie);
        info.add(delta);
        info.add(echo);
    
    //print a header
    System.out.println("Names and Phone Numbers\n");
    
    //loop to display contents of the array list
    for (int i = 0; i < 5; i++){
       System.out.println(info.get(i).getName());
       System.out.println(info.get(i).getNumber());
    }
        
}
}
        
        
    
