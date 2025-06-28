# Write your MySQL query statement below
select euni.unique_id,e.name
From Employees e
Left join EmployeeUNI euni
on e.id = euni.id;
