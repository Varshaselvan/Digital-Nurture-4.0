SELECT 
    DATE_FORMAT(registration_date, '%Y-%m') AS month,
    COUNT(user_id) AS registrations
FROM 
    Registrations
WHERE 
    registration_date >= DATE_SUB(CURRENT_DATE(), INTERVAL 12 MONTH)
GROUP BY 
    month
ORDER BY 
    month;
