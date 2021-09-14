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
<h3>Location list</h3>
<br>
<div>

    <table border="3" bgcolor="#f0f8ff">
        <tr>
            <th>Country</th>
            <th>Region</th>
            <th>City</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list locations as location>
            <tr>
                <td>${location.country}</td>
                <td>${location.region}</td>
                <td>${location.city}</td>
                <td>${location.description}</td>
                <td><a href="/web/locations/delete/${location.id}">Delete</a></td>
                <td><a href="/web/locations/edit/${location.id}">Edit</a></td>
            </tr>
        </#list>
    </table>

</div>

<a href="/web/locations/add">Add new Location</a>


</body>
</html>