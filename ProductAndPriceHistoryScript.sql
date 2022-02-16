CREATE TABLE product (
    procuct_Id INT PRIMARY KEY,
    name CHAR(20) NOT NULL,
    category CHAR(20) NOT NULL
);

CREATE TABLE price_history (
    price_history_id INT PRIMARY KEY,
    price FLOAT(2) NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE,
    product_id INT NOT NULL,
    FOREIGN KEY (product_id)
        REFERENCES product (product_id)
);


SELECT 
    product.product_id, product.Name, product.category
FROM
    product FULL
        JOIN
    price_history ON product.product_id = price_history.price_history_id