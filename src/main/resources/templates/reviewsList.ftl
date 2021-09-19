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
<h3 style="text-align: center">Reviews list</h3>
<br>
<div class="container">

    <table class="table">
        <tr>
            <th>Text</th>
            <th>Description</th>
            <th>CreatedAt</th>
            <th>UpdateAt</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list reviews as review>
            <tr>
                <td>${review.text}</td>
                <td>${review.description}</td>
                <td>${review.createdAt}</td>
<#--                <td>${review.createdAt}</td>-->
                <td>${review.updatedAt}</td>
                <td><a class="btn btn-danger" href="/web/reviews/delete/${review.id}">Delete</a></td>
                <td><a class="btn btn-info" href="/web/reviews/edit/${review.id}">Edit</a></td>
            </tr>
        </#list>
    </table>
    <a class="btn btn-outline-success" href="/web/reviews/add">Add new Review</a>
</div>




</body>
</html>