package com.medical.model;

import java.time.OffsetDateTime;

public class Atendimento {
    private Long id;
    private Paciente paciente;
    private Profissional profissional;
    private OffsetDateTime horaAtendimento;
    private Guia guia;

}
