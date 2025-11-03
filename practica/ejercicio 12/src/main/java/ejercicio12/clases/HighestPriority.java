package ejercicio12.clases;
import ejercicio12.JobDescription;

import java.util.Comparator;
import java.util.List;

public class HighestPriority implements Strategy {
    public JobDescription next(List<JobDescription> jobs){
        JobDescription nextJob = null;
        nextJob = jobs.stream().max(Comparator.comparingDouble(JobDescription::getPriority)).orElse(null); // FUNCION DE LA CATEDRA
        return nextJob;
    }
}
