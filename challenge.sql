DROP DATABASE IF EXISTS Challenge;
CREATE DATABASE Challenge;
USE Challenge;

CREATE TABLE T_Articles (
	IdArticle int(4) PRIMARY KEY AUTO_INCREMENT,
	Description VARCHAR(30) NOT NULL,
	Brand VARCHAR(30) NOT NULL,
	Price float(8) NOT NULL,
	Category VARCHAR(30) NOT NULL ,
	Quantity int(4) NOT NULL
) ENGINE= InnoDB;





INSERT INTO T_Articles (Description, Brand, Price, Category, Quantity) VALUES ('S9', 'Samsung', 250, "SmartPhone", 10 );
INSERT INTO T_Articles (Description, Brand, Price, Category, Quantity) VALUES ('S10', 'Samsung', 350, "SmartPhone", 5 );
INSERT INTO T_Articles (Description, Brand, Price, Category, Quantity) VALUES ('Iphone 10', 'Apple', 500, "SmartPhone", 2 );
INSERT INTO T_Articles (Description, Brand, Price, Category, Quantity) VALUES ('F756U', 'Asus', 600, "Laptop", 15 );
INSERT INTO T_Articles (Description, Brand, Price, Category, Quantity) VALUES ('Galaxy Tab', 'Samsung', 250, "Tablet", 20 );
INSERT INTO T_Articles (Description, Brand, Price, Category, Quantity) VALUES ('Ipad Pro', 'Apple', 750, "Tablet", 3 );
INSERT INTO T_Articles (Description, Brand, Price, Category, Quantity) VALUES ('Canon Pix', 'Canon', 65, "Printer", 50 );
INSERT INTO T_Articles (Description, Brand, Price, Category, Quantity) VALUES ('Iphone 50', 'Apple', 1500, "SmartPhone", 5 );


