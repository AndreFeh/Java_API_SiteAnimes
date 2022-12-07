package com.touchtechnology.plataformaresenhaanimes.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

@Data
public class RequisicaoDTO {
    private boolean finalFechado;
    private String nome;
    private String categoria;
    private Integer numEpisodios;
    private Integer numTemporadas;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataEstreia;
}
