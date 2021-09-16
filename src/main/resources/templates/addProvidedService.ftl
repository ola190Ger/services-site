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
    <a href="/web/providedservice/list">Back</a>
    <fieldset>
        <legend>Add ProvidedService</legend>
        <form name="providedservice" action="" method="POST">
            Name:<@spring.formInput "providedservice.name" "" "text"/>
            <br>
            ContractorId:<@spring.formInput "providedservice.contractorId" "" "text"/>
            <br>
            CategoryId:<@spring.formInput "providedservice.categoryId" "" "text"/>
            <br>
            Description:<@spring.formInput "providedservice.description" "" "text"/>
            <br>
<#--            CreatedAt:<@spring.formInput "providedservice.createdAt" "" "text"/>-->
<#--            <br>-->
<#--            UpdatedAt:<@spring.formInput "providedservice.updatedAt" "" "text"/>-->
<#--            <br>-->
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>