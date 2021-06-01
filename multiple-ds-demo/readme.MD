### Sample code which Connects to two different Datasources

1. Bring up the application by running MultipleDsDemoApplication class
2. Connect to h2 Database console using two Browser windows http://localhost:8080/h2-console 
3. Create the necessary Tables and Sequences


<br>

##### Customer Database:
Use JDBC URL: jdbc:h2:mem:customers  
Execute the following SQL:  
`CREATE TABLE CUSTOMER(ID NUMERIC, FIRSTNAME VARCHAR, LASTNAME VARCHAR);
CREATE SEQUENCE CUSTOMER_SEQ;
INSERT INTO CUSTOMER VALUES (CUSTOMER_SEQ.NEXTVAL, 'Campbell','Smith');`

<br>

#### Order Database:
Use JDBC URL: jdbc:h2:mem:customers  
Execute the following SQL:  
`CREATE TABLE ORDERS(ID NUMERIC, PRODUCT VARCHAR, ORDEREDBY VARCHAR);
CREATE SEQUENCE ORDER_SEQ;
INSERT INTO ORDERS VALUES (ORDER_SEQ.nextval, 'Pen', 'Campbell');`

<br>

##### Invoke the APIs using Curl:
Get Customer:  
`curl http://localhost:8080/customer/1`  
Create new Customer:  
`curl -X POST -H "Content-Type: application/json" -d '{"firstName":"Bryson","lastName":"Hayden"}' http://localhost:8080/customer`

Get Order:  
`curl http://localhost:8080/order/1`  
Create new Order:  
`curl -X POST -H "Content-Type: application/json" -d '{"product":"Pencil","orderedBy":"Bryson"}' http://localhost:8080/order`
