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
    <a href="/web/users/list">Back</a>
    <fieldset>
        <legend>Edit User</legend>
        <form name="user" action="" method="POST">
            Name:<@spring.formInput "user.name" "" "text"/>
            <br>
            Surname:<@spring.formInput "user.surname" "" "text"/>
            <br>
            Email:<@spring.formInput "user.email" "" "text"/>
            <br>
            Description:<@spring.formInput "user.description" "" "text"/>
            <br>
            <input type="submit" value="Edit"/>
        </form>
    </fieldset>
</div>

</body>
</html>