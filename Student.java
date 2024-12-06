// gets student information
public class Student {
    // class variables
   public String firstName;
   public String lastName;
   public String stId; // star id
   public int year;
   public String major;

   // gets and sets
   public String getFirstName()
   // returns the first name
   {
    return firstName;
   }

   public String getLastName()
   // returns the last name
   {
    return lastName;
   }

   public String getStId()
   // returns the star id
   {
    return stId;
   }

   public int getYear()
   // returns the year 
   {
    return year;
   }

   public String getMajor()
   // returns the major
   {
    return major;
   }

   // setter
   public void setFirstName(String inFirstName)
   // sets the first name
   {
    firstName = inFirstName;
   }

   public void setLastName(String inLastName)
   // sets the last name
   {
    lastName = inLastName;
   }

   public void setStrId(String inStrId)
   // sets the star id
   {
    stId = inStrId;
   }

   public void setYear(int inYear)
   // sets the year
   {
    year = inYear;
   }

   public void setMajor(String inMajor)
   // sets the major
   {
    major = inMajor;
   }   

   // Constructors
   public Student()
   {

   }
   public Student(String inFirstName, String inLastName, String inStId, int inYear, String inMajor)
   {
    firstName = inFirstName;
    lastName = inLastName;
    stId = inStId;
    year = inYear;
    major = inMajor;
   }

   // ToString
   public String toString()
   {
    String str;
    str =  "First Name: " +firstName + " "+ "Last Name" + lastName + "\n" 
    + "Student Id: " + stId + "Major: " + major + "Year: " + year;
    return str;
   }

}
