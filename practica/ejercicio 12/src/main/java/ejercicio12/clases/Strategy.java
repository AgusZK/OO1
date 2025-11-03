package ejercicio12.clases;
import ejercicio12.JobDescription;

import java.util.List;

public interface Strategy {
    // INTERFAZ PARA QUE TODAS LAS CLASES SE COMPROMETAN A DESARROLLAR EL METODO NEXT
    public JobDescription next(List<JobDescription> jobs);
}
