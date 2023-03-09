-- Inserting books of the Robert Cecil...
INSERT INTO tb_author(name) VALUES ('Robert Cecil Martin');
INSERT INTO tb_category(name) VALUES('Informatics');
INSERT INTO tb_book(title,author_id,edition,category_id,available) VALUES('Clean Code',1,'Illustrated',1,true);
INSERT INTO tb_book(title,author_id,edition,category_id,available) VALUES('Clean Architecture',1,'Illustrated',1,true);

-- Inserting books of the Robert Cecil...
INSERT INTO tb_author(name) VALUES ('William Gibson');
INSERT INTO tb_category(name) VALUES('Adventure and Science Fiction');
INSERT INTO tb_book(title,author_id,edition,category_id,available) VALUES('Neuromancer',2,'Illustrated',2,true);
INSERT INTO tb_book(title,author_id,edition,category_id,available) VALUES('Periféricos',2,'Illustrated',2,true);

-- Inserting users...
INSERT INTO tb_user(name, email, phone_number, CPF) VALUES ('Guilherme', 'guilhermedecarvalhomachado@gmail.com', '+55(99)99999-9999', 'XXX.XXX.XXX-XX');
INSERT INTO tb_user(name, email, phone_number, CPF) VALUES ('Maria Carolina', 'guilhermedecarvalhomachado@gmail.com', '+55(99)99999-9999', 'XXX.XXX.XXX-XX');