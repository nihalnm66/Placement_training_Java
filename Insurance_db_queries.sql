use insurance_db


SELECT BranchID, MAX(PremiumAmount) AS MaxPremium
FROM Policy
GROUP BY BranchID;


SELECT C.CustomerID, C.CustomerName, COUNT(P.PolicyID) AS PolicyCount
FROM Customer C
JOIN Policy P ON C.CustomerID = P.CustomerID
GROUP BY C.CustomerID, C.CustomerName
HAVING COUNT(P.PolicyID) > 1;


SELECT P.BranchID, 
SUM(P.PremiumAmount * (PT.PremiumRate / 100.0)) AS TotalAnnualPremium
FROM Policy P
JOIN PolicyType PT ON P.PolicyType = PT.PolicyType
GROUP BY P.BranchID;