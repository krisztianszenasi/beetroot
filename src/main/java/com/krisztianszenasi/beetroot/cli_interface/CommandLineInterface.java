package com.krisztianszenasi.beetroot.cli_interface;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CommandLineInterface {

    public static Path handleArguments(String[] args) {
        if(args.length == 0) {
            displayHelpMessage();
            System.exit(0);
        }
        return Paths.get(args[0]).toAbsolutePath();
    }

    public static void displayHelpMessage() {
        System.out.println("Usage: beetroot <input file>");
    }
}
