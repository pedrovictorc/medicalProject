package com.medical.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Procedimento {
    private Long id;
    private String codigo;
    private String descricao;
    private OffsetDateTime duracao;
    private Convenio convenio;
    private BigDecimal valor;

}
