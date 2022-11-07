-- TABLE
CREATE TABLE `contacts` (
  `id` int(11) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `lastName` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(16) DEFAULT NULL
);
CREATE TABLE `customers` (
  `id` int(11) NOT NULL,
  `customerName` varchar(100) DEFAULT NULL,
  `phone` varchar(16) DEFAULT NULL
);
CREATE TABLE `orders` (
  `orderId` int(11) NOT NULL,
  `customerId` int(11) NOT NULL,
  `orderDate` varchar(20) NOT NULL
);
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `groupId` varchar(20) NOT NULL,
  `firstName` varchar(100) DEFAULT NULL,
  `lastName` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
);
 
-- INDEX
 
-- TRIGGER
 
-- VIEW
 
