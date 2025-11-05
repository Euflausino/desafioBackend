package com.euflausino.desafio_backend_it.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.euflausino.desafio_backend_it.dto.TransacaoRequestDTO;
import com.euflausino.desafio_backend_it.service.TransacaoService;

import jakarta.validation.Valid;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
	
	private final TransacaoService transacaoService;

	public TransacaoController(TransacaoService transacaoService) {
		this.transacaoService = transacaoService;
	}
	
	@PostMapping
	public ResponseEntity<Void> criarTransacao(@RequestBody @Valid TransacaoRequestDTO criarTransacao){
		transacaoService.criarTransacao(criarTransacao);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

    @DeleteMapping
    public ResponseEntity<Void> deletarTransacao(){
        transacaoService.deleteTransacao();
        return ResponseEntity.ok().build();
    }


	
}
