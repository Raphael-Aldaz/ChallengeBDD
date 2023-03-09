package modeles;

public class ArticlesModele {
	private int articleId;
	private String Description;
	private String Brand;
	private double Price;
	private int category;
	private int quantity;
	
	public ArticlesModele(int articleId, String description, String brand, double price, int category, int quantity) {

		this.articleId = articleId;
		this.Description = description;
		this.Brand = brand;
		this.Price = price;
		this.category = category;
		this.quantity = quantity;
	}
	public ArticlesModele(int articleId, String Description, String Brand, double Price, String CatName, int quantity) {
		this.articleId = articleId;
		this.Description = Description;
		this.Brand = Brand;
		this.Price = Price;
		this.category = category;
		this.quantity = quantity;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		this.Price = price;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Modele [articleId=" + articleId + ", Description=" + Description + ", Brand=" + Brand + ", price="
				+ Price + ", category=" + category + ", quantity=" + quantity + "]";
	}

}
