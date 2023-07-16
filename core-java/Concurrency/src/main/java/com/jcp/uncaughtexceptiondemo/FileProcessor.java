package com.jcp.uncaughtexceptiondemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor implements Runnable{

    private final Path file;


    public FileProcessor(Path file){
        this.file = file;

    }
    @Override
    public void run() {
        Path outDir = Paths.get(file.getParent().toString(), "output");

        if ( !Files.isDirectory(outDir) ){
            try {
                Files.createDirectory(outDir);
            } catch (IOException e) {
                System.out.println("Directory exists, ignore this...");
            }
        }

        Path outFile = Paths.get(outDir.toString(), file.getFileName() + ".output.txt");


        try (BufferedReader reader = Files.newBufferedReader(file);
             BufferedWriter writer = Files.newBufferedWriter(outFile)){

            String line;
            while ((line = reader.readLine()) != null){
                if ( line.equals("")){
                    throw new RuntimeException("Empty string encountered in file: " + file.getFileName());
                }
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Processed file " + file.getFileName());

    }

}
