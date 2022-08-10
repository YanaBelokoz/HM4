package HW4.exceptions.morethanexeption;

public class MoreThanHundredException extends Exception {
    public MoreThanHundredException(String s) {
       String errorMessage = "Result cannot be more than 100";
    }
}
