package me.joaovictor.pokechallenge.controller;

import me.joaovictor.pokechallenge.dto.PokemonDTO;
import me.joaovictor.pokechallenge.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/{nome}")
    public PokemonDTO buscarPorNome(@PathVariable String nome) {
        return pokemonService.buscarPorNome(nome);
    }
}
