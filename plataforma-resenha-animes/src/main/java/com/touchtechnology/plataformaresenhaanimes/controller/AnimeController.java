package com.touchtechnology.plataformaresenhaanimes.controller;

import com.touchtechnology.plataformaresenhaanimes.dto.AnimeDTO;
import com.touchtechnology.plataformaresenhaanimes.service.AnimeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimeController {
    private final AnimeService animeService;

    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    public AnimeService getAnimeService() {
        return animeService;
    }
//
//    @GetMapping
//    public ResponseEntity<AnimeDTO> findById(){
//        return animeService;
//    }
}
