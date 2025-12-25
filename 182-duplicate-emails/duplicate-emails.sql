# Write your MySQL query statement below
select distinct e1.email as Email from Person e1 join Person e2 
where e1.id != e2.id and e1.email = e2.email