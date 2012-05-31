
-- OBS: Essa alteração só é preciso ser realizada caso já tenha o banco academia antes do dia 19/05/2012

ALTER TABLE despesas CHANGE quantidade valor DOUBLE not null;
ALTER TABLE gastos CHANGE valor quantidade INTEGER not null; 
ALTER TABLE despesas CHANGE idDespesa idDespesa INTEGER not null AUTO_INCREMENT;
ALTER TABLE alunos_graduacoes DROP COLUMN idModalidade
ALTER TABLE graduacoes CHANGE idGraduacao idGraduacao INTEGER not null AUTO_INCREMENT;
ALTER TABLE alunos_graduacoes CHANGE idGraducao idGraduacao INTEGER not null;