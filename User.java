import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;
    protected LocalDate today = LocalDate.now();

  protected User(){
      this.name = "";
      this.dob = LocalDate.now();
  }

    public User (String name, int year, int month, int date){
        this.name = name;
        this.dob = LocalDate.of(year,month,date);
    }
    public void displayinfo(){
        System.out.println("name: " + name);
        System.out.println("date of birth: " + dob);
    }

    public boolean isBirthday(){
        if(today.getMonth() == dob.getMonth() && today.getDayOfMonth() == dob.getDayOfMonth()){
           return true;
        } else {
            return false;
        }
    }

    public void displayHappyBirthday() {
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "!");
        }else{
            System.out.println("Sorry " + this.name + " but today is not your birthday!");
        }
    }


}



