package br.ucb.fct.pacote;

import java.util.List;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.modalidade.Modalidade;

public interface PacoteDAO{
	
	public boolean insert(Pacote pacote)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Pacote pacote, int id) throws DAOException;
	public List<Pacote> selectAll() throws DAOException;
	public Pacote selectById(int id) throws DAOException;
	public List<Modalidade> selectModalidadeById(int id) throws DAOException;
	public boolean hasModalidadeInPacote(int idModalidade, int idPacote) throws DAOException; 
	public boolean insertModalidadeNoPacote(int idPacote, int idModalidade,int idPagamento) throws DAOException;
	public List<Aluno> selectAlunosById(int id) throws DAOException;
	public boolean hasAlunoInPacote(int idPacote, int idAluno) throws DAOException;
	public boolean insertAlunoNoPacote(int idPacote, int idAluno);
	
	
}
