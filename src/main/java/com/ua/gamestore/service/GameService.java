package com.ua.gamestore.service;

import com.ua.gamestore.web.dto.GameCardDto;
import com.ua.gamestore.web.dto.GameDetailDto;

import java.util.List;

public interface GameService {
    List<GameCardDto> findAll();

    GameDetailDto findById(Long id);
}
