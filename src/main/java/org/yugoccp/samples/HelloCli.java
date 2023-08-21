package org.yugoccp.samples;

import picocli.CommandLine;

/**
 * Hello CLI world!
 *
 */
@CommandLine.Command(name = "hello", version = "HelloCLI 1.0", mixinStandardHelpOptions = true)
public class HelloCli implements Runnable
{
    public void run() {
        System.out.println("Hello CLI World!");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new HelloCli()).execute(args);
        System.exit(exitCode);
    }
}
