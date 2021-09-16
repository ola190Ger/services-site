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
<h3>Contractor list</h3>
<br>
<div>

    <table border="3" bgcolor="#f0f8ff">
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
                <td><a href="/web/contractors/addTypeContractor/${contractor.id}">Add TypeContractor</a></td>
                <td><a href="/web/contractors/addProvideService/${contractor.id}">Add ProvideService</a></td>
                <td><a href="/web/contractors/addLocation/${contractor.id}">Add Location</a></td>
                <td><a href="/web/contractors/addSocialNetwork/${contractor.id}">Add Social Network</a></td>
                <td><a href="/web/contractors/addReviews/${contractor.id}">Add Reviews</a></td>
                <td><a href="/web/contractors/delete/${contractor.id}">Delete</a></td>
                <td><a href="/web/contractors/edit/${contractor.id}">Edit</a></td>
            </tr>
        </#list>
    </table>

</div>

<a href="/web/contractors/add">Add new Contractor</a>


</body>
</html>