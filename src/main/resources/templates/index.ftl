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

<h1>Welcome</h1>




<a href="<@spring.url '/web/typecontractors/list'/>">TypeContractor List</a>
</br>
</br>
<a href="<@spring.url '/web/categories/list'/>">Category List</a>
</br>
</br>
<a href="<@spring.url '/web/subscriptions/list'/>">Subscription List</a>


</body>
</html>