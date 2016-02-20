package sk.styk.martin.bakalarka.execute.arguments;

import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Martin Styk on 20.02.2016.
 */
public class ArgumentsFactory {

    private static final Logger logger = LoggerFactory.getLogger(ArgumentsFactory.class);

    private static final String OPTION_ANALYZE = "analyze";
    private static final String OPTION_COMPARE = "compare";
    private static final String OPTION_STATISTICS = "statistics";
    private static final String OPTION_INPUT_SHORT = "in";
    private static final String OPTION_INPUT_LONG = "input-dir";
    private static final String OPTION_OUTPUT_SHORT = "out";
    private static final String OPTION_OUTPUT_LONG = "output-dir";

    private final String[] args;

    private TaskMode taskMode;
    private String inputDirectory;
    private String outputDirectory;

    public ArgumentsFactory(String[] args) {
        this.args = args;
    }

    public Arguments parseArguments() throws ParseException {

        CommandLineParser parser = new DefaultParser();

        Options options = createOptions();
        CommandLine line = null;

        try {
            // parse the command line arguments
            line = parser.parse(options, args);
        } catch (ParseException exp) {
            logger.error("Unexpected exception during parsing of cli attributes:" + exp.getMessage());
            throw exp;
        }

        if (line.hasOption(OPTION_ANALYZE))
            taskMode = TaskMode.ANALYZE;
        if (line.hasOption(OPTION_COMPARE))
            taskMode = TaskMode.COMPARE;
        if (line.hasOption(OPTION_STATISTICS))
            taskMode = TaskMode.STATISTICS;

        if (line.hasOption(OPTION_INPUT_SHORT)) {
            String val = line.getOptionValue(OPTION_INPUT_SHORT);
            inputDirectory = val;
        }
        if (line.hasOption(OPTION_OUTPUT_SHORT)) {
            String val = line.getOptionValue(OPTION_OUTPUT_SHORT);
            outputDirectory = val;
        }
        return new Arguments(taskMode, inputDirectory, outputDirectory);
    }

    private Options createOptions() {
        Options options = new Options();

        // create the Options for TaskMode (@see TaskMode enum)
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);

        optionGroup.addOption(Option
                .builder(OPTION_ANALYZE)
                .desc("Analyze APK files. Json file with result will be created for every file")
                .numberOfArgs(0)
                .build());

        optionGroup.addOption(Option
                .builder(OPTION_COMPARE)
                .desc("Compare all APK files metadata. This operation requires json files created by operation analyze.")
                .numberOfArgs(0)
                .build());

        optionGroup.addOption(Option
                .builder(OPTION_STATISTICS)
                .desc("Compare statistics of APK files metadata. This operation requires json files created by operation analyze.")
                .numberOfArgs(0)
                .build());

        options.addOptionGroup(optionGroup);

        //input/output directories
        options.addOption(Option
                .builder(OPTION_INPUT_SHORT)
                .longOpt(OPTION_INPUT_LONG)
                .desc("Directory with APK or JSON files required for operation.")
                .required()
                .hasArg()
                .numberOfArgs(1)
                .build()
        );

        options.addOption(Option
                .builder(OPTION_OUTPUT_SHORT)
                .longOpt(OPTION_OUTPUT_LONG)
                .desc("Directory where output of operation will be stored.")
                .required()
                .hasArg()
                .numberOfArgs(1)
                .build()
        );

        return options;
    }

}
