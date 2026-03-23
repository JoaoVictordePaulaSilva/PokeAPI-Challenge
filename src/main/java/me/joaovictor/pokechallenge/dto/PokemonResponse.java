package me.joaovictor.pokechallenge.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PokemonResponse {
    private Integer id;
    private String nome;
    private List<String> tipos;     // Este deve ser List<String>
    private String imagemUrl;       // Este deve ser APENAS String
}

