-- Insertar datos en la tabla Hotel
INSERT INTO hotel (id, name, address, city, total_rooms)
VALUES (1, 'Hotel Paradise', 'Calle 1', 'Cartagena', 5),
       (2, 'Hotel Oasis', 'Calle 2', 'Barranquilla', 10),
       (3, 'Hotel Himalaya', 'Balkhu', 'Kathmandu', 8);

-- Insertar datos en la tabla Room
INSERT INTO room (id, room_number, no_of_bed, available, hotel_id)
VALUES (1, '101', 2, true, 1),
       (2, '102', 1, false, 1),
       (3, '201', 3, true, 2),
       (4, '202', 2, true, 2),
       (5, '301', 3, false, 3),
       (6, '302', 2, true, 3);
