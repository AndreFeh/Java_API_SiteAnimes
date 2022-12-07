package com.touchtechnology.plataformaresenhaanimes.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.Hibernate;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Anime {
    @Id
    private String id;
    @Column(nullable = false)
    private boolean finalFechado;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 50, nullable = false)
    private String categoria;
    @Column(length = 50, nullable = false)
    private Integer numEpisodios;
    @Column(length = 50, nullable = false)
    private Integer numTemporadas;
    @Column(length = 50, nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataEstreia;
    @Column(length = 50, nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime quandoInserido;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Anime anime = (Anime) o;
        return id != null && Objects.equals(id, anime.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public Anime(String id, boolean finalFechado, String nome, String categoria, Integer numEpisodios, Integer numTemporadas, Date dataEstreia) {
        this.id = id;
        this.finalFechado = finalFechado;
        this.nome = nome;
        this.categoria = categoria;
        this.numEpisodios = numEpisodios;
        this.numTemporadas = numTemporadas;
        this.dataEstreia = dataEstreia;
    }
}
