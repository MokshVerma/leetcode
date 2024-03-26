# Write your MySQL query statement below
SELECT e.name as Employee from Employee e where salary > (SELECT salary from Employee f where f.id = e.managerId);