package com.codeguru.actor.mapper;

import com.codeguru.actor.dto.ActorDto;
import com.codeguru.actor.entity.Actor;

public class EntityDtoMapper {

    public static ActorDto toDto(Actor actor){
        return new ActorDto(
                actor.getId(),
                actor.getName()
        );
    }

}
