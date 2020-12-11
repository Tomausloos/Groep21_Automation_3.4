<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>

<html lang="nl">
<head>
    <title>EmptyMenu</title>
</head>
<body>


<div class="container">
    <main>
        <h1>Homepage - Sodexo</h1>
        <h2>This is the overview of meals</h2>

    </main>
    <table id="mealTable">
        <tbody>
        <tr>
            <th>Meal</th>
            <th>Price</th>
            <th>Veggie</th>
            <th>Allergies</th>
        </tr>
        <p id="notification">There are currently no meals on the menu</p>
        </tbody>
    </table>
</div>


</body>
</html>