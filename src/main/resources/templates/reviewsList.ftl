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
<h3>Reviews list</h3>
<br>
<div>

    <table border="3" bgcolor="#f0f8ff">
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
                <td><a href="/web/reviews/delete/${review.id}">Delete</a></td>
                <td><a href="/web/reviews/edit/${review.id}">Edit</a></td>
            </tr>
        </#list>
    </table>

</div>

<a href="/web/reviews/add">Add new Review</a>


</body>
</html>