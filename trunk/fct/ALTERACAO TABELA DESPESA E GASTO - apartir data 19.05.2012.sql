
-- OBS: Essa altera��o s� � preciso ser realizada caso j� tenha o banco academia antes do dia 19/05/2012

ALTER TABLE despesas CHANGE quantidade valor DOUBLE not null;
ALTER TABLE gastos CHANGE valor quantidade INTEGER not null; 