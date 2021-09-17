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
    <a href="/web/images/list">Back</a>
    <fieldset>
        <legend>Edit Image</legend>
        <form name="image" action="" method="POST">
            Name:<@spring.formInput "image.name" "" "text"/>
            <br>
            URL:<@spring.formInput "image.imageUrl" "" "text"/>
            <br>
            ContractorId:<@spring.formInput "image.contractorId" "" "text"/>
            <br>
            Description:<@spring.formInput "image.description" "" "text"/>
            <br>
            <input type="submit" value="Edit"/>
        </form>
    </fieldset>
</div>

</body>
</html>