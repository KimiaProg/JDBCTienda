DROP TABLE IF EXISTS Purchases;
DROP TABLE IF EXISTS Products;
DROP TABLE IF EXISTS Users;
CREATE TABLE Users(
username varchar(20) not null,
password varchar(20) not null,
PRIMARY KEY(username)
);


CREATE TABLE Products(
productname varchar(20) not null,
price decimal(10,2),
PRIMARY KEY(productname)
);


CREATE TABLE Purchases(
username varchar(20) not null,
productname varchar(20) not null,
date datetime not null,
price decimal(10,2) not null,
units integer not null,
primary key(username,productname,date),
foreign key(username) references Users(username),
foreign key(productname) references Products(productname)
);

