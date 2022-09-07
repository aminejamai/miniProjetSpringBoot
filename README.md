Using Postman you can execute the following requests : 

1. Create new Cases : 
URI : http://localhost:8080/cases
Method : POST
Example of body : 
{
    "title": "first case created",
    "description": "This is description of first case created"
}

2. Get the Case :
URI : http://localhost:8080/cases/1
Method : GET

3. Update the Case : 
URI : http://localhost:8080/cases/1
Method : PUT
Example of body : 
{
    "title": "first case Updated",
    "description": "This is description of first case after update"
}

4. Delete the Case :
URI : http://localhost:8080/cases/1