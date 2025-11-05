package com.euflausino.desafio_backend_it.service;

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
    int secounds;

    private List<Transacao> transacoes;

    public TransacaoService(List<Transacao> transacoes) {
        this.transacoes = new ArrayList<>();
    }

    public void criarTransacao(TransacaoRequestDTO criarTransacao) {
        transacoes.add(TransacaoMapper.toEntity(criarTransacao));
    }

    public void deleteTransacao() {
        transacoes.clear();
    }
    public DoubleSummaryStatistics getTransacoes() {
        OffsetDateTime inicio = OffsetDateTime.now();
        return transacoes.stream()
                .filter(t -> t.getDataHora().isAfter(inicio.minusMinutes(secounds)))
                .mapToDouble(Transacao::getValor)
                .summaryStatistics();
    }

}
