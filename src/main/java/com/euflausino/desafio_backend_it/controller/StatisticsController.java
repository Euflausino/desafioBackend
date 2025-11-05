package com.euflausino.desafio_backend_it.controller;

import com.euflausino.desafio_backend_it.dto.StatisticsResponseDTO;
import com.euflausino.desafio_backend_it.service.TransacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/estatistica")
public class StatisticsController {

    private final TransacaoService transacaoService;

    public StatisticsController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @GetMapping
    public ResponseEntity<StatisticsResponseDTO> listarTransacoes(){
        return ResponseEntity.ok().body(transacaoService.getTransactions());
    }

}
