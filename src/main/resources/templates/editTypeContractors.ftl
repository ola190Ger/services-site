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
<a href="/web/typecontractors/list">Back</a>
<div class="container">
    <fieldset>
        <legend>Edit TypeContractors</legend>
        <form name="typeContractor" action="" method="POST">
            <div class="block-input">
                Name:<@spring.formInput "typeContractor.name" "" "text"/>
            </div>
            <div class="block-input">
                Description:<@spring.formInput "typeContractor.description" "" "text"/>
            </div>
            <input type="submit" class="block-input_btn btn btn-primary" value="Edit"/>
        </form>
    </fieldset>
</div>

</body>
</html>