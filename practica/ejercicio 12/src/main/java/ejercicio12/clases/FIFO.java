package ejercicio12.clases;
import ejercicio12.JobDescription;

import java.util.List;
public class FIFO implements Strategy {
    public JobDescription next(List<JobDescription> jobs){
        if (jobs != null){
            return jobs.get(0); // DEVUELVO EL PRIMERO DE LA LISTA
        }
        return null;
    }
}
