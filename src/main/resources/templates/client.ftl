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
<body>
<a href="/">Home</a>
<h1 class="welcome">Welcome</h1>

<div class="wrapper">
    <div class="container contractor-list">
        <#list contractorList as contractor >
                <div class="contractor-info">
                    <a href="/client/contractor/${contractor.id}">
                        <div class="contractor-image">
                            <img src="https://as1.ftcdn.net/v2/jpg/03/46/83/96/1000_F_346839683_6nAPzbhpSkIpb8pmAwufkC7c5eD7wYws.jpg">
                        </div>
                        <div class="contractor-name">
                            ${contractor.name}
                        </div>
                    </a>
                </div>
        </#list>
    </div>
</div>


</body>
</html>