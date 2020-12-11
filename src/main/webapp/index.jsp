<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>

<html lang="nl">
<head>
    <title>Menu</title>
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
        <tr>
            <td>Sandwich kip</td>
            <td>3.50€</td>
            <td>No</td>
            <td>/</td>
        </tr>
        <tr>
            <td>Sandwich tonijn</td>
            <td>4.00€</td>
            <td>No</td>
            <td>/</td>
        </tr>
        <tr id="veggiesandwich">
            <td>Sandwich Veggielicious</td>
            <td>3.00€</td>
            <td>Yes</td>
            <td>/</td>
        </tr>
        <tr id="martino">
            <td>Sandwich martino</td>
            <td>3.50€</td>
            <td>No</td>
            <td>/</td>
        </tr>
        <tr id="sandwichbrie">
            <td>Sandwich brie</td>
            <td>4.00€</td>
            <td>Yes</td>
            <td>Contains nuts</td>
        </tr>
        <tr id="lasagna">
            <td>Lasagna </td>
            <td>5.00€</td>
            <td>No</td>
            <td>/</td>
        </tr>
        <tr>
            <td>Lasagna spinage</td>
            <td>4.50€</td>
            <td>Yes</td>
            <td>/</td>
        </tr>
        </tbody>
    </table>
</div>


</body>
</html>