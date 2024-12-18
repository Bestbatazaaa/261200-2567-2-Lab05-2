import java.time.LocalDate;

    public class Lec05 {
        public static void main(String[] args) throws Exception {

            User john = new User("John", 1954, 2, 18);
            john.displayinfo();

            Admin nicholas = new Admin("Nicholas", 1964, 1, 7);
            nicholas.displayinfo(true);
            nicholas.displayinfo(false);

            john.displayHappyBirthday();
            nicholas.displayHappyBirthday();

            User birthdayman = new User("Birthdayman", 2000,12,18);
            birthdayman.displayinfo();
            birthdayman.displayHappyBirthday();

            Admin birthdaywoman = new Admin("Birthdayman", 2000,12,18);
            birthdaywoman.displayinfo();
            birthdaywoman.displayHappyBirthday();

        }
    }