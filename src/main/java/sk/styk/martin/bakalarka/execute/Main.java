package sk.styk.martin.bakalarka.execute;

import sk.styk.martin.bakalarka.execute.arguments.Arguments;
import sk.styk.martin.bakalarka.execute.arguments.ArgumentsFactory;
import sk.styk.martin.bakalarka.execute.arguments.TaskMode;
import sk.styk.martin.bakalarka.execute.tasks.AnalyzeTask;
import sk.styk.martin.bakalarka.execute.tasks.CompareTask;
import sk.styk.martin.bakalarka.execute.tasks.StatisticsTask;
import sk.styk.martin.bakalarka.execute.tasks.Task;

/**
 * Main class of ApkAnalyzer project
 * <p/>
 * This project is created as a part of Bachelor thesis Analysis of Android installation APK files
 * <p/>
 * -analyze Triggers analyze task.
 * -compare Triggers compare task.
 * -statistics Triggers statistics task.
 * -in, --input-dir Specify directory where input for task will be searched
 * -out, --output-dir Specify directory where output of task will be saved
 * <p/>
 *
 * @see https://github.com/MartinStyk/ApkAnalyzer
 *
 * Created by Martin Styk on 23.11.2015.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Arguments commandLineArgs = new ArgumentsFactory(args).parseArguments();

        String inputDirectory = commandLineArgs.getInputDirectory();
        String outputDirectory = commandLineArgs.getOutputDirectory();

        Task task = getCurrentTask(commandLineArgs.getTaskMode());

        task.setInputDirectory(inputDirectory)
                .setOutputDirectory(outputDirectory)
                .execute();


    }

    private static Task getCurrentTask(TaskMode taskMode) {
        switch (taskMode) {
            case ANALYZE:
                return new AnalyzeTask();
            case COMPARE:
                return new CompareTask();
            case STATISTICS:
                return new StatisticsTask();
        }
        throw new RuntimeException("No task specified");
    }

}

