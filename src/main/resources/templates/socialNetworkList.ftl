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
<h3>SocialNetwork list</h3>
<br>
<div>

    <table border="3" bgcolor="#f0f8ff">
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
                <td><a href="/web/socialnetwork/delete/${snetwork.id}">Delete</a></td>
                <td><a href="/web/socialnetwork/edit/${snetwork.id}">Edit</a></td>
            </tr>
        </#list>
    </table>

</div>

<a href="/web/socialnetwork/add">Add SocialNetwork</a>


</body>
</html>