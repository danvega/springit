package com.vega.springit.repository;

import com.vega.springit.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VoteRepository extends JpaRepository<Vote,Long> {

    @Query( value = "SELECT SUM(direction) from Vote where link_id = ?1", nativeQuery = true)
    int sumVotesByLink(Long linkID);

}
