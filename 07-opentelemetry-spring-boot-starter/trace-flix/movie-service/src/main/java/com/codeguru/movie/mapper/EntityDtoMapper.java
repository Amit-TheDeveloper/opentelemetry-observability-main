package com.codeguru.movie.mapper;


import com.codeguru.movie.dto.ActorDto;
import com.codeguru.movie.dto.MovieDto;
import com.codeguru.movie.dto.ReviewDto;
import com.codeguru.movie.entity.Movie;

import java.util.List;

public class EntityDtoMapper {

    public static MovieDto toDto(Movie movie, List<ActorDto> actors, List<ReviewDto> reviews){
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getReleaseYear(),
                actors,
                reviews
        );
    }

}
