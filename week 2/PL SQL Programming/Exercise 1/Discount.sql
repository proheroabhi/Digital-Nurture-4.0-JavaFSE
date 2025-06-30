DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, Age, LoanID, InterestRate
        FROM Customers
        JOIN Loans ON Customers.CustomerID = Loans.CustomerID;

BEGIN
    FOR customer_rec IN customer_cursor LOOP
        IF customer_rec.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = customer_rec.LoanID;
        END IF;
    END LOOP;
    
    COMMIT;
END;
/
