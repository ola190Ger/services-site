<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body class="container">
<a href="/">Home</a>
<h1 style="text-align: center">Welcome</h1>



<div class="d-grid gap-2">
    <a  class="btn btn-primary" href="<@spring.url '/web/typecontractors/list'/>">TypeContractor List</a>

    <a class="btn btn-primary" href="<@spring.url '/web/categories/list'/>">Category List</a>

    <a class="btn btn-primary" href="<@spring.url '/web/subscriptions/list'/>">Subscription List</a>

    <a class="btn btn-primary" href="<@spring.url '/web/locations/list'/>">Location List</a>

    <a class="btn btn-primary" href="<@spring.url '/web/users/list'/>">User List</a>

    <a class="btn btn-primary" href="<@spring.url '/web/reviews/list'/>">Reviews List</a>

    <a class="btn btn-primary"  href="<@spring.url '/web/socialnetwork/list'/>">SocialNetworks List</a>

    <a class="btn btn-primary" href="<@spring.url '/web/contractors/list'/>">Contractor List</a>

    <a class="btn btn-primary" href="<@spring.url '/web/providedservice/list'/>">ProvidedService List</a>

    <a class="btn btn-primary" href="<@spring.url '/web/images/list'/>">Image List</a>
</div>


</body>
</html>