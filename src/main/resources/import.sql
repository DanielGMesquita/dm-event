INSERT INTO tb_category(description) VALUES ('Curso');
INSERT INTO tb_category(description) VALUES ('Oficina');

INSERT INTO tb_activity (name, description, price, category_id) VALUES ('Curso de HTML', 'Aprenda HTML de forma prática', 80.0, 1);
INSERT INTO tb_activity (name, description, price, category_id) VALUES ('Oficina de GitHub', 'Controle versões de seus projetos', 50.0, 2);

INSERT INTO tb_block (start_time, end_time, activity_id) VALUES (TIMESTAMP WITH TIME ZONE '2025-09-25T14:00:00Z', TIMESTAMP WITH TIME ZONE '2025-09-25T18:00:00Z', 1);
INSERT INTO tb_block (start_time, end_time, activity_id) VALUES (TIMESTAMP WITH TIME ZONE '2025-09-26T09:00:00Z', TIMESTAMP WITH TIME ZONE '2025-09-26T11:00:00Z', 2);
INSERT INTO tb_block (start_time, end_time, activity_id) VALUES (TIMESTAMP WITH TIME ZONE '2025-09-26T015:00:00Z', TIMESTAMP WITH TIME ZONE '2025-09-26T18:00:00Z', 2);


INSERT INTO tb_attendant (name, email) VALUES ('José Silva', 'jose@gmail.com');
INSERT INTO tb_attendant (name, email) VALUES ('Thiago Faria', 'tfaria@gmail.com');
INSERT INTO tb_attendant (name, email) VALUES ('Maria do Rosário', 'mrosario@gmail.com');
INSERT INTO tb_attendant (name, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_activity_attendant (activity_id, attendant_id) VALUES (1, 1);
INSERT INTO tb_activity_attendant (activity_id, attendant_id) VALUES (1, 2);
INSERT INTO tb_activity_attendant (activity_id, attendant_id) VALUES (1, 3);
INSERT INTO tb_activity_attendant (activity_id, attendant_id) VALUES (2, 1);
INSERT INTO tb_activity_attendant (activity_id, attendant_id) VALUES (2, 3);
INSERT INTO tb_activity_attendant (activity_id, attendant_id) VALUES (2, 4);