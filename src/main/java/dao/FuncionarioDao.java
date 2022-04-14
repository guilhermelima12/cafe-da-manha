package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import db.MySqlConnection;
import model.Funcionario;

public class FuncionarioDao implements CRUD {
	
	private static Connection con = MySqlConnection.createConnection();
	private static String sql;
	
	public static void create(Funcionario funcionario) {
		sql = "INSERT INTO funcionarios VALUES (?, ?, ?)";
		
		try {
			
			PreparedStatement pr = con.prepareStatement(sql);

			pr.setString(1, funcionario.getNome());
			pr.setString(2, funcionario.getCpf());
			pr.setString(3, funcionario.getItem());
			
			pr.executeUpdate();
			
			System.out.println("--correct insert");
			pr.close();
			
		} catch(SQLException e) {
			System.out.println("--incorrect insert " + e);
		}

	}
	public static List<Funcionario> find(String pesquisa) {
		return null;
	}
	
}
