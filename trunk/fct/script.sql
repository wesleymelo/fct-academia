SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;

SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';



DROP SCHEMA IF EXISTS `academia` ;

CREATE SCHEMA IF NOT EXISTS `academia` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;

USE `academia` ;



-- -----------------------------------------------------

-- Table `mydb`.`Enderecos`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Enderecos` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Enderecos` (

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

-- Table `mydb`.`Pessoas`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Pessoas` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Pessoas` (

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

  INDEX `fk_Clientes_Endereços1` (`idEndereco` ASC) ,

  CONSTRAINT `fk_Clientes_Endereços1`

    FOREIGN KEY (`idEndereco` )

    REFERENCES `mydb`.`Enderecos` (`idEndereco` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Telefones`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Telefones` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Telefones` (

  `idTelefone` INT(11) NOT NULL AUTO_INCREMENT ,

  `idPessoa` INT(11) NOT NULL ,

  `ddd` CHAR(2) NOT NULL ,

  `numero` CHAR(8) NOT NULL ,

  `tipo` VARCHAR(9) NOT NULL ,

  PRIMARY KEY (`idTelefone`) ,

  INDEX `fk_Telefones_Pessoas1` (`idPessoa` ASC) ,

  CONSTRAINT `fk_Telefones_Pessoas1`

    FOREIGN KEY (`idPessoa` )

    REFERENCES `mydb`.`Pessoas` (`idPessoa` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Modalidades`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Modalidades` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Modalidades` (

  `idModalidade` INT(11) NOT NULL AUTO_INCREMENT ,

  `descricao` VARCHAR(100) NOT NULL ,

  PRIMARY KEY (`idModalidade`) )

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Pacotes`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Pacotes` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Pacotes` (

  `idPacote` INT(11) NOT NULL ,

  `descricao` VARCHAR(100) NOT NULL ,

  `preco` DOUBLE NOT NULL ,

  PRIMARY KEY (`idPacote`) )

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Professores`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Professores` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Professores` (

  `idProfessor` INT(11) NOT NULL ,

  `dataAdmissao` DATETIME NOT NULL ,

  PRIMARY KEY (`idProfessor`) ,

  INDEX `fk_Professores_Pessoas` (`idProfessor` ASC) ,

  CONSTRAINT `fk_Professores_Pessoas1`

    FOREIGN KEY (`idProfessor` )

    REFERENCES `mydb`.`Pessoas` (`idPessoa` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Secretarias`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Secretarias` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Secretarias` (

  `idSecretaria` INT(11) NOT NULL ,

  `salario` DOUBLE NOT NULL ,

  `horarioInicial` TIME NOT NULL ,

  `horarioFinal` TIME NOT NULL ,

  `dataAdmissao` VARCHAR(50) NULL ,

  PRIMARY KEY (`idSecretaria`) ,

  INDEX `fk_Secretarias_Pessoas` (`idSecretaria` ASC) ,

  CONSTRAINT `fk_Aluno_Pessoas1`

    FOREIGN KEY (`idSecretaria` )

    REFERENCES `mydb`.`Pessoas` (`idPessoa` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Alunos`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Alunos` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Alunos` (

  `idAluno` INT(11) NOT NULL ,

  `peso` DOUBLE NOT NULL ,

  `altura` DOUBLE NOT NULL ,

  PRIMARY KEY (`idAluno`) ,

  INDEX `fk_Alunos_Pessoas` (`idAluno` ASC) ,

  CONSTRAINT `fk_Alunos_Pessoas1`

    FOREIGN KEY (`idAluno` )

    REFERENCES `mydb`.`Pessoas` (`idPessoa` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Turmas`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Turmas` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Turmas` (

  `idTurma` INT(11) NOT NULL ,

  `idProfessor` INT(11) NOT NULL ,

  `idModalidade` INT(11) NOT NULL ,

  `nomeTurma` VARCHAR(50) NOT NULL ,

  `horario` TIME NOT NULL ,

  PRIMARY KEY (`idTurma`) ,

  INDEX `fk_Turmas_Professores1` (`idProfessor` ASC) ,

  INDEX `fk_Turmas_Modalidades1` (`idModalidade` ASC) ,

  CONSTRAINT `fk_Turmas_Professores1`

    FOREIGN KEY (`idProfessor` )

    REFERENCES `mydb`.`Professores` (`idProfessor` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Turmas_Modalidades1`

    FOREIGN KEY (`idModalidade` )

    REFERENCES `mydb`.`Modalidades` (`idModalidade` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Alunos_turmas`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Alunos_turmas` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Alunos_turmas` (

  `idAluno` INT(11) NOT NULL ,

  `idTurma` INT(11) NOT NULL ,

  PRIMARY KEY (`idAluno`, `idTurma`) ,

  INDEX `fk_Alunos_turmas_Alunos1` (`idAluno` ASC) ,

  INDEX `fk_Alunos_turmas_Turmas1` (`idTurma` ASC) ,

  CONSTRAINT `fk_Alunos_turmas_Alunos1`

    FOREIGN KEY (`idAluno` )

    REFERENCES `mydb`.`Alunos` (`idAluno` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Alunos_turmas_Turmas1`

    FOREIGN KEY (`idTurma` )

    REFERENCES `mydb`.`Turmas` (`idTurma` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Graduacoes`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Graduacoes` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Graduacoes` (

  `idGraduacao` INT(11) NOT NULL ,

  `idModalidade` INT(11) NOT NULL ,

  `descricao` VARCHAR(100) NOT NULL ,

  PRIMARY KEY (`idGraduacao`) ,

  INDEX `fk_Graduacoes_Modalidades1` (`idModalidade` ASC) ,

  CONSTRAINT `fk_Graduacoes_Modalidades1`

    FOREIGN KEY (`idModalidade` )

    REFERENCES `mydb`.`Modalidades` (`idModalidade` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Alunos_graduacoes`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Alunos_graduacoes` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Alunos_graduacoes` (

  `idAluno` INT(11) NOT NULL ,

  `idGraducao` INT(11) NOT NULL ,

  `idModalidade` INT(11) NOT NULL ,

  PRIMARY KEY (`idAluno`, `idGraducao`, `idModalidade`) ,

  INDEX `fk_Alunos_graduacoes_Alunos1` (`idAluno` ASC) ,

  INDEX `fk_Alunos_graduacoes_Graduacoes1` (`idGraducao` ASC) ,

  CONSTRAINT `fk_Alunos_graduacoes_Alunos1`

    FOREIGN KEY (`idAluno` )

    REFERENCES `mydb`.`Alunos` (`idAluno` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Alunos_graduacoes_Graduacoes1`

    FOREIGN KEY (`idGraducao` )

    REFERENCES `mydb`.`Graduacoes` (`idGraduacao` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Pagamentos`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Pagamentos` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Pagamentos` (

  `idPagamento` INT(11) NOT NULL ,

  `valorPago` DOUBLE NOT NULL ,

  `dataPagamento` DATETIME NOT NULL ,

  PRIMARY KEY (`idPagamento`) )

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Pacotes_modalidades`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Pacotes_modalidades` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Pacotes_modalidades` (

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

    REFERENCES `mydb`.`Pacotes` (`idPacote` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Pacotes_modalidades_Modalidades1`

    FOREIGN KEY (`idModalidade` )

    REFERENCES `mydb`.`Modalidades` (`idModalidade` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Pacotes_modalidades_Alunos1`

    FOREIGN KEY (`idAluno` )

    REFERENCES `mydb`.`Alunos` (`idAluno` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Pacotes_modalidades_Pagamentos1`

    FOREIGN KEY (`idPagamento` )

    REFERENCES `mydb`.`Pagamentos` (`idPagamento` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Envelopes`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Envelopes` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Envelopes` (

  `idEnvelope` INT(11) NOT NULL ,

  `idSecretaria` INT(11) NOT NULL ,

  `idProfessor` INT(11) NOT NULL ,

  PRIMARY KEY (`idEnvelope`) ,

  INDEX `fk_Envelopes_Professores1` (`idProfessor` ASC) ,

  INDEX `fk_Envelopes_Secretarias1` (`idSecretaria` ASC) ,

  CONSTRAINT `fk_Envelopes_Professores1`

    FOREIGN KEY (`idProfessor` )

    REFERENCES `mydb`.`Professores` (`idProfessor` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Envelopes_Secretarias1`

    FOREIGN KEY (`idSecretaria` )

    REFERENCES `mydb`.`Secretarias` (`idSecretaria` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Alunos_envelopes`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Alunos_envelopes` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Alunos_envelopes` (

  `idAluno` INT(11) NOT NULL ,

  `idEnvelope` INT(11) NOT NULL ,

  `dataEnvelope` DATETIME NOT NULL ,

  PRIMARY KEY (`idAluno`, `idEnvelope`) ,

  INDEX `fk_Alunos_envelopes_Envelopes1` (`idEnvelope` ASC) ,

  INDEX `fk_Alunos_envelopes_Alunos1` (`idAluno` ASC) ,

  CONSTRAINT `fk_Alunos_envelopes_Envelopes1`

    FOREIGN KEY (`idEnvelope` )

    REFERENCES `mydb`.`Envelopes` (`idEnvelope` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Alunos_envelopes_Alunos1`

    FOREIGN KEY (`idAluno` )

    REFERENCES `mydb`.`Alunos` (`idAluno` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Acessos`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Acessos` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Acessos` (

  `idAcesso` INT(11) NOT NULL AUTO_INCREMENT ,

  `idPessoa` INT(11) NOT NULL ,

  `senha` TEXT NOT NULL ,

  PRIMARY KEY (`idAcesso`) ,

  INDEX `fk_Acessos_Pessoas1` (`idPessoa` ASC) ,

  CONSTRAINT `fk_Acessos_Pessoas1`

    FOREIGN KEY (`idPessoa` )

    REFERENCES `mydb`.`Pessoas` (`idPessoa` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Despesas`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Despesas` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Despesas` (

  `idDespesa` INT(11) NOT NULL ,

  `descricao` VARCHAR(255) NOT NULL ,

  `quantidade` INT(11) NOT NULL ,

  PRIMARY KEY (`idDespesa`) )

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `mydb`.`Gastos`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `mydb`.`Gastos` ;



CREATE  TABLE IF NOT EXISTS `mydb`.`Gastos` (

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

    REFERENCES `mydb`.`Secretarias` (`idSecretaria` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION,

  CONSTRAINT `fk_Gastos_Despesas1`

    FOREIGN KEY (`idDespesa` )

    REFERENCES `mydb`.`Despesas` (`idDespesa` )

    ON DELETE NO ACTION

    ON UPDATE NO ACTION)

ENGINE = InnoDB;







SET SQL_MODE=@OLD_SQL_MODE;

SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;

SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

