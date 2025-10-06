# Write your MySQL query statement below
select user_id , CONCAT(Upper(left(name , 1)) , Lower(substring(name , 2))) as name
from Users
order by user_id