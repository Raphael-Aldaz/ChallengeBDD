DROP DATABASE IF EXISTS Challenge;
CREATE DATABASE Challenge;
USE Challenge;

CREATE TABLE T_Articles (
	IdArticle int(4) PRIMARY KEY AUTO_INCREMENT,
	Description VARCHAR(30) NOT NULL,
	Brand VARCHAR(30) NOT NULL,
	Price float(8) NOT NULL,
	idCategory int(4) NOT NULL ,
	Quantity int(4) NOT NULL
) ENGINE= InnoDB;

CREATE TABLE T_Category (
	IdCategory int(4) PRIMARY KEY AUTO_INCREMENT,
	CatName VARCHAR(30) NOT NULL
 
) ENGINE = innoDB;



INSERT INTO T_Articles (Description, Brand, Price, idCategory, Quantity) VALUES ('S9', 'Samsung', 250, 1, 10 );
INSERT INTO T_Articles (Description, Brand, Price, idCategory, Quantity) VALUES ('S10', 'Samsung', 350, 1, 5 );
INSERT INTO T_Articles (Description, Brand, Price, idCategory, Quantity) VALUES ('Iphone 10', 'Apple', 500, 1, 2 );
INSERT INTO T_Articles (Description, Brand, Price, idCategory, Quantity) VALUES ('F756U', 'Asus', 600, 2, 15 );
INSERT INTO T_Articles (Description, Brand, Price, idCategory, Quantity) VALUES ('Galaxy Tab', 'Samsung', 250, 3, 20 );
INSERT INTO T_Articles (Description, Brand, Price, idCategory, Quantity) VALUES ('Ipad Pro', 'Apple', 750, 3, 3 );
INSERT INTO T_Articles (Description, Brand, Price, idCategory, Quantity) VALUES ('Canon Pix', 'Canon', 65, 4, 50 );
INSERT INTO T_Articles (Description, Brand, Price, idCategory, Quantity) VALUES ('Iphone 50', 'Apple', 1500, 1, 5 );


INSERT INTO T_Category (CatName) VALUES ('SmartPhone');
INSERT INTO T_Category (CatName) VALUES ('Laptop');
INSERT INTO T_Category (CatName) VALUES ('Tablet');
INSERT INTO T_Category (CatName) VALUES ('Printer');


ALTER TABLE T_Articles ADD FOREIGN KEY(IdCategory) REFERENCES T_Category(IdCategory);