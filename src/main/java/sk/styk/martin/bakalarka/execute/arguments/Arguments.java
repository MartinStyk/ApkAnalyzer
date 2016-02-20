package sk.styk.martin.bakalarka.execute.arguments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Martin Styk on 20.02.2016.
 */
public class Arguments {

    private static final Logger logger = LoggerFactory.getLogger(Arguments.class);

    private final TaskMode taskMode;
    private final String inputDirectory;
    private final String outputDirectory;

    protected Arguments(TaskMode taskMode, String inputDirectory, String outputDirectory) {
        this.taskMode = taskMode;
        this.inputDirectory = inputDirectory;
        this.outputDirectory = outputDirectory;
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public TaskMode getTaskMode() {
        return taskMode;
    }

    public String getInputDirectory() {
        return inputDirectory;
    }
}
