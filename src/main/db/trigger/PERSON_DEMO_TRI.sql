CREATE OR REPLACE TRIGGER PERSON_DEMO_TRI
BEFORE INSERT OR UPDATE ON PERSON_DEMO -- Fires before an INSERT or UPDATE operation
FOR EACH ROW
BEGIN
  :NEW.update_time := SYSTIMESTAMP; -- Sets the 'last_modified' column to the current system timestamp
END;

