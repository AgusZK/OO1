package ejercicio12.clases;
import ejercicio12.JobDescription;

import java.util.List;
public class LIFO implements Strategy {
    public JobDescription next(List<JobDescription> jobs){
        if (jobs != null){
            return jobs.get(jobs.size() - 1); // DEVUELVO EL ULTIMO DE LA LISTA
        }
        return null;
    }
}
