# Write your MySQL query statement below
Delete p1 from Person p1 left join Person p2 on p1.email = p2.email
where p1.id > p2.id