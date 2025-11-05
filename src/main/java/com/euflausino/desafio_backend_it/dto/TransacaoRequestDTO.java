package com.euflausino.desafio_backend_it.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

public record TransacaoRequestDTO(
		
		@NotNull(message = "Valor deve ser maior ou igual a zero")
		@Min(0)
		Double valor,
		
		@NotNull
		@PastOrPresent
		OffsetDateTime dataHora
		
		) {

}
