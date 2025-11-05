package com.euflausino.desafio_backend_it.service;

import com.euflausino.desafio_backend_it.dto.StatisticsResponseDTO;
import com.euflausino.desafio_backend_it.entity.Transacao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.euflausino.desafio_backend_it.dto.TransacaoRequestDTO;
import com.euflausino.desafio_backend_it.mapper.TransacaoMapper;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

@Service
public class TransacaoService {

    @Value("${second.value}")
    int seconds;

    private final List<Transacao> transactions = new ArrayList<>();

    public void criarTransacao(TransacaoRequestDTO criarTransacao) {
        transactions.add(TransacaoMapper.toEntity(criarTransacao));
    }

    public void deleteTransacao() {
        transactions.clear();
    }
        public StatisticsResponseDTO getTransactions() {
        OffsetDateTime inicio = OffsetDateTime.now();
        DoubleSummaryStatistics stats = transactions.stream()
                .filter(t -> t.getDataHora().isAfter(inicio.minusMinutes(seconds)))
                .mapToDouble(Transacao::getValor)
                .summaryStatistics();
        return new StatisticsResponseDTO(stats);

    }

}
