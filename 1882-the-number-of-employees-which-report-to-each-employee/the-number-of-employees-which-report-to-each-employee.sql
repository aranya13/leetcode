select b.employee_id , b.name , count(a.reports_to) as reports_count , round(avg(a.age)) as 
average_age 
from Employees a Join Employees b on
a.reports_to = b.employee_id
group by employee_id
order by employee_id