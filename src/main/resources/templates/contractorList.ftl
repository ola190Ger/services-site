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
<h3 style="text-align: center">Contractor list</h3>
<br>
<div class="container">

    <table class="table">
        <tr>
            <th>Name</th>
            <th>Phone</th>
            <th>Birthday</th>
            <th>Description</th>
            <th>TypeContractor</th>
            <th>ProvideService</th>
            <th>Location</th>
            <th>Social Network</th>
            <th>Reviews</th>
            <th>Image</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list contractors as contractor>
            <tr>
                <td>${contractor.name}</td>
                <td>
                    <#list contractor.phone as phone>
                        ${phone}</br>
                    </#list>
                </td>
                <td>${contractor.birthday}</td>
                <td>${contractor.description}</td>
                <td><a class="btn btn-primary" href="/web/contractors/addTypeContractor/${contractor.id}">Add TypeContractor</a></td>
                <td><a class="btn btn-primary" href="/web/contractors/addProvideService/${contractor.id}">Add ProvideService</a></td>
                <td><a class="btn btn-primary" href="/web/contractors/addLocation/${contractor.id}">Add Location</a></td>
                <td><a class="btn btn-primary" href="/web/contractors/addSocialNetwork/${contractor.id}">Add Social Network</a></td>
                <td><a class="btn btn-primary" href="/web/contractors/addReviews/${contractor.id}">Add Reviews</a></td>
                <td><a class="btn btn-primary" href="/web/contractors/addImage/${contractor.id}">Add Image</a></td>
                <td><a class="btn btn btn-danger" href="/web/contractors/delete/${contractor.id}">Delete</a></td>
                <td><a class="btn btn btn-info" href="/web/contractors/edit/${contractor.id}">Edit</a></td>
            </tr>
        </#list>
    </table>
    <a class="btn btn-outline-success" href="/web/contractors/add">Add new Contractor</a>
</div>




</body>
</html>