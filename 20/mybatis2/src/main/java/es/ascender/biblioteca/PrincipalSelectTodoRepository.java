package es.ascender.biblioteca;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import es.ascender.biblioteca.negocio.Socio;
import es.ascender.biblioteca.repositories.SocioRepository;
import es.ascender.biblioteca.repositories.mybatis.SocioRepositoryMyBatis;

public class PrincipalSelectTodoRepository {

	public static void main(String[] args) {
		
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session=sqlSessionFactory.openSession();
			SocioRepository repo=new SocioRepositoryMyBatis(session);
			List<Socio>listaSocios=session.selectList("selectSocios");
			
			for(Socio s:listaSocios) {
				System.out.println(s.getNombre());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
