<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
<a href="/admin">Home</a>
<h3 style="text-align: center">Category list</h3>
<br>
<div class="container">

    <table class="table">
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list categories as category>
            <tr>
                <td>${category.name}</td>
                <td>${category.description}</td>
                <td><a class="btn btn-danger" href="/web/categories/delete/${category.id}">Delete</a></td>
                <td><a class="btn btn-info" href="/web/categories/edit/${category.id}">Edit</a></td>
            </tr>
        </#list>
    </table>
    <a class="btn btn-outline-success" href="/web/categories/add">Add new Category</a>
</div>




</body>
</html>