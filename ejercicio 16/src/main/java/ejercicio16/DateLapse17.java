package ejercicio16;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse17 implements Date{
    private LocalDate from;
    private int sizeInDays;

    public DateLapse17(LocalDate desde, int cant){
        this.from = desde;
        this.sizeInDays = cant;
    }

    public LocalDate getFrom(){
        return this.from;
    }

    public LocalDate getTo(){
        return this.from.plusDays(this.sizeInDays);
    }

    public int sizeInDays(){
        return this.sizeInDays;
    }

    public boolean includesDate(LocalDate other){
        return (other.equals(this.getFrom()) || other.equals(this.getTo()))
                || (other.isAfter(this.getFrom()) && other.isBefore(this.getTo()));
    }
}
