CREATE OR REPLACE PROCEDURE TransferFunds (
    from_account_id IN NUMBER,
    to_account_id IN NUMBER,
    transfer_amount IN NUMBER
) IS
    source_balance NUMBER;
BEGIN
    -- Get source account balance
    SELECT Balance INTO source_balance
    FROM Accounts
    WHERE AccountID = from_account_id
    FOR UPDATE;

    -- Check if sufficient funds are available
    IF source_balance >= transfer_amount THEN
        -- Debit from source
        UPDATE Accounts
        SET Balance = Balance - transfer_amount
        WHERE AccountID = from_account_id;

        -- Credit to destination
        UPDATE Accounts
        SET Balance = Balance + transfer_amount
        WHERE AccountID = to_account_id;

        COMMIT;
    ELSE
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;
END;
/
