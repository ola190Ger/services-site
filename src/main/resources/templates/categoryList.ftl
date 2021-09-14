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
<h3>TypeContractor list</h3>
<br>
<div>

    <table border="3" bgcolor="#f0f8ff">
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
                <td><a href="/web/categories/delete/${category.id}">Delete</a></td>
                <td><a href="/web/categories/edit/${category.id}">Edit</a></td>
            </tr>
        </#list>
    </table>

</div>

<a href="/web/categories/add">Add new Category</a>


</body>
</html>