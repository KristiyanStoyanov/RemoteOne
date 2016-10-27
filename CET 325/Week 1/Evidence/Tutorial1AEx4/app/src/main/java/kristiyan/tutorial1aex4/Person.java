package kristiyan.tutorial1aex4;


/**
 * Created by Chris on 13/10/2016.
 */

//  Parent class
public class Person {

    // Fields to hold person's name and address
    private String name;
    private String address;

    // Class constructor
    public Person(String name, String address){}

    // Accessors
    public String getName(){
        return  name;
    }
    public String getAddress(){
        return  address;
    };

    // Modifier
    public void setAddress(String address){};

    @Override
    public String toString() {
        return super.toString() + "Name" + getName() + "Address" + getAddress();
    }
}
