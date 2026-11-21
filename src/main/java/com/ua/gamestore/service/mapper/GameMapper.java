package com.ua.gamestore.service.mapper;

import com.ua.gamestore.domain.Game;
import com.ua.gamestore.web.dto.GameCardDto;
import com.ua.gamestore.web.dto.GameDetailDto;
import org.springframework.stereotype.Component;

@Component
public class GameMapper {

    public GameCardDto toCard(Game b) {
        return new GameCardDto(b.getId(), b.getTitle(), b.getDeveloper(),
                b.getPrice(), b.getCoverUrl());
    }

    public GameDetailDto toDetail(Game b) {
        return new GameDetailDto(b.getId(), b.getTitle(), b.getDeveloper(), b.getPrice(),
                b.getReleaseYear(), b.getCoverUrl(), b.getDescription(), b.getGenre());
    }
}
