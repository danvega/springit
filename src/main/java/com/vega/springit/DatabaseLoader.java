package com.vega.springit;

import org.springframework.boot.CommandLineRunner;

public class DatabaseLoader implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // do some database work
        System.out.println("DatabaseLoader...");
    }
}
