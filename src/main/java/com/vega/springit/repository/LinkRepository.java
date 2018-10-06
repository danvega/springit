package com.vega.springit.repository;

import com.vega.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link,Long> {

    Link findMyLinkByTitle(String title);

    Link findByTitle(String title);

    List<Link> findAllByTitleLike(String title);

    @Query( value = "select * from Link where url like 'http%'", nativeQuery = true )
    List<Link> findLinksThatStartWithHttp();
}
