# Write your MySQL query statement below
Select Product.product_name , Sales.year , Sales.price 
From Sales
Left join Product using(product_id);