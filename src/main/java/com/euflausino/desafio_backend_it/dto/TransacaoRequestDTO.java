package com.euflausino.desafio_backend_it.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

public record TransacaoRequestDTO(
		
		@NotNull
		@DecimalMin(value = "0.0")
		BigDecimal valor,
		
		@NotNull
		@PastOrPresent
		OffsetDateTime dataHora
		
		) {

}
