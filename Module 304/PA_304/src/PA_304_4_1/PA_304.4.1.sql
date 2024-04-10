SELECT productName AS "Name", 
	productLine AS "Product Line", 
    buyPrice AS "Buy Price"
FROM classicmodels.products
ORDER BY buyPrice DESC;

SELECT 
	contactFirstName AS "First Name",
    contactLastName AS "Last Name",
    city AS "City"
FROM classicmodels.customers
WHERE country = 'Germany'
ORDER BY contactLastName ASC;

-- 3.	Display each of the unique values of the status field in the orders table. The output should be sorted alphabetically, ascending.
	-- a.	Hint: The output should show exactly six rows.
SELECT DISTINCT status
FROM classicmodels.orders
ORDER BY status ASC;

-- 4. Display all fields from the payments table for payments made on or after January 1, 2005. The output should be sorted by the payment date from highest to lowest.
SELECT *
FROM classicmodels.payments
WHERE paymentDate >= '2005-01-01'
ORDER BY paymentDate DESC;

-- 5.	Display the last Name, first Name, email address, and job title of all employees working out of the San Francisco office. The output should be sorted by “Last Name.”
SELECT 
	lastName,
    firstName,
    email,
    jobTitle
FROM classicModels.employees
WHERE officeCode = 1
ORDER BY lastName;

-- 6.	Display the name, product line, scale, and vendor of all of the car products – both classic and vintage. The output should display all vintage cars first (sorted alphabetically by name), and all classic cars last (also sorted alphabetically by name). 
SELECT *
FROM classicmodels.products
WHERE productLine LIKE '%car%'
ORDER BY 
	productLine DESC,
    productName ASC;
