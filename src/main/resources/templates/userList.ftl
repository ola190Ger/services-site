<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<a href="/"><h2>Home</h2></a>
<h3>User list</h3>
<br>
<div>

    <table border="3" bgcolor="#f0f8ff">
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Email</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list users as user>
            <tr>
                <td>${user.name}</td>
                <td>${user.surname}</td>
                <td>${user.email}</td>
                <td>${user.description}</td>
                <td><a href="/web/users/delete/${user.id}">Delete</a></td>
                <td><a href="/web/users/edit/${user.id}">Edit</a></td>
            </tr>
        </#list>
    </table>

</div>

<a href="/web/users/add">Add new Location</a>


</body>
</html>