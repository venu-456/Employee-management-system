<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addProduct</title>
</head>
<body>
<center>
<h2>please fill the details to add the product to database</h2>
    <form action="addProduct" method="post">
    <label>name :</label>
    <input type="text" name="name"><br>
    <label>quantity :</label>
    <input type="text" name="quantity"><br>
    <label>price :</label>
    <input type="text" name="price"><br>
    <input type="submit"><br>
    </form>
    Enter the ID to delete the record
    <form action="delete" method="post" >
    <label>id :</label>
    <input type="text" name="id"><br>
    <input type="submit"><br>
    </form>
    Enter the ID to fetch a record
    <form action="prodByID" method="get" >
    <label>id :</label>
    <input type="text" name="id"><br>
    <input type="submit"><br>
    </form>
    record id ${prd.id} has a product ${prd.name} and price ${prd.quantity*prd.price} for quntity of ${prd.quantity} 
</center>
</body>
</html>