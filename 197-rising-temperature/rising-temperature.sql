# Write your MySQL query statement below
select a.id from weather a join weather b where datediff(a.recordDate , b.recordDate) = 1 and b.temperature < a.temperature