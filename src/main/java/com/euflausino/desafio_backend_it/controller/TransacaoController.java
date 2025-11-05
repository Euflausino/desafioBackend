package com.euflausino.desafio_backend_it.controller;

import com.euflausino.desafio_backend_it.entity.Transacao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.*;

import com.euflausino.desafio_backend_it.dto.TransacaoRequestDTO;
import com.euflausino.desafio_backend_it.service.TransacaoService;

import jakarta.validation.Valid;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/api")
public class TransacaoController {
	
	private TransacaoService transacaoService;

	public TransacaoController(TransacaoService transacaoService) {
		this.transacaoService = transacaoService;
	}
	
	@PostMapping("/transacao")
	public ResponseEntity<Void> criarTransacao(@RequestBody @Valid TransacaoRequestDTO criarTransacao){
		transacaoService.criarTransacao(criarTransacao);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

    @DeleteMapping("/transacao")
    public ResponseEntity<Void> deletarTransacao(){
        transacaoService.deleteTransacao();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/estatistica")
    public ResponseEntity<DoubleSummaryStatistics> listarTransacoes(){
        return ResponseEntity.ok().body(transacaoService.getTransacoes());
    }
	
}
