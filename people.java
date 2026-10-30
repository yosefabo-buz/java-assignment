
//Abstraction part 
  abstract class Human {
      
      private String name;
      private String sex;
      private String email;
      private int age;
      public abstract String getRole();
      
      //publication
      public Human (String name, String sex, String email, int age){
          this.name = name; 
          this.sex = sex;
          this.email = email;
          this.age = age;
          
          
  }
      
    public String getName() { return name; }
     public void setName(String name){this.name = name;}
     
     
    public String getsex() { return sex; }
     public void setsex(String sex){this.sex = sex;}
     
     
    public String getemail() { return email; }
     public void setemail(String email){this.email = email;}
    
    
    public int getage() { return age; }
     public void setage(int age){this.age = age;}
  }
// 1. Student Class
class Student extends Human {
    private String studentId;
    private String major;

    public Student(String name, String sex, String email, int age, String studentId, String major) {
        super(name, sex, email, age);
        this.studentId = studentId;
        this.major = major;}
  @Override
  public String getRole(){
   return " Student (ID: " + studentId + " | Major: " + major + ")";
  }
   }
   
  
  // 2. teacher Class
  
  class Teacher extends Human {
      
    private String subject;
    private double salary;

    public Teacher(String name, String sex, String email, int age, String subject, double salary) {
        super(name, sex, email, age);
        this.subject = subject;
        this.salary = salary;}
      @Override
      public String getRole(){
          return "Teacher (Subject: " + subject + " | Salary: " + salary + ")";
      }
   }
  
  
  // 3. Manager Class
  
  class Manager extends Human {
    
    private String department;
    private double salary;

    public Manager(String name, String sex, String email, int age, String department, double salary) {
        super(name, sex, email, age);
        this.department = department;
        this.salary = salary;}
  @Override
  public String getRole(){
      return "Manager (Department: " + department  + " | Salary: " + salary + ")";
    }
  }



public class people {
    public static void main(String[] args) {
      Human[] people = new Human[3]; 
      people[0] = new Student("Temima Abdela ", "Female", "temima@email.com", 20, "RMNS/465/-25", "Computer science");
      people[1] = new Teacher("Mr. Yohanis Abebe", "Male", "yohani@email.com", 45, "Mthematics", 50000.0);
      people[2] = new Manager("Boss Yonatan Malese", "Male", "yoniat@email.com", 49, "HR", 95000.0);
     for (Human h : people) {
    System.out.println(h.getName() + 
                       " | Sex: " + h.getsex() + 
                       " | Age: " + h.getage() + 
                       " | Email: " + h.getemail() + 
                       " is a " + h.getRole());
}
              
     }
     
    
}
