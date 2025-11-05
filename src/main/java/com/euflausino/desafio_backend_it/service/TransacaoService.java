package com.euflausino.desafio_backend_it.service;

import org.springframework.stereotype.Service;

import com.euflausino.desafio_backend_it.dto.TransacaoRequestDTO;
import com.euflausino.desafio_backend_it.entity.SaveTransacao;
import com.euflausino.desafio_backend_it.mapper.TransacaoMapper;

@Service
public class TransacaoService {

	public void criarTransacao( TransacaoRequestDTO criarTransacao) {
		SaveTransacao.salvarTransacao(TransacaoMapper.toEntity(criarTransacao));
		
	}

}
