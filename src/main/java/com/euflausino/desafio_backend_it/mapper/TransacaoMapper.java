package com.euflausino.desafio_backend_it.mapper;

import com.euflausino.desafio_backend_it.dto.TransacaoRequestDTO;
import com.euflausino.desafio_backend_it.entity.Transacao;

public class TransacaoMapper {
	
	public static Transacao toEntity(TransacaoRequestDTO dados) {
		return new Transacao(dados.valor(), dados.dataHora());
	}
	
}
