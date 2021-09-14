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
    <a href="/web/reviews/list">Back</a>
    <fieldset>
        <legend>Edit Review</legend>
        <form name="review" action="" method="POST">
            Text:<@spring.formInput "review.text" "" "text"/>
            <br>
            Description:<@spring.formInput "review.description" "" "text"/>
            <br>
            <input type="submit" value="Edit"/>
        </form>
    </fieldset>
</div>

</body>
</html>