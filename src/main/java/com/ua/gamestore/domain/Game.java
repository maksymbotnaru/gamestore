package com.ua.gamestore.domain;

import java.math.BigDecimal;

public class Game {
    private Long id;
    private String title;
    private String developer;
    private BigDecimal price;
    private Integer releaseYear;
    private String coverUrl;
    private String description;
    private String genre;

    public Game() {
    }

    public Game(Long id, String title, String developer, BigDecimal price,
                Integer releaseYear, String coverUrl, String description, String genre) {
        this.id = id;
        this.title = title;
        this.developer = developer;
        this.price = price;
        this.releaseYear = releaseYear;
        this.coverUrl = coverUrl;
        this.description = description;
        this.genre = genre;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDeveloper() { return developer; }
    public void setDeveloper(String developer) { this.developer = developer; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public Integer getReleaseYear() { return releaseYear; }
    public void setReleaseYear(Integer releaseYear) { this.releaseYear = releaseYear; }

    public String getCoverUrl() { return coverUrl; }
    public void setCoverUrl(String coverUrl) { this.coverUrl = coverUrl; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
}
