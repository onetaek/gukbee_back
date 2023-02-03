CREATE TABLE order_data 
(
	num INT(11) NOT NULL AUTO_INCREMENT,
	orderNo VARCHAR(50),
	cartId INT(11) NOT NULL,
	bookId VARCHAR(50),
	bookName VARCHAR(50),
	unitPrice INT(11) NOT NULL DEFAULT 0,
	cnt TINYINT(4) NOT NULL DEFAULT 0,
	sumPrice INT(11) NOT NULL DEFAULT 0,
	PRIMARY KEY(num),
	index orderNo (orderNo)
)