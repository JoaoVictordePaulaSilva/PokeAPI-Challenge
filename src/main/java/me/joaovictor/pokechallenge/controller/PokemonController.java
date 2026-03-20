package me.joaovictor.pokechallenge.controller;

import me.joaovictor.pokechallenge.dto.PokemonResponse; // Importe a Response agora
import me.joaovictor.pokechallenge.service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    // Injeção por construtor (Boa prática!)
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/{nome}")
    public PokemonResponse buscarPorNome(@PathVariable String nome) {
        return pokemonService.buscarPorNome(nome);
    }
}