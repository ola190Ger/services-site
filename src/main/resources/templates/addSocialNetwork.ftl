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

<div>
    <a href="/web/socialnetwork/list">Back</a>
    <fieldset>
        <legend>Add SocialNetwork</legend>
        <form name="socialnetwork" action="" method="POST">
<#--            ContractorId:<@spring.formSingleSelect "socialnetwork.contractorId", contractorId ,""/>-->
            Name:<@spring.formInput "socialNetwork.name" "" "text"/>
            <br>
            Url:<@spring.formInput "socialNetwork.url" "" "text"/>
            <br>
            ContractorId:<@spring.formInput "socialNetwork.contractorId" "" "text"/>
            <br>
            Description:<@spring.formInput "socialNetwork.description" "" "text"/>
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>