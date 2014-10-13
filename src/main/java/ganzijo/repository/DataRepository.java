package ganzijo.repository;

import ganzijo.vo.DataVO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DataRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public DataVO test(String test){
		return getData(test);
//		return jdbcTemplate.queryForList("SELECT deptno, dname, loc FROM DEPT ORDER BY deptno ", DataVO.class);
	}
	
	private DataVO getData(String test){
		DataVO list = new DataVO();
		list.getData().add(new DataVO.Data(test,"test1","test1"));
		list.getData().add(new DataVO.Data(test,"test1","test1"));
		list.getData().add(new DataVO.Data(test,"test1","test1"));
		return list;
	}
}
