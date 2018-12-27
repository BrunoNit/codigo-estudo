package br.com.pueyo.java8.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateUtils {
    
    private LocalDate localDate = LocalDate.now();
    
    private DateUtils() {}

    
    public static DateUtils now() {
        return new DateUtils();
    }
    
    public DateUtils adicionaDias(long dias) {
        this.localDate = this.localDate.plus(dias, ChronoUnit.DAYS);
        return this;
    }
    public DateUtils adicionaMeses(long meses) {
        this.localDate = this.localDate.plus(meses, ChronoUnit.MONTHS);
        return this;
    }    
    
    public LocalDate build() {
        return this.localDate;
    }
}
