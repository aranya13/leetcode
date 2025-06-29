# Write your MySQL query statement below
select Employee.name , Bonus.bonus from Bonus
Right Join Employee using(empId)
where bonus < 1000 or bonus is null;