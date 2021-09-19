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
<a href="/web/providedservice/list">Back</a>

<div class="container">
    <fieldset>
        <legend>Add ProvidedService</legend>
        <form name="providedservice" action="" method="POST">
            <div class="block-input">
                Name:<@spring.formInput "providedservice.name" "" "text"/>
            </div>
            <div class="block-input">
                ContractorId:<@spring.formInput "providedservice.contractorId" "" "text"/>
            </div>
            <div class="block-input">
                CategoryId:<@spring.formInput "providedservice.categoryId" "" "text"/>
            </div>
            <div class="block-input">
                Description:<@spring.formInput "providedservice.description" "" "text"/>
            </div>
<#--            CreatedAt:<@spring.formInput "providedservice.createdAt" "" "text"/>-->
<#--            <br>-->
<#--            UpdatedAt:<@spring.formInput "providedservice.updatedAt" "" "text"/>-->
<#--            <br>-->
            <input type="submit" class="block-input_btn btn btn-primary" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>