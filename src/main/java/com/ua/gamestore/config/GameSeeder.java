package com.ua.gamestore.config;

import com.ua.gamestore.domain.Game;
import com.ua.gamestore.repository.GameRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class GameSeeder implements ApplicationRunner {

    private final GameRepository repository;

    public GameSeeder(GameRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Game(null, "The Witcher 3: Wild Hunt", "CD Projekt Red",
                new BigDecimal("599.00"), 2015, "/covers/witcher3.jpg",
                "Рольова гра з відкритим світом про відьмака Геральта та пошуки Цірі.", "RPG"));
        repository.save(new Game(null, "Stalker: Shadow of Chernobyl", "GSC Game World",
                new BigDecimal("349.00"), 2007, "/covers/stalker.jpg",
                "Шутер з елементами виживання у Зоні відчуження навколо Чорнобильської АЕС.", "Шутер"));
        repository.save(new Game(null, "Hollow Knight", "Team Cherry",
                new BigDecimal("215.00"), 2017, "/covers/hollow-knight.jpg",
                "Двовимірний метроїдванія-екшн у підземному королівстві комах Геллоунесті.", "Метроїдванія"));
        repository.save(new Game(null, "Stardew Valley", "ConcernedApe",
                new BigDecimal("199.00"), 2016, "/covers/stardew.jpg",
                "Симулятор ферми: вирощуйте врожай, розводьте тварин і дружіть із жителями містечка.", "Симулятор"));
        repository.save(new Game(null, "Portal 2", "Valve",
                new BigDecimal("249.00"), 2011, "/covers/portal2.jpg",
                "Головоломка від першої особи з порталами, фізикою та чорним гумором.", "Головоломка"));
    }
}
