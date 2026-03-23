package me.joaovictor.pokechallenge.controller;

import me.joaovictor.pokechallenge.dto.PokemonResponse;
import me.joaovictor.pokechallenge.service.PokemonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/{nome}")
    @ResponseBody
    public PokemonResponse buscarPorNome(@PathVariable String nome) {
        return pokemonService.buscarPorNome(nome);
    }

    @GetMapping("/pokedex")
    public ModelAndView pokedex(@RequestParam(required = false) String nome) {
        ModelAndView mv = new ModelAndView("index");
        if (nome != null && !nome.isEmpty()) {
            PokemonResponse pokemon = pokemonService.buscarPorNome(nome);
            mv.addObject("pokemon", pokemon);
        }
        return mv;
    }
}