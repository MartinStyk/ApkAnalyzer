package sk.styk.martin.bakalarka.execute.tasks;

/**
 * Created by Martin Styk on 20.02.2016.
 */
public interface Task {
    void execute();
    Task setInputDirectory(String inputDirectory);
    Task setOutputDirectory(String outputDirectory);
}
