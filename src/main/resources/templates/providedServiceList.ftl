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
<h3>ProvidedService list</h3>
<br>
<div>

    <table border="3" bgcolor="#f0f8ff">
        <tr>
            <th>Name</th>
<#--            <th>ContractorId</th>-->
<#--            <th>CategoryId</th>-->
            <th>Description</th>
<#--            <th>CreatedAt</th>-->
<#--            <th>UpdateAt</th>-->
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list providedservice as pservice>
            <tr>
                <td>${pservice.name}</td>
<#--                <td>${providedservice.contractorId}</td>-->
<#--                <td>${pservice.categoryId}</td>-->
                <td>${pservice.description}</td>
<#--                <td>${pservice.CreatedAt}</td>-->
<#--                <td>${pservice.UpdatedId}</td>-->
                <td><a href="/web/providedservice/delete/${pservice.id}">Delete</a></td>
                <td><a href="/web/providedservice/edit/${pservice.id}">Edit</a></td>
            </tr>
        </#list>
    </table>

</div>

<a href="/web/providedservice/add">Add ProvidedService</a>


</body>
</html>