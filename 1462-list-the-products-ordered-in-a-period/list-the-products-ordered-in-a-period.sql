# Write your MySQL query statement below
SELECT
    p.product_name,
    SUM(o.unit) AS unit
FROM
    Orders o
JOIN
    Products p ON o.product_id = p.product_id
WHERE
    -- Filter orders placed specifically in February 2020
    o.order_date BETWEEN '2020-02-01' AND '2020-02-29'
    -- Alternatively, for more general date filtering:
    -- YEAR(o.order_date) = 2020 AND MONTH(o.order_date) = 2
GROUP BY
    p.product_id, p.product_name -- Group by both ID and Name to calculate total units per product
HAVING
    -- Filter the groups (products) where the total units sold in Feb 2020 is at least 100
    SUM(o.unit) >= 100;