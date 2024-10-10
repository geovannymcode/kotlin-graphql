-- Crear tabla hotel
CREATE TABLE IF NOT EXISTS hotel
(
    id          BIGINT PRIMARY KEY,
    name        VARCHAR(255),
    address     VARCHAR(255),
    city        VARCHAR(255),
    total_rooms INT
);

-- Crear tabla room
CREATE TABLE IF NOT EXISTS room
(
    id          BIGINT PRIMARY KEY,
    room_number VARCHAR(255),
    no_of_bed   INT,
    available   BOOLEAN,
    hotel_id    BIGINT,
    CONSTRAINT fk_hotel FOREIGN KEY (hotel_id) REFERENCES hotel (id)
);