package Date;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CurrentDate {
    public static void main(String[] args) {

        Date date = new Date();

        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String currentDate = dateFormat.format(date);
        System.out.println("Current date : "+currentDate);
    }
}
