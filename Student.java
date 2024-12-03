// gets student information
public class Student {
    // class variables
   private String firstName;
   private String lastName;
   private String stId; // star id
   private int year;
   private String major;

   // gets and sets
   private String getFirstName()
   // returns the first name
   {
    return firstName;
   }

   private String getLastName()
   // returns the last name
   {
    return lastName;
   }

   private String getStId()
   // returns the star id
   {
    return stId;
   }

   private int getYear()
   // returns the year 
   {
    return year;
   }

   private String getMajor()
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

}
