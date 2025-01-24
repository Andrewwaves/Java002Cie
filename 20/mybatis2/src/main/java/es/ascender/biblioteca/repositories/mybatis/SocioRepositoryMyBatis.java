package es.ascender.biblioteca.repositories.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import es.ascender.biblioteca.negocio.Socio;
import es.ascender.biblioteca.repositories.SocioRepository;

public class SocioRepositoryMyBatis implements SocioRepository{

	SqlSession sqlSession;
	public SocioRepositoryMyBatis(SqlSession sqlSession) {
		
		this.sqlSession=sqlSession;
	}
	
	@Override
	public List<Socio> buscarTodos() {
		
		return sqlSession.selectList("selectSocios");
	}

	@Override
	public void insertar(Socio socio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Socio socio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Socio> buscarTodosOrdenados(String orden) {
		// TODO Auto-generated method stub
		return null;
	}

}
