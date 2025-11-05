package com.euflausino.desafio_backend_it.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record ResponseErrorDTO(

        String message,
        int status,
        @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss")
        LocalDateTime timeStamp

) {
    public ResponseErrorDTO(String message, int status) {
        this(message, status, LocalDateTime.now());
    }
}
