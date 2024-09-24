package week3.work2;

import java.time.LocalDate;
import java.time.Period;

public class Model {
    Period getResult(){
        LocalDate today = LocalDate.now();
        LocalDate christmas = LocalDate.of(today.getYear(), 12, 25);
        return Period.between(today,christmas);
    }
}
