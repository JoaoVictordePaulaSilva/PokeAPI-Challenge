package me.joaovictor.pokechallenge.exception;

import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(FeignException.NotFound.class)
    public ResponseEntity<String> handleNotFound(FeignException.NotFound e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Erro: Pokémon não encontrado na base da PokeAPI.");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericError(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Ocorreu um erro inesperado no servidor.");
    }
}