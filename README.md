## Challenge CRUD
[DevSuperior](https://devsuperior.com.br/)\
<br>
You must deliver a Spring Boot project containing a complete CRUD of web services REST to access a client resource, containing the five basic operations learned in the chapter:
- Paginated search for resources
- Search for resource by id
- Insert new resource
- Update resource
- Delete resource

The project must have a test environment configured to access the **H2 database**, must use **Maven** as the dependency manager, and **Java** as the language.
<br>
A client has a name, CPF, income, date of birth, and number of children. The specification of the Client entity is shown below (you must strictly follow the class names and attributes shown in the diagram):
<br>
<br>
![img1](https://github.com/luiz-barros-92/assets/blob/main/challenges/c3/c3-1.jpeg)
<br>
<br>
Your project must seed at least 10 customers with SIGNIFICANT data (you should not use meaningless data such as “Name 1”, “Name 2”, etc.).
<br>
Your project should handle the following exceptions:
- Id not found (for GET by id, PUT and DELETE), returning code 404.
- Validation error, returning code 422 and custom messages for each invalid field. The validation rules are:
  - Name: cannot be empty
  - Date of birth: cannot be a future date (hint: use @PastOrPresent)

### CHECKLIST:
1. Search by id returns existing customer
2. Search by id returns 404 for non-existent customer
3. Paginated search returns correctly paginated listing
4. Customer insertion inserts customer with valid data
5. Customer insertion returns 422 and custom messages with invalid data
6. Customer update updates customer with valid data
7. Customer update returns 404 for non-existent customer
8. Customer update returns 422 and custom messages with invalid data
9. Customer deletion deletes existing customer
10. Customer deletion returns 404 for non-existent customer

