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
    <a href="/web/categories/list">Back</a>
    <fieldset>
        <legend>Edit Category</legend>
        <form name="category" action="" method="POST">
            Name:<@spring.formInput "category.name" "" "text"/>
            <br>
            Description:<@spring.formInput "category.description" "" "text"/>
            <br>
            <input type="submit" value="Edit"/>
        </form>
    </fieldset>
</div>

</body>
</html>