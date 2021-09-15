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
        <legend>Edit SocialNetwork</legend>
        <form name="socialnetwork" action="" method="POST">
            Name:<@spring.formInput "socialnetwork.name" "" "text"/>
            <br>
            Url:<@spring.formInput "socialnetwork.url" "" "text"/>
            <br>
            ContractorId:<@spring.formInput "socialnetwork.contractorId" "" "text"/>
            <br>
            Description:<@spring.formInput "socialnetwork.description" "" "text"/>
            <br>
            <input type="submit" value="Edit"/>
        </form>
    </fieldset>
</div>

</body>
</html>