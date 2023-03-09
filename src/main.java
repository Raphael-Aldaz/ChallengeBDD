import fr.fms.DAO.ArticlesDao;
import modeles.ArticlesModele;

public class main {

	public static void main(String[] args) {
		ArticlesDao<ArticlesModele> articleDao = new ArticlesDao<>();
		
		System.out.println(articleDao.readAll());

	}

}
