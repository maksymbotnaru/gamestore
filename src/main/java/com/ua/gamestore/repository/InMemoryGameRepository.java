package com.ua.gamestore.repository;

import com.ua.gamestore.domain.Game;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryGameRepository implements GameRepository {

    private final Map<Long, Game> storage = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(0);

    @Override
    public List<Game> findAll() {
        // ConcurrentHashMap не гарантує порядок — сортуємо за id
        return storage.values().stream()
                .sorted(Comparator.comparing(Game::getId))
                .toList();
    }

    @Override
    public Optional<Game> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public Game save(Game game) {
        if (game.getId() == null) {
            game.setId(sequence.incrementAndGet());
        }
        storage.put(game.getId(), game);
        return game;
    }
}
