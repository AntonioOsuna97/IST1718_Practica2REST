package org.ingservicios.practicaREST;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DAOVehiculos {
	//A�adir libreria spring-jdbc y dependencia junto a la versi�n
	public JdbcTemplate jdbcTemplate;
	//private DataSource dataSource;
	@Autowired
	public void setDataSource(DataSource dataSource) {
	this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
}
