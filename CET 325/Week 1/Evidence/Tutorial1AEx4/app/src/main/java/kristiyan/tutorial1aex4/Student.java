package kristiyan.tutorial1aex4;

/**
 * Created by Chris on 13/10/2016.
 */
public class Student extends Person {

    // Student has three additional fields
    private String program;
    private int year;
    private double fee;

    // Constructor with parameters
    public Student(String name, String address, String program, int year, double fee)
    {
        super(name,address);
    }

    // Accessors
    public String getProgram()
    {
        return  program;
    }

    public void setProgram(String program)
    {
    }

    public int getYear()
    {
        return  year;
    }

    public void setYear(int year)
    {
    }

    public double getFee()
    {
        return  fee;
    }

    public void setFee(double fee)
    {
    }

    @Override
    public String toString() {
        return super.toString() + "Student" + getName() + "Address" + getAddress() +
                 "Course" + getProgram() + "Year" + getYear() + "Fee" + getFee();
    }
}
