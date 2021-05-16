package com.mindtree.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mindtree.dao.Dao;
import com.mindtree.entity.Product;
import com.mindtree.exception.ConnectionFaildException;
import com.mindtree.exception.DaoException;
import com.mindtree.utility.JdbcConnection;

public class UserDao implements Dao {

	public boolean create(Product product) throws DaoException {
		boolean isproductcreate = false;
		JdbcConnection jdbc = new JdbcConnection();
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = jdbc.getConnection();
			String SQL = "insert into inventory(id,name,quantity,price)values(?,?,?,?)";
			ps = con.prepareStatement(SQL);
			ps.setInt(1, product.getId());
			ps.setString(2, product.getName());
			ps.setInt(3, product.getQuantity());
			ps.setDouble(4, product.getPrice_per_unit());
			if (ps.executeUpdate() > 0) {
				isproductcreate = true;

			}

		} catch ( SQLException e) {
			throw new DaoException(e.getMessage(),e.getCause());
		}
		
		return isproductcreate;
	}

}
