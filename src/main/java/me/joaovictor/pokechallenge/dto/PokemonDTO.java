package me.joaovictor.pokechallenge.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDTO {
    private Integer id;
    private String name;
    private List<TypeSlot> types;
    private Sprites sprites;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TypeSlot {
        private TypeInfo type;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TypeInfo {
        private String name;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Sprites {
        @JsonProperty("front_default")
        private String frontDefault;
    }
}