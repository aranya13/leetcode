# Write your MySQL query statement below
select c.name as Customers from Customers c left Join Orders o on c.id = o.customerId 
where customerId is Null