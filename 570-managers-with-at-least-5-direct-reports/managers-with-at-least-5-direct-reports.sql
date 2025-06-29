# Write your MySQL query statement below
select e.name from Employee e left Join Employee e1 
on e.id = e1.managerId
group by e.id
having count(e1.managerId) >= 5;