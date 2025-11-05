package com.euflausino.desafio_backend_it.entity;

import java.util.ArrayList;
import java.util.List;

public class SaveTransacao {
	
	
	public static List<Transacao> salvarTransacao(Transacao transacao){
		List<Transacao> transacoesSalvas = new ArrayList<>();
		transacoesSalvas.add(transacao);
		return transacoesSalvas;
	}
	
}
