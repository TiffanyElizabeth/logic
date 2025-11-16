package exercises.PasswordGenerator;

public class PasswordGenerator {
    public static String generatePassword(String firstName, String lastName, String favoriteColor, int birthDay,
            int birthMonth, int birthYear) {
        String password = firstName + "-" + lastName + "-" + favoriteColor + "-" + birthDay + "-" + birthMonth + "-"
                + birthYear;
        return password;
    }
}
