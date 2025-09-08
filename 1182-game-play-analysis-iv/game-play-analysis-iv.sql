# Write your MySQL query statement below
SELECT ROUND(COUNT(distinct player_id) / (select COUNT(DISTINCT player_id) from Activity), 2) as fraction 
FROM Activity
where (player_id , DATE_SUB(event_date , Interval 1 Day))
In (
    Select player_id , Min(event_date) as first_login from Activity group by player_id
)
;