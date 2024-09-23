package week3.work2;

import java.time.LocalDate;
import java.time.Period;

public class Model {
    Period getResult(){
        return Period.between(LocalDate.now(), LocalDate.of(2024, 12,25));
    }
}
