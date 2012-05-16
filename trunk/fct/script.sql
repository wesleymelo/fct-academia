SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;

SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';



DROP SCHEMA IF EXISTS `academia` ;

CREATE SCHEMA IF NOT EXISTS `academia` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;

USE `academia` ;



-- -----------------------------------------------------

-- Table `academia`.`Enderecos`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Enderecos` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Enderecos` (

  `idEndereco` INT(11) NOT NULL AUTO_INCREMENT ,

  `enderecoResidencial` VARCHAR(100) NOT NULL ,

  `complemento` VARCHAR(100) NULL ,

  `bairro` VARCHAR(50) NOT NULL ,

  `cidade` VARCHAR(50) NOT NULL ,

  `uf` CHAR(2) NOT NULL ,

  `cep` CHAR(8) NOT NULL ,

  `numero` INT(11) NOT NULL ,

  PRIMARY KEY (`idEndereco`) )

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Pessoas`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Pessoas` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Pessoas` (

  `idPessoa` INT(11) NOT NULL AUTO_INCREMENT ,

  `tipoPessoa` INT(11) NOT NULL ,

  `dataCadastro` DATETIME NOT NULL ,

  `nome` VARCHAR(50) NOT NULL ,

  `cpf` CHAR(11) NOT NULL ,

  `sexo` CHAR(1) NOT NULL ,

  `dataNascimento` DATE NOT NULL ,

  `idEndereco` INT(11) NOT NULL ,

  `email` VARCHAR(100) NOT NULL ,

  `status` TINYINT(1) NOT NULL ,

  PRIMARY KEY (`idPessoa`) ,

  INDEX `fk_Clientes_Enderecos1` (`idEndereco` ASC) ,

  CONSTRAINT `fk_Clientes_Enderecos1`

    FOREIGN KEY (`idEndereco` )

    REFERENCES `academia`.`Enderecos` (`idEndereco` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Telefones`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Telefones` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Telefones` (

  `idTelefone` INT(11) NOT NULL AUTO_INCREMENT ,

  `idPessoa` INT(11) NOT NULL ,

  `ddd` CHAR(2) NOT NULL ,

  `numero` CHAR(8) NOT NULL ,

  `tipo` VARCHAR(9) NOT NULL ,

  PRIMARY KEY (`idTelefone`) ,

  INDEX `fk_Telefones_Pessoas1` (`idPessoa` ASC) ,

  CONSTRAINT `fk_Telefones_Pessoas1`

    FOREIGN KEY (`idPessoa` )

    REFERENCES `academia`.`Pessoas` (`idPessoa` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Modalidades`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Modalidades` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Modalidades` (

  `idModalidade` INT(11) NOT NULL AUTO_INCREMENT ,

  `descricao` VARCHAR(100) NOT NULL ,

  PRIMARY KEY (`idModalidade`) )

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Pacotes`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Pacotes` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Pacotes` (

  `idPacote` INT(11) NOT NULL ,

  `descricao` VARCHAR(100) NOT NULL ,

  `preco` DOUBLE NOT NULL ,

  PRIMARY KEY (`idPacote`) )

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Professores`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Professores` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Professores` (

  `idProfessor` INT(11) NOT NULL ,

  `dataAdmissao` DATETIME NOT NULL ,

  PRIMARY KEY (`idProfessor`) ,

  INDEX `fk_Professores_Pessoas` (`idProfessor` ASC) ,

  CONSTRAINT `fk_Professores_Pessoas1`

    FOREIGN KEY (`idProfessor` )

    REFERENCES `academia`.`Pessoas` (`idPessoa` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Secretarias`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Secretarias` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Secretarias` (

  `idSecretaria` INT(11) NOT NULL ,

  `salario` DOUBLE NOT NULL ,

  `horarioInicial` TIME NOT NULL ,

  `horarioFinal` TIME NOT NULL ,

  `dataAdmissao` VARCHAR(50) NULL ,

  PRIMARY KEY (`idSecretaria`) ,

  INDEX `fk_Secretarias_Pessoas` (`idSecretaria` ASC) ,

  CONSTRAINT `fk_Aluno_Pessoas1`

    FOREIGN KEY (`idSecretaria` )

    REFERENCES `academia`.`Pessoas` (`idPessoa` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Alunos`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Alunos` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Alunos` (

  `idAluno` INT(11) NOT NULL ,

  `peso` DOUBLE NOT NULL ,

  `altura` DOUBLE NOT NULL ,

  PRIMARY KEY (`idAluno`) ,

  INDEX `fk_Alunos_Pessoas` (`idAluno` ASC) ,

  CONSTRAINT `fk_Alunos_Pessoas1`

    FOREIGN KEY (`idAluno` )

    REFERENCES `academia`.`Pessoas` (`idPessoa` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Turmas`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Turmas` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Turmas` (

  `idTurma` INT(11) NOT NULL ,

  `idProfessor` INT(11) NOT NULL ,

  `idModalidade` INT(11) NOT NULL ,

  `nome` VARCHAR(50) NOT NULL ,

  `horarioInicial` TIME NOT NULL ,

  `horarioFinal` TIME NOT NULL ,

  PRIMARY KEY (`idTurma`) ,

  INDEX `fk_Turmas_Professores1` (`idProfessor` ASC) ,

  INDEX `fk_Turmas_Modalidades1` (`idModalidade` ASC) ,

  CONSTRAINT `fk_Turmas_Professores1`

    FOREIGN KEY (`idProfessor` )

    REFERENCES `academia`.`Professores` (`idProfessor` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Turmas_Modalidades1`

    FOREIGN KEY (`idModalidade` )

    REFERENCES `academia`.`Modalidades` (`idModalidade` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Alunos_turmas`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Alunos_turmas` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Alunos_turmas` (

  `idAluno` INT(11) NOT NULL ,

  `idTurma` INT(11) NOT NULL ,

  PRIMARY KEY (`idAluno`, `idTurma`) ,

  INDEX `fk_Alunos_turmas_Alunos1` (`idAluno` ASC) ,

  INDEX `fk_Alunos_turmas_Turmas1` (`idTurma` ASC) ,

  CONSTRAINT `fk_Alunos_turmas_Alunos1`

    FOREIGN KEY (`idAluno` )

    REFERENCES `academia`.`Alunos` (`idAluno` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Alunos_turmas_Turmas1`

    FOREIGN KEY (`idTurma` )

    REFERENCES `academia`.`Turmas` (`idTurma` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Graduacoes`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Graduacoes` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Graduacoes` (

  `idGraduacao` INT(11) NOT NULL ,

  `idModalidade` INT(11) NOT NULL ,

  `descricao` VARCHAR(100) NOT NULL ,

  PRIMARY KEY (`idGraduacao`) ,

  INDEX `fk_Graduacoes_Modalidades1` (`idModalidade` ASC) ,

  CONSTRAINT `fk_Graduacoes_Modalidades1`

    FOREIGN KEY (`idModalidade` )

    REFERENCES `academia`.`Modalidades` (`idModalidade` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Alunos_graduacoes`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Alunos_graduacoes` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Alunos_graduacoes` (

  `idAluno` INT(11) NOT NULL ,

  `idGraducao` INT(11) NOT NULL ,

  `idModalidade` INT(11) NOT NULL ,

  PRIMARY KEY (`idAluno`, `idGraducao`, `idModalidade`) ,

  INDEX `fk_Alunos_graduacoes_Alunos1` (`idAluno` ASC) ,

  INDEX `fk_Alunos_graduacoes_Graduacoes1` (`idGraducao` ASC) ,

  CONSTRAINT `fk_Alunos_graduacoes_Alunos1`

    FOREIGN KEY (`idAluno` )

    REFERENCES `academia`.`Alunos` (`idAluno` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Alunos_graduacoes_Graduacoes1`

    FOREIGN KEY (`idGraducao` )

    REFERENCES `academia`.`Graduacoes` (`idGraduacao` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Pagamentos`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Pagamentos` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Pagamentos` (

  `idPagamento` INT(11) NOT NULL ,

  `valorPago` DOUBLE NOT NULL ,

  `dataPagamento` DATETIME NOT NULL ,

  PRIMARY KEY (`idPagamento`) )

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Pacotes_modalidades`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Pacotes_modalidades` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Pacotes_modalidades` (

  `idPacote` INT(11) NOT NULL ,

  `idModalidade` INT(11) NOT NULL ,

  `idAluno` INT(11) NOT NULL ,

  `idPagamento` INT(11) NOT NULL ,

  PRIMARY KEY (`idPacote`, `idModalidade`) ,

  INDEX `fk_Pacotes_modalidades_Pacotes1` (`idPacote` ASC) ,

  INDEX `fk_Pacotes_modalidades_Modalidades1` (`idModalidade` ASC) ,

  INDEX `fk_Pacotes_modalidades_Alunos1` (`idAluno` ASC) ,

  INDEX `fk_Pacotes_modalidades_Pagamentos1` (`idPagamento` ASC) ,

  CONSTRAINT `fk_Pacotes_modalidades_Pacotes1`

    FOREIGN KEY (`idPacote` )

    REFERENCES `academia`.`Pacotes` (`idPacote` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Pacotes_modalidades_Modalidades1`

    FOREIGN KEY (`idModalidade` )

    REFERENCES `academia`.`Modalidades` (`idModalidade` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Pacotes_modalidades_Alunos1`

    FOREIGN KEY (`idAluno` )

    REFERENCES `academia`.`Alunos` (`idAluno` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Pacotes_modalidades_Pagamentos1`

    FOREIGN KEY (`idPagamento` )

    REFERENCES `academia`.`Pagamentos` (`idPagamento` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Envelopes`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Envelopes` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Envelopes` (

  `idEnvelope` INT(11) NOT NULL ,

  `idSecretaria` INT(11) NOT NULL ,

  `idProfessor` INT(11) NOT NULL ,

  PRIMARY KEY (`idEnvelope`) ,

  INDEX `fk_Envelopes_Professores1` (`idProfessor` ASC) ,

  INDEX `fk_Envelopes_Secretarias1` (`idSecretaria` ASC) ,

  CONSTRAINT `fk_Envelopes_Professores1`

    FOREIGN KEY (`idProfessor` )

    REFERENCES `academia`.`Professores` (`idProfessor` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Envelopes_Secretarias1`

    FOREIGN KEY (`idSecretaria` )

    REFERENCES `academia`.`Secretarias` (`idSecretaria` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Alunos_envelopes`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Alunos_envelopes` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Alunos_envelopes` (

  `idAluno` INT(11) NOT NULL ,

  `idEnvelope` INT(11) NOT NULL ,

  `dataEnvelope` DATETIME NOT NULL ,

  PRIMARY KEY (`idAluno`, `idEnvelope`) ,

  INDEX `fk_Alunos_envelopes_Envelopes1` (`idEnvelope` ASC) ,

  INDEX `fk_Alunos_envelopes_Alunos1` (`idAluno` ASC) ,

  CONSTRAINT `fk_Alunos_envelopes_Envelopes1`

    FOREIGN KEY (`idEnvelope` )

    REFERENCES `academia`.`Envelopes` (`idEnvelope` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Alunos_envelopes_Alunos1`

    FOREIGN KEY (`idAluno` )

    REFERENCES `academia`.`Alunos` (`idAluno` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Acessos`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Acessos` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Acessos` (

  `idAcesso` INT(11) NOT NULL AUTO_INCREMENT ,

  `idPessoa` INT(11) NOT NULL ,

  `senha` TEXT NOT NULL ,

  PRIMARY KEY (`idAcesso`) ,

  INDEX `fk_Acessos_Pessoas1` (`idPessoa` ASC) ,

  CONSTRAINT `fk_Acessos_Pessoas1`

    FOREIGN KEY (`idPessoa` )

    REFERENCES `academia`.`Pessoas` (`idPessoa` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Despesas`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Despesas` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Despesas` (

  `idDespesa` INT(11) NOT NULL ,

  `descricao` VARCHAR(255) NOT NULL ,

  `quantidade` INT(11) NOT NULL ,

  PRIMARY KEY (`idDespesa`) )

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `academia`.`Gastos`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `academia`.`Gastos` ;



CREATE  TABLE IF NOT EXISTS `academia`.`Gastos` (

  `idGasto` INT(11) NOT NULL ,

  `idDespesa` INT(11) NOT NULL ,

  `valor` DOUBLE NOT NULL ,

  `data` DATETIME NOT NULL ,

  `idSecretaria` INT(11) NOT NULL ,

  PRIMARY KEY (`idGasto`) ,

  INDEX `fk_Gastos_Secretarias1` (`idSecretaria` ASC) ,

  INDEX `fk_Gastos_Despesas1` (`idDespesa` ASC) ,

  CONSTRAINT `fk_Gastos_Secretarias1`

    FOREIGN KEY (`idSecretaria` )

    REFERENCES `academia`.`Secretarias` (`idSecretaria` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Gastos_Despesas1`

    FOREIGN KEY (`idDespesa` )

    REFERENCES `academia`.`Despesas` (`idDespesa` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;

-- -----------------------------------------------------

-- Table `mydb`.`estados`

-- -----------------------------------------------------


CREATE TABLE if not exists estados (
  codigo INTEGER NOT NULL AUTO_INCREMENT,
  sigla VARCHAR(2) NOT NULL,
  descricao VARCHAR(30) NOT NULL,
  PRIMARY KEY(codigo)
);



SET SQL_MODE=@OLD_SQL_MODE;

SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;

SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

