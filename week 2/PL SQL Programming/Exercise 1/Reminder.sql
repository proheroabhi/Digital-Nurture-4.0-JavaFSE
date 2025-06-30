DECLARE
    CURSOR loan_due_cursor IS
        SELECT Loans.LoanID, Customers.CustomerName, Loans.DueDate
        FROM Loans
        JOIN Customers ON Loans.CustomerID = Customers.CustomerID
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR loan_rec IN loan_due_cursor LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_rec.LoanID || 
                             ' for customer ' || loan_rec.CustomerName ||
                             ' is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/
