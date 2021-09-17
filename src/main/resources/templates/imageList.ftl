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
<h3>Image list</h3>
<br>
<div >

    <table border="3" bgcolor="#f0f8ff">
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
                <td><a href="/web/images/delete/${img.id}">Delete</a></td>
                <td><a href="/web/images/edit/${img.id}">Edit</a></td>
            </tr>
        </#list>
    </table>

</div>

<a href="/web/images/add">Add new Image</a>


</body>
</html>