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
<a href="/web/socialnetwork/list">Back</a>

<div class="container">
    <fieldset>
        <legend>Edit SocialNetwork</legend>
        <form name="socialnetwork" action="" method="POST">
            <div class="block-input">
                Name:<@spring.formInput "socialnetwork.name" "" "text"/>
            </div>
            <div class="block-input">
                Url:<@spring.formInput "socialnetwork.url" "" "text"/>
            </div>
            <div class="block-input">
                ContractorId:<@spring.formInput "socialnetwork.contractorId" "" "text"/>
            </div>
            <div class="block-input">
                Description:<@spring.formInput "socialnetwork.description" "" "text"/>
            </div>
            <input type="submit" class="block-input_btn btn btn-primary" value="Edit"/>

        </form>
    </fieldset>
</div>

</body>
</html>