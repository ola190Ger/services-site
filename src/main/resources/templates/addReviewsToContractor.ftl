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
<a href="/web/contractors/list">Back</a>

<div class="container">
    <fieldset>
        <legend>Add TypeContractor to Contractor</legend>

        <div>
            Contractor:
            </br>
            Name: ${contractor.name}
            </br>
            <div class="add-component-table">
                Reviews:
                </br>

                <table class="table table-striped">
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
        </div>

        <div style="margin-top: 50px">
            <form name="reviews" action="" method="POST">
                <div class="block-input">
                    Text:<@spring.formInput "reviews.text" "" "text"/>
                </div>
                <div class="block-input">
                    Description:<@spring.formInput "reviews.description" "" "text"/>
                </div>
                <input type="submit" class="block-input_btn btn btn-primary" value="Added"/>
            </form>
        </div>
    </fieldset>
</div>

</body>
</html>