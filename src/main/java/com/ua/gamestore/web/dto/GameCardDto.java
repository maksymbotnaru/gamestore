package com.ua.gamestore.web.dto;

import java.math.BigDecimal;

public record GameCardDto(Long id, String title, String developer,
                          BigDecimal price, String coverUrl) {
}
