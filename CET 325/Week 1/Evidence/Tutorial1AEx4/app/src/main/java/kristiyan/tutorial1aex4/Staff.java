package kristiyan.tutorial1aex4;

/**
 * Created by Chris on 13/10/2016.
 */
public class Staff extends Person {

    // Staff has 2 additional fields
    private String school;
    private double pay;

    // Class constructor
    public Staff(String name, String address, String school, double pay)
    {
        super(name,address);
    }

    // Accessors
    public String getSchool()
    {
        return  school;
    }

    public void setSchool(String School)
    {
    }

    public double getPay(double pay)
    {
        return  pay;
    }

    public void setPay(double pay)
    {
    }

    @Override
    public String toString() {
        return super.toString() + "Staff" + getName() + "Address" +
                getAddress() + "School" + getSchool() + "Pay" + getSchool();
    }
}
