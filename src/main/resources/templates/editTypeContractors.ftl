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
    <fieldset>
        <legend>Edit TypeContractors</legend>
        <form name="typeContractor" action="" method="POST">
            Name:<@spring.formInput "typeContractor.name" "" "text"/>
            <br>
            Description:<@spring.formInput "typeContractor.description" "" "text"/>
            <br>
            <input type="submit" value="Edit"/>
        </form>
    </fieldset>
</div>

</body>
</html>