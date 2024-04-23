USE classicModels;

-- 1. MOD() Function (Modulo %)
SELECT orderNumber, SUM(quantityOrdered) as Qty, 
	IF(MOD(SUM(quantityOrdered), 2), 'Odd', 'Even') as oddOrEven
FROM orderdetails
GROUP BY orderNumber
ORDER BY orderNumber;

-- 2. Truncate()
SELECT truncate(1.5555, 1);

-- 3. Round()
SELECT productCode, 
	ROUND(AVG(quantityOrdered * priceEach))  as avg_orderValue
FROM orderDetails
GROUP BY productCode
ORDER BY avg_orderValue DESC;

-- 4. REPLACE() Function
UPDATE products
SET productDescription = REPLACE(productDescription, 'abuot', 'about');

-- 5. DATEDIFF()
SELECT * FROM orders;
SELECT orderNumber, DATEDIFF(requiredDate, shippedDate) as daysLeft
FROM orders
ORDER BY daysLeft DESC;

-- 6. 