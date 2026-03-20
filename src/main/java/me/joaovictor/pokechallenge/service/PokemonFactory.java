package me.joaovictor.pokechallenge.service;

import me.joaovictor.pokechallenge.dto.PokemonDTO;
import me.joaovictor.pokechallenge.dto.PokemonResponse;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;

@Component
public class PokemonFactory {

    public PokemonResponse createResponse(PokemonDTO dto) {
        return PokemonResponse.builder()
                .id(dto.getId())
                .nome(dto.getName()) // Agora o DTO tem getName()
                .imagemUrl(dto.getSprites().getFrontDefault())
                .tipos(dto.getTypes().stream()
                        .map(slot -> slot.getType().getName()) // Agora TypeInfo tem getName()
                        .collect(Collectors.toList()))
                .build();
    }
}