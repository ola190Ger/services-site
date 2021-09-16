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
    <a href="/web/contractors/list">Back</a>
    <fieldset>
        <legend>Add Contractor</legend>
        <form name="contractorForm" action="" method="POST">
            Name:<@spring.formInput "contractorForm.name" "" "text"/>
            <br>
            Phone:<@spring.formInput "contractorForm.phone" "" "text"/>
            <br>
            Birthday:<@spring.formInput "contractorForm.birthday" "" "date"/>
            <br>
            Description:<@spring.formInput "contractorForm.description" "" "text"/>
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>