# Приклади запитів (curl)

Запустіть застосунок (`mvn spring-boot:run` або клас `GamestoreApplication`), порт за замовчуванням — 8080.

## Перелік книг (картки)

```bash
curl http://localhost:8080/api/games
```

Очікувано: `200 OK`, масив карток `{id, title, developer, price, coverUrl}`.

## Одна книга з деталями

```bash
curl http://localhost:8080/api/games/1
```

Очікувано: `200 OK`, об'єкт `{id, title, developer, price, year, coverUrl, description, genre}`.

## Неіснуюча книга → 404

```bash
curl -i http://localhost:8080/api/games/999
```

Очікувано: `HTTP/1.1 404`.
