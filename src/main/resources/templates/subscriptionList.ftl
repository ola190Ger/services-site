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
<h3>Subscription list</h3>
<br>
<div>

    <table border="3" bgcolor="#f0f8ff">
        <tr>
            <th>ContractorId</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list subscriptions as subscription>
            <tr>
                <td>${subscription.contractorId}</td>
                <td>${subscription.startDate}</td>
                <td>${subscription.endDate}</td>
                <td>${subscription.description}</td>
                <td><a href="/web/subscriptions/delete/${subscription.id}">Delete</a></td>
                <td><a href="/web/subscriptions/edit/${subscription.id}">Edit</a></td>
            </tr>
        </#list>
    </table>

</div>

<a href="/web/subscriptions/add">Add new Subscription</a>


</body>
</html>