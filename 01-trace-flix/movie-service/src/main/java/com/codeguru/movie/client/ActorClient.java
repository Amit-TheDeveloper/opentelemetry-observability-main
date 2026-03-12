package com.codeguru.movie.client;

import com.codeguru.movie.dto.ActorDto;
import org.springframework.web.client.RestClient;

public class ActorClient {

    private final RestClient restClient;

    public ActorClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public ActorDto getActor(Integer actorId) {
        return this.restClient.get()
                              .uri("/{actorId}", actorId)
                              .retrieve()
                              .body(ActorDto.class);
    }

}
