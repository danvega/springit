package com.vega.springit;

import com.vega.springit.domain.Comment;
import com.vega.springit.domain.Link;
import com.vega.springit.repository.CommentRepository;
import com.vega.springit.repository.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	/*
	@Bean
	CommandLineRunner runner(LinkRepository linkRepository){
		return args -> {
			linkRepository.save(new Link("My First Link","http://www.therealdanvega.com") );
			linkRepository.save(new Link("Spring Boot 2","http://www.therealdanvega.com") );
			linkRepository.save(new Link("Spring Boot 3 Preview","http://www.therealdanvega.com") );
			linkRepository.save(new Link("VueJs Rocks","http://www.therealdanvega.com") );

			// find a link by title
			Link firstLink = linkRepository.findMyLinkByTitle("My First Link");
			System.out.println(firstLink);

			List<Link> links = linkRepository.findAllByTitleLike("%Spring%");
			System.out.println(links);

			List<Link> httpLinks = linkRepository.findLinksThatStartWithHttp();
			System.out.println(httpLinks);
		};
	}
	*/

//	@Bean
//	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
//		return (String... args) -> {
//			Link link = new Link("Getting Started with Spring Boot 2","https://therealdanvega.com/spring-boot-2");
//			linkRepository.save( link );
//
//			Comment comment = new Comment("This Spring Boot 2 Link is awesome",link);
//			commentRepository.save(comment);
//			link.addComment(comment);
//
//			System.out.println(link.getComments());
//		};
//	}
}
