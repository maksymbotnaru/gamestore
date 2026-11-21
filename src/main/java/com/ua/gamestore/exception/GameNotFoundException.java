package com.ua.gamestore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GameNotFoundException extends RuntimeException {
    public GameNotFoundException(Long id) {
        super("Гру з id=" + id + " не знайдено");
    }
}
