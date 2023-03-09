package modeles;

public class CategoryModeles {

	private int IdCategory;
	private String CategoryName;
	
	public CategoryModeles(int idCategory, String categoryName) {
		super();
		IdCategory = idCategory;
		CategoryName = categoryName;
	}
	
	public int getIdCategory() {
		return IdCategory;
	}
	public void setIdCategory(int idCategory) {
		IdCategory = idCategory;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	@Override
	public String toString() {
		return "CategoryModeles [IdCategory=" + IdCategory + ", CategoryName=" + CategoryName + "]";
	}
}
