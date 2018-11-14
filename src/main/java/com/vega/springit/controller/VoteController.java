package com.vega.springit.controller;

import com.vega.springit.domain.Link;
import com.vega.springit.domain.Vote;
import com.vega.springit.repository.LinkRepository;
import com.vega.springit.repository.VoteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class VoteController {

    private VoteRepository voteRepository;
    private LinkRepository linkRepository;

    public VoteController(VoteRepository voteRepository, LinkRepository linkRepository) {
        this.voteRepository = voteRepository;
        this.linkRepository = linkRepository;
    }

    @GetMapping("/vote/link/{linkID}/direction/{direction}")
    public String vote(@PathVariable Long linkID, @PathVariable short direction) {
        Optional<Link> link = linkRepository.findById(linkID);
        if( link.isPresent() ) {
            Vote vote = new Vote(direction,link.get());
            voteRepository.save(vote);
        }
        return "ok";
    }
}
