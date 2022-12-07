package com.touchtechnology.plataformaresenhaanimes.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) //So aparecer atributos nao nulos
public class AnimeDTO {
    private String id;
    private boolean finalFechado;
    private String nome;
    private String categoria;
    private Integer numEpisodios;
    private Integer numTemporadas;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataEstreia;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime quandoInserido;
}
