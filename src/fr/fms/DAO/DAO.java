package fr.fms.DAO;

import java.sql.Connection;
import java.util.ArrayList;

import BddConnection.BddConnection;

//import exBDD.BddConnection;

public class DAO {
	public abstract interface Dao<T> {
		public  Connection connection = BddConnection.getConnection();
		public void create (T obj);
		public T selectById(int id);
		public boolean update (T obj);
		public boolean delete (T obj);
		public ArrayList<T> readAll();
		}
}
