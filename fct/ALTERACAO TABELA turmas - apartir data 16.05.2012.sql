
-- OBS: Essa alteração só é preciso ser realizada caso já tenha o banco academia antes do dia 16/05/2012

ALTER TABLE turmas CHANGE horario horarioInicial TIME not null;
ALTER TABLE turmas ADD `horarioFinal` TIME not null AFTER horarioInicial; 
ALTER TABLE turmas CHANGE nomeTurma nome varchar(50) not null;
ALTER TABLE turmas CHANGE idTurma idTurma INTEGER not null AUTO_INCREMENT;
ALTER TABLE turmas ADD `capacidade` INTEGER not null AFTER horarioFinal;