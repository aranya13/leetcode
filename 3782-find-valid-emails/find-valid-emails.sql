# Write your MySQL query statement below
select * from Users 
where email REGEXP '^[a-zA-Z0-9_]+@[a-zA-Z]+\\.com$'
order by user_id