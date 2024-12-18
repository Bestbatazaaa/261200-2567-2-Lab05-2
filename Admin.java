import java.time.LocalDate;

public class Admin extends User{
    private String role;

    public Admin() {
        super();
        this.role = "Admin";
    }

    public Admin(String name, int year, int month, int date) {
        super(name,year,month,date);
        this.role = "Admin";
    }

    public void displayinfo(boolean full) {
        if(full == true) {
            super.displayinfo();
            System.out.println("Role: " + role);
        }else if(full == false){
            System.out.println("name: " + name);
        }
    }

    public void displayHappyBirthday() {
        int age =  today.getYear() - dob.getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }else{
            System.out.println("Sorry " + this.name + " but today is not your birthday!");
        }
    }
}
