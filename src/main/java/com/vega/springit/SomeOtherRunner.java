package com.vega.springit;

import org.springframework.boot.CommandLineRunner;


public class SomeOtherRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        // do some other work
        System.out.println("SomeOtherRunner...");
    }
}
