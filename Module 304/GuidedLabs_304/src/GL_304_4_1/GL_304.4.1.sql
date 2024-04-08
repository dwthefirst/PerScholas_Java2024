SELECT * FROM orderdetails;

SELECT 
	orderNumber, 
    orderLineNumber, 
    quantityOrdered * priceEach AS subtotal
FROM orderdetails
ORDER BY subtotal DESC;

SELECT firstName, lastName, reportsTo
FROM employees
ORDER BY reportsTo DESC;

