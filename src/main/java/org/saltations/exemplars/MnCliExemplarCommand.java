package org.saltations.exemplars;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "mn-cli-exemplar", description = "...",
        mixinStandardHelpOptions = true)
public class MnCliExemplarCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(MnCliExemplarCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
