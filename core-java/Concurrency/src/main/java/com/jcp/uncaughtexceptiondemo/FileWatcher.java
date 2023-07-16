package com.jcp.uncaughtexceptiondemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class FileWatcher implements Runnable{

    private final Path directory;

    public FileWatcher(String directory){
        this.directory = Paths.get(directory);
    }
    @Override
    public void run() {

        if (!Files.isDirectory(directory)){
            System.out.println("Directory not provided for file watcher. Exiting...");
            return;
        }

        List<Path> processed = new ArrayList<>();
        AtomicInteger counter = new AtomicInteger(0);
        while ( counter.get() < 2) {

            try (Stream<Path> walk = Files.list(directory)) {
                walk.filter(path -> !Files.isDirectory(path)).
                        filter(file -> !processed.contains(file)).
                        forEach(
                                file -> {
                                    Thread thread = new Thread(new FileProcessor(file));
                                    thread.setUncaughtExceptionHandler((t, e) -> System.out.println("Exception handled: " + e.getMessage()));
                                    thread.start();
                                    processed.add(file);
                                    counter.incrementAndGet();
                                }
                        );

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

    }

    public static void main(String[] args) {

        Thread watcherThread = new Thread(new FileWatcher("Concurrency\\data"));
        watcherThread.start();
        try {
            watcherThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
