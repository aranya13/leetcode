# Write your MySQL query statement below
select s1.id , COALESCE(s2.student , s1.student) as student from Seat s1
LEFT Join Seat s2 on 
(
    (s1.id % 2 = 1 AND s2.id = s1.id + 1) OR
    (s1.id % 2 = 0 AND s2.id = s1.id - 1)
)
Order by s1.id

