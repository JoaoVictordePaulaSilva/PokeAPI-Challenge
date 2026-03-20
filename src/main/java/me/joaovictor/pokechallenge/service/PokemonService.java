package me.joaovictor.pokechallenge.service;

import me.joaovictor.pokechallenge.client.PokeClient;
import me.joaovictor.pokechallenge.dto.PokemonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    @Autowired
    private PokeClient pokeClient;

    public PokemonDTO buscarPorNome(String nome) {
        return pokeClient.buscarPokemon(nome);
    }
}
