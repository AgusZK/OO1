package ejercicio12.clases;
import ejercicio12.JobDescription;

import java.util.List;

public class HighestPriority implements Strategy {
    public JobDescription next(List<JobDescription> jobs){
        JobDescription nextJob = null;
        nextJob = jobs.stream().max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority())).orElse(null); // FUNCION DE LA CATEDRA
        return nextJob;
    }
}
