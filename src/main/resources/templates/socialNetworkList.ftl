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
<h3 style="text-align: center">SocialNetwork list</h3>
<br>
<div class="container">

    <table class="table">
        <tr>
            <th>Name</th>
            <th>Url</th>
            <th>ContractorId</th>
            <th>Description</th>
            <th>CreatedAt</th>
            <th>UpdateAt</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list socialNetworks as snetwork>
            <tr>
                <td>${snetwork.name}</td>
                <td>${snetwork.url}</td>
                <td>${snetwork.contractorId}</td>
                <td>${snetwork.description}</td>
                <td>${snetwork.createdAt}</td>
                <td>${snetwork.updatedAt}</td>
                <td><a class="btn btn-danger" href="/web/socialnetwork/delete/${snetwork.id}">Delete</a></td>
                <td><a class="btn btn-info" href="/web/socialnetwork/edit/${snetwork.id}">Edit</a></td>
            </tr>
        </#list>
    </table>
    <a class="btn btn-outline-success" href="/web/socialnetwork/add">Add SocialNetwork</a>
</div>




</body>
</html>