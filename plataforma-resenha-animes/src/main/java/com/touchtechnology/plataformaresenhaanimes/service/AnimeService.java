package com.touchtechnology.plataformaresenhaanimes.service;

import com.touchtechnology.plataformaresenhaanimes.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AnimeService {
    private final AnimeRepository animeRepo;

    public AnimeService(AnimeRepository animeRepo) {
        this.animeRepo = animeRepo;
    }

    public AnimeRepository getAnimeRepo() {
        return animeRepo;
    }

    private String id;
    private static String getUUID() {
        return UUID.randomUUID().toString()/*Convert p String*/.replace("-", " ");
    }
}
