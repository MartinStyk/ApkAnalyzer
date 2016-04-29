package sk.styk.martin.bakalarka.execute.tasks;

/**
 * One of main tasks implemetned in thiw project
 * -Analyze
 * -Compare
 * -Statistics
 *
 * Created by Martin Styk on 20.02.2016.
 */
public interface Task {
    /**
     * Execute task
     */
    void execute();

    /**
     * @param inputDirectory input files for task
     * @return this
     */
    Task setInputDirectory(String inputDirectory);

    /**
     * @param outputDirectory output location for task
     * @return this
     */
    Task setOutputDirectory(String outputDirectory);
}
