package ejercicio16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements Date {
    private LocalDate from;
    private LocalDate to;

    public DateLapse(LocalDate desde, LocalDate hasta){
        this.from = desde;
        this.to = hasta;
    }

    public LocalDate getFrom(){
        return this.from;
    }

    public LocalDate getTo(){
        return this.to;
    }

    public int sizeInDays(){
        return (int) ChronoUnit.DAYS.between(this.from, this.to);
    }

    public boolean includesDate(LocalDate other){
        return (other.equals(this.getFrom()) || other.equals(this.getTo()))
                || (other.isAfter(this.getFrom()) && other.isBefore(this.getTo()));
    }
}
