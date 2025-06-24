# Write your MySQL query statement below
select author_id as id from Views
Where author_id = viewer_id
group by author_id
order by id;