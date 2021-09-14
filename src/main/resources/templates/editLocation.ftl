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
    <a href="/web/locations/list">Back</a>
    <fieldset>
        <legend>Edit Location</legend>
        <form name="location" action="" method="POST">
            Country:<@spring.formInput "location.country" "" "text"/>
            <br>
            Region:<@spring.formInput "location.region" "" "text"/>
            <br>
            City:<@spring.formInput "location.city" "" "text"/>
            <br>
            Description:<@spring.formInput "location.description" "" "text"/>
            <br>
            <input type="submit" value="Edit"/>
        </form>
    </fieldset>
</div>

</body>
</html>