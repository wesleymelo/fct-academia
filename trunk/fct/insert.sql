
INSERT into enderecos VALUES(null, '10A99BF', '', '01', '92AB77', 'RA', '721202B9', 0);

INSERT into pessoas VALUES(null, 0, '2012-05-07', 'admin', '00000000000', 'A', '2012-05-07',
                          1, 'admin@admin.com', true);
                          
INSERT into secretarias VALUES(1, 0, '00:00', '00:00', '2012-05-07' );

INSERT into acessos VALUES(null, 1, MD5(1212));

INSERT into telefones VALUES (null, 1, '61', '33731526', 1);

INSERT into telefones VALUES (null, 1, '61', '84456902', 2);



--------------------------- INSERT de ESTADOS-------------------------------------------

INSERT INTO estados ('sigla', 'descricao') VALUES ('AC', 'Acre');
INSERT INTO estados ('sigla', 'descricao') VALUES ('AL', 'Alagoas');
INSERT INTO estados ('sigla', 'descricao') VALUES ('AP', 'Amapá');
INSERT INTO estados ('sigla', 'descricao') VALUES ('AM', 'Amazonas');
INSERT INTO estados ('sigla', 'descricao') VALUES ('BA', 'Bahia');
INSERT INTO estados ('sigla', 'descricao') VALUES ('CE', 'Ceará');
INSERT INTO estados ('sigla', 'descricao') VALUES ('DF', 'Distrito Federal');
INSERT INTO estados ('sigla', 'descricao') VALUES ('ES', 'Espírito Santo');
INSERT INTO estados ('sigla', 'descricao') VALUES ('GO', 'Goiás');
INSERT INTO estados ('sigla', 'descricao') VALUES ('MA', 'Maranhão');
INSERT INTO estados ('sigla', 'descricao') VALUES ('MT', 'Mato Grosso');
INSERT INTO estados ('sigla', 'descricao') VALUES ('MS', 'Mato Grosso do Sul');
INSERT INTO estados ('sigla', 'descricao') VALUES ('MG', 'Minas Gerais');
INSERT INTO estados ('sigla', 'descricao') VALUES ('PA', 'Pará');
INSERT INTO estados ('sigla', 'descricao') VALUES ('PB', 'Paraíba');
INSERT INTO estados ('sigla', 'descricao') VALUES ('PR', 'Paraná');
INSERT INTO estados ('sigla', 'descricao') VALUES ('PE', 'Pernambuco');
INSERT INTO estados ('sigla', 'descricao') VALUES ('PI', 'Piauí');
INSERT INTO estados ('sigla', 'descricao') VALUES ('RJ', 'Rio de Janeiro');
INSERT INTO estados ('sigla', 'descricao') VALUES ('RN', 'Rio Grande do Norte');
INSERT INTO estados ('sigla', 'descricao') VALUES ('RS', 'Rio Grande do Sul');
INSERT INTO estados ('sigla', 'descricao') VALUES ('RO', 'Rondônia');
INSERT INTO estados ('sigla', 'descricao') VALUES ('RR', 'Roraima');
INSERT INTO estados ('sigla', 'descricao') VALUES ('SC', 'Santa Catarina');
INSERT INTO estados ('sigla', 'descricao') VALUES ('SP', 'São Paulo');
INSERT INTO estados ('sigla', 'descricao') VALUES ('SE', 'Sergipe');
INSERT INTO estados ('sigla', 'descricao') VALUES ('TO', 'Tocantins');
