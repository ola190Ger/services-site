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
<h3 style="text-align: center">Image list</h3>
<br>
<div class="container">

    <table class="table">
        <tr>
            <th>Name</th>
            <th>ContractorId</th>
            <th>ImageUrl</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list images as img>
            <tr>
                <td>${img.name}</td>
                <td>${img.contractorId}</td>
                <td style="max-width: 500px; word-wrap: break-word">${img.imageUrl}</td>
                <td>${img.description}</td>
                <td><a class="btn btn-danger" href="/web/images/delete/${img.id}">Delete</a></td>
                <td><a class="btn btn-info" href="/web/images/edit/${img.id}">Edit</a></td>
            </tr>
        </#list>
    </table>
    <a class="btn btn-outline-success" href="/web/images/add">Add new Image</a>
</div>




</body>
</html>