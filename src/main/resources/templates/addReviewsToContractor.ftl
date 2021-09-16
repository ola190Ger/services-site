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
        <legend>Add TypeContractor to Contractor</legend>

        <div>
            Contractor:
            </br>
            Name:${contractor.name}
            </br>
            Reviews:
            </br>

            <table border="3" bgcolor="#f0f8ff">
                <tr>
                    <th>Text</th>
                    <th>Description</th>
                </tr>
                <#list reviewsList as review>
                    <tr>
                        <td>${review.text}</td>
                        <td>${review.description}</td>
                    </tr>
                </#list>
            </table>
        </div>

        <div style="margin-top: 50px">
            <form name="reviews" action="" method="POST">
                Name:<@spring.formInput "reviews.text" "" "text"/>
                <br>
                Description:<@spring.formInput "reviews.description" "" "text"/>
                <br>
                <input type="submit" value="Added"/>
            </form>
        </div>
    </fieldset>
</div>

</body>
</html>