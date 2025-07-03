# Write your MySQL query statement below
select * , case when (x + y + z) - greatest(x , y , z) > greatest(x , y , z) then 'Yes' else 'No'  end as triangle
from Triangle