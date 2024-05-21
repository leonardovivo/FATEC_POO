-- Active: 1714681512210@@mysql-8b9faa-professorbossini.e.aivencloud.com@12956@defaultdb
CREATE TABLE tb_pessoa(
  cod_pessoa INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(200) NOT NULL,
  fone VARCHAR(200) NOT NULL,
  email VARCHAR(200) NULL
);

INSERT INTO tb_pessoa
(nome, fone, email)
VALUES
('José', '11223344', 'jose@email.com');

INSERT INTO tb_pessoa
(nome, fone, email)
VALUES
('João', '22334455', 'joao@email.com'),
('Maria', '33445566', 'maria@email.com');

SELECT * FROM tb_pessoa;
SELECT nome, email FROM tb_pessoa;

SELECT * FROM tb_pessoa WHERE cod_pessoa = 1;

SELECT * FROM tb_pessoa WHERE nome LIKE 'J%';

UPDATE tb_pessoa SET nome = 'José da Silva' WHERE cod_pessoa = 1;

-- tanto João quanto Maria têm sobrenome Gomes
--fazer usando um único update
UPDATE tb_pessoa SET nome = CONCAT(nome, ' Gomes')
WHERE cod_pessoa IN (2, 3);


DELETE FROM tb_pessoa WHERE cod_pessoa = 2;]


-- encontrar um comando para 

-- adicionar uma coluna chamada ativo 
-- ela é boolean
-- todo mundo que já existe, tem o valor padrão true
-- ou seja, quando adicionar essa coluna, todas as linhas existentes
-- ficam com valor true

