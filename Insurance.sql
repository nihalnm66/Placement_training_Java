CREATE DATABASE insurance_db;
USE insurance_db;

CREATE TABLE Customer (
    CustomerID VARCHAR(10) PRIMARY KEY,
    CustomerName VARCHAR(50) NOT NULL,
    DOB DATE,
    ContactNo BIGINT
);

CREATE TABLE PolicyType (
    PolicyType VARCHAR(50) PRIMARY KEY,
    PremiumRate INT,
    CoverageYears INT
);

CREATE TABLE Branch (
    BranchID VARCHAR(10) PRIMARY KEY,
    BranchName VARCHAR(50) NOT NULL,
    Manager VARCHAR(50) NOT NULL
);

CREATE TABLE Policy (
    PolicyID VARCHAR(10) PRIMARY KEY,
    CustomerID VARCHAR(10),
    PolicyType VARCHAR(50),
    PremiumAmount INT,
    BranchID VARCHAR(10),
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID),
    FOREIGN KEY (PolicyType) REFERENCES PolicyType(PolicyType),
    FOREIGN KEY (BranchID) REFERENCES Branch(BranchID)
);

INSERT INTO Customer (CustomerID, CustomerName, DOB, ContactNo) VALUES 
('C1', 'Ramesh', '1985-05-10', 9876543210),
('C2', 'Kavya', '1990-09-15', 9123456789);

INSERT INTO PolicyType (PolicyType, PremiumRate, CoverageYears) VALUES 
('Health', 5, 10),
('Life', 8, 20),
('Vehicle', 6, 5);

INSERT INTO Branch (BranchID, BranchName, Manager) VALUES 
('B1', 'Bangalore', 'Anil'),
('B2', 'Mysore', 'Sneha');

INSERT INTO Policy (PolicyID, CustomerID, PolicyType, PremiumAmount, BranchID) VALUES 
('P1', 'C1', 'Health', 20000, 'B1'),
('P2', 'C1', 'Vehicle', 15000, 'B1'),
('P3', 'C2', 'Life', 50000, 'B2');