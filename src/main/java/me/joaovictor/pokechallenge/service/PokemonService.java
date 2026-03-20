package me.joaovictor.pokechallenge.service;

import me.joaovictor.pokechallenge.client.PokeClient;
import me.joaovictor.pokechallenge.dto.PokemonDTO;
import me.joaovictor.pokechallenge.dto.PokemonResponse;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    @Autowired
    private PokemonFactory factory;
    @Autowired
    private PokeClient pokeClient;

    public PokemonResponse buscarPorNome(String nome) {
        PokemonDTO dto = pokeClient.buscarPokemon(nome.toLowerCase());
        return factory.createResponse(dto);
    }
}