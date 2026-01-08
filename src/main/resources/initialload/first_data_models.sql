INSERT INTO room (number, description, price_per_night, qtd_beds_available, status, type) VALUES
(101, 'Quarto single padrão', 180.00, 1, 'AVAILABLE', 'SINGLE'),
(102, 'Quarto double confortável', 250.00, 2, 'AVAILABLE', 'DOUBLE'),
(103, 'Quarto twin econômico', 230.00, 2, 'OCCUPIED', 'TWIN'),
(104, 'Suíte luxo', 480.00, 2, 'AVAILABLE', 'SUITE'),
(105, 'Quarto família', 350.00, 3, 'OCCUPIED', 'FAMILY'),
(201, 'Quarto single andar superior', 190.00, 1, 'AVAILABLE', 'SINGLE'),
(202, 'Quarto double premium', 290.00, 2, 'AVAILABLE', 'DOUBLE'),
(203, 'Suíte deluxe', 550.00, 2, 'OCCUPIED', 'DELUXE'),
(204, 'Suíte presidencial', 950.00, 3, 'AVAILABLE', 'PRESIDENTIAL'),
(205, 'Quarto twin superior', 260.00, 2, 'AVAILABLE', 'TWIN');

-- --------------------------------------------------------------------------

INSERT INTO reservation (id, check_in, check_out, status, room_id) VALUES
(gen_random_uuid(), '2025-01-10 14:00', '2025-01-12 12:00', 'CONFIRMED', 103),
(gen_random_uuid(), '2025-01-11 15:00', '2025-01-15 12:00', 'CONFIRMED', 105),
(gen_random_uuid(), '2025-01-12 14:00', '2025-01-13 12:00', 'PENDING', 101),
(gen_random_uuid(), '2025-01-15 14:00', '2025-01-20 12:00', 'CONFIRMED', 203),
(gen_random_uuid(), '2025-01-18 14:00', '2025-01-22 12:00', 'CONFIRMED', 104),
(gen_random_uuid(), '2025-01-20 14:00', '2025-01-21 12:00', 'CANCELLED', 102),
(gen_random_uuid(), '2025-01-22 15:00', '2025-01-25 12:00', 'CONFIRMED', 201),
(gen_random_uuid(), '2025-01-25 14:00', '2025-01-30 12:00', 'CONFIRMED', 202),
(gen_random_uuid(), '2025-02-01 14:00', '2025-02-05 12:00', 'NO_SHOW', 205),
(gen_random_uuid(), '2025-02-03 14:00', '2025-02-10 12:00', 'CONFIRMED', 204);

-- --------------------------------------------------------------------------

INSERT INTO guest (document_number, email, full_name, is_reservation_holder, reservation_id) VALUES
('11111111111', 'joao@email.com', 'João Silva', true,  (SELECT id FROM reservation LIMIT 1 OFFSET 0)),
('22222222222', 'maria@email.com', 'Maria Silva', false, (SELECT id FROM reservation LIMIT 1 OFFSET 0)),
('33333333333', 'carlos@email.com', 'Carlos Santos', true,  (SELECT id FROM reservation LIMIT 1 OFFSET 1)),
('44444444444', 'ana@email.com', 'Ana Santos', false,     (SELECT id FROM reservation LIMIT 1 OFFSET 1)),
('55555555555', 'paulo@email.com', 'Paulo Lima', true,     (SELECT id FROM reservation LIMIT 1 OFFSET 2)),
('66666666666', 'lucas@email.com', 'Lucas Rocha', true,    (SELECT id FROM reservation LIMIT 1 OFFSET 3)),
('77777777777', 'bruna@email.com', 'Bruna Rocha', false,   (SELECT id FROM reservation LIMIT 1 OFFSET 3)),
('88888888888', 'fernanda@email.com', 'Fernanda Costa', true, (SELECT id FROM reservation LIMIT 1 OFFSET 4)),
('99999999999', 'ricardo@email.com', 'Ricardo Costa', false,  (SELECT id FROM reservation LIMIT 1 OFFSET 4)),
('10101010101', 'juliana@email.com', 'Juliana Alves', true, (SELECT id FROM reservation LIMIT 1 OFFSET 5)),
('12121212121', 'roberto@email.com', 'Roberto Alves', true, (SELECT id FROM reservation LIMIT 1 OFFSET 6)),
('13131313131', 'patricia@email.com', 'Patricia Nunes', true, (SELECT id FROM reservation LIMIT 1 OFFSET 7)),
('14141414141', 'felipe@email.com', 'Felipe Nunes', false, (SELECT id FROM reservation LIMIT 1 OFFSET 7)),
('15151515151', 'camila@email.com', 'Camila Torres', true, (SELECT id FROM reservation LIMIT 1 OFFSET 8)),
('16161616161', 'eduardo@email.com', 'Eduardo Torres', false,(SELECT id FROM reservation LIMIT 1 OFFSET 8)),
('17171717171', 'renata@email.com', 'Renata Lima', true, (SELECT id FROM reservation LIMIT 1 OFFSET 9)),
('18181818181', 'gustavo@email.com', 'Gustavo Lima', false,(SELECT id FROM reservation LIMIT 1 OFFSET 9));

-- --------------------------------------------------------------------------

INSERT INTO extracharges (id, amount, description, reservation_id) VALUES
(gen_random_uuid(), 50.00,  'Consumo frigobar', (SELECT id FROM reservation LIMIT 1 OFFSET 0)),
(gen_random_uuid(), 120.00, 'Serviço de quarto', (SELECT id FROM reservation LIMIT 1 OFFSET 1)),
(gen_random_uuid(), 80.00,  'Lavanderia', (SELECT id FROM reservation LIMIT 1 OFFSET 1)),
(gen_random_uuid(), 200.00, 'Spa', (SELECT id FROM reservation LIMIT 1 OFFSET 3)),
(gen_random_uuid(), 35.00,  'Estacionamento', (SELECT id FROM reservation LIMIT 1 OFFSET 4)),
(gen_random_uuid(), 60.00,  'Café da manhã extra', (SELECT id FROM reservation LIMIT 1 OFFSET 5)),
(gen_random_uuid(), 150.00, 'Jantar especial', (SELECT id FROM reservation LIMIT 1 OFFSET 7)),
(gen_random_uuid(), 90.00,  'Room service', (SELECT id FROM reservation LIMIT 1 OFFSET 7)),
(gen_random_uuid(), 300.00, 'Passeio turístico', (SELECT id FROM reservation LIMIT 1 OFFSET 9)),
(gen_random_uuid(), 45.00,  'Late checkout', (SELECT id FROM reservation LIMIT 1 OFFSET 9));
