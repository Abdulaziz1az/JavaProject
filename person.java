/* it gets a person first name, last name and age  */

public class person {
    private String firstName;
    private String lastName;
    int age;

    // get and sets
    // gets the first name
    public String getFirstName()
    {
        return firstName;
    }
    // get the last name
    public String getLastName()
    {
        return lastName;
    }

    // gets the age 
    public int getAge()
    {
        return age;
    }

    // sets the first name
    public void setFirstName(String inFirstName)
    {
        firstName = inFirstName;
    }

    // set the last name
    public void setLastName(String inLastName)
    {
        lastName = inLastName;
    }

    // sets the age
    public void setAge(int inAge)
    {
        age = inAge;
    }

    // toString
    public String toString()
    {
        String str;
        str = "Firist Name: "+ firstName +"\n" + "Last Name: "+ lastName;
        return str;
    }
}
