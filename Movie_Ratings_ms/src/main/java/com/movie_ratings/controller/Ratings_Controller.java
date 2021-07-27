package com.movie_ratings.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie_ratings.dto.Ratings_dto;
import com.movie_ratings.service.Ratings_Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/ratings")
public class Ratings_Controller
{
    @Autowired
    private Ratings_Service ps;

    @GetMapping()
    public Flux<Ratings_dto> getall()
    {
        return ps.getallratings();
    }

    @GetMapping("/{id}")
    public Mono<Ratings_dto> getbyid(@PathVariable String id)
    {
        return ps.getrating(id);
    }

    @PostMapping
    public Mono<Ratings_dto> save(@Valid @RequestBody Mono<Ratings_dto> rt)
    {
        return ps.saverating(rt);
    }

    @PutMapping("/update/{id}")
    public Mono<Ratings_dto> update(@Valid @RequestBody Mono<Ratings_dto> rt,@PathVariable String id)
    {
        return ps.updaterating(rt,id);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> delete(@PathVariable String id)
    {
        return ps.deleterating(id);
    }

  //  public Mono<ServerResponse> handleRequest(ServerRequest request) { return sayHello(request) .onErrorReturn("Hello Stranger") .flatMap(s -> ServerResponse.ok() .contentType(MediaType.TEXT_PLAIN) .bodyValue(s)); }

}
