package com.vega.springit;

import com.vega.springit.domain.Link;
import com.vega.springit.repository.CommentRepository;
import com.vega.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Configuration
public class ImportData {

    @Bean
    CommandLineRunner loadData(LinkRepository linkRepository) {
        return (String... args) -> {
            linkRepository.saveAll(getLinks());
        };
    }

    private List<Link> getLinks() {
        return Arrays.asList(
            new Link("Content Announcements","https://therealdanvega.com/blog/2018/09/24/content-announcements"),
            new Link("I am joining Tech Elevator","https://therealdanvega.com/blog/2018/09/07/i-am-joining-tech-elevator"),
            new Link("What you should learn as a Java Developer in 2018","https://therealdanvega.com/blog/2018/04/25/java-development-2018")
        );
    }

}
