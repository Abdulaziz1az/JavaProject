// gets student information
public class Student {
    // class variables
   public String firstName;
   public String middleNameInitial;
   public String lastName;
   public String stId; // star id
   public int year;
   public String major;
   public double gpa;

   // gets and sets
   public String getFirstName()
   // returns the first name
   {
    return firstName;
   }

   public String MiddleNameInitial()
   // returns the middle name initial
   {
    return middleNameInitial;
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

   public double getGpa()
   {
    // returns the gpa
    return gpa;
   }

   // setter
   public void setFirstName(String inFirstName)
   // sets the first name
   {
    firstName = inFirstName;
   }

   public void setMiddleNameInitial(String inMiddleInitial)
   {
    middleNameInitial = inMiddleInitial;
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

   public void setGpa(double inGpa)
   {
    // sets the gpa
    gpa = inGpa;
    if( gpa >= 3.5)
    {
        System.out.println("Congratulation and welcome to the university");
    }
    else
    {
        System.out.println("Sorry but you gpa is lower then the requirement");
    }
   }

   // Constructors
   public Student()
   {

   }
   public Student(String inFirstName, String inMiddleInitial, String inLastName, 
   String inStId, int inYear, String inMajor, double inGpa )
   {
    firstName = inFirstName;
    middleNameInitial = inFirstName;
    lastName = inLastName;
    stId = inStId;
    year = inYear;
    major = inMajor;
    gpa = inGpa;
   }

   // ToString
   public String toString()
   {
    String str;
    str = "Full Name: " + firstName+" " + middleNameInitial+" " + lastName 
    + "\n" + "star id: " + stId + "\n" + 
    "Year: " + year + "\n" + "Major: " + major + "\n";
    return str;
   }

}
