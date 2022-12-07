package com.touchtechnology.plataformaresenhaanimes.repository;

import com.touchtechnology.plataformaresenhaanimes.entity.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<Anime, String> {
}
