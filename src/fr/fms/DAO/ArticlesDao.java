package fr.fms.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import fr.fms.DAO.DAO.Dao;
import modeles.ArticlesModele;

public class ArticlesDao<T> implements Dao<ArticlesModele> {

	@Override
	public void create(ArticlesModele obj) {

		
	}

	@Override
	public ArticlesModele selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(ArticlesModele obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ArticlesModele obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<ArticlesModele> readAll() {
		ArrayList<ArticlesModele> list = new ArrayList<>();
		 String querySql = "SELECT IdArticle, Description, Brand, Price, CatName, Quantity   FROM T_Articles INNER JOIN T_Category on 		T_Articles.IdCategory = T_Category.IdCategory";
			try(Statement statement = connection.createStatement()){
				PreparedStatement myQuery = connection.prepareStatement(querySql);
				try(ResultSet resultSet = myQuery.executeQuery()){
				while(resultSet.next()) {
							int resultId = resultSet.getInt(1);
							String resultDescription = resultSet.getString(2);
							String resultBrand = resultSet.getString(3);
							double resultPrice = resultSet.getDouble(4);
							String resultCatName = resultSet.getString(5);
							int resultQuantity = resultSet.getInt(6);
							list.add(new ArticlesModele(resultId, resultDescription, resultBrand, resultPrice, resultCatName, resultQuantity));
					}
					//list.stream()
					//.forEach(System.out::println);
					
				}
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			return list;
	}
 
}
