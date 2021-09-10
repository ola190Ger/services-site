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
        <#list typeContractors as typeContractor>
            <tr>
                <td>${typeContractor.name}</td>
                <td>${typeContractor.description}</td>
                <td><a href="/web/typecontractors/delete/${typeContractor.id}">Delete</a></td>
                <td><a href="/web/typecontractors/edit/${typeContractor.id}">Edit</a></td>
            </tr>
        </#list>
    </table>

</div>

<a href="/web/typecontractors/add">Add new TypeContractors</a>


</body>
</html>