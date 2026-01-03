# Write your MySQL query statement below
select a.product_id , a.product_name from Product a Join Sales b on
a.product_id = b.product_id 
group by a.product_id , a.product_name
having min(sale_date) >= "2019-01-01" and max(sale_date) <= "2019-03-31";