# Write your MySQL query statement below
(select name as results
from Users as u join MovieRating m on 
u.user_id = m.user_id
group by u.user_id , u.name
order by count(*) desc , u.name asc
limit 1
)

union all 

(select title as results
from Movies as a join MovieRating m on 
a.movie_id = m.movie_id 
where m.created_at between "2020-02-01" AND "2020-02-29"
group by a.movie_id , a.title
order by avg(rating) desc , a.title asc
limit 1
)