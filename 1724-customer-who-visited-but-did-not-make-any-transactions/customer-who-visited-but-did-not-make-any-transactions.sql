# Write your MySQL query statement below
select Visits.customer_id , Count(visit_id) as count_no_trans 
from Visits 
left join Transactions using (visit_id) 
where Transactions.transaction_id is null
group by Visits.customer_id;