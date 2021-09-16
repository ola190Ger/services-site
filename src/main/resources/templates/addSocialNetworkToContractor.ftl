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
            Social Network:
            </br>

            <table border="3" bgcolor="#f0f8ff">
                <tr>
                    <th>Name</th>
                    <th>URL</th>
                    <th>Description</th>
                </tr>
                <#list socNet as socN>
                    <tr>
                        <td>${socN.name}</td>
                        <td>${socN.url}</td>
                        <td>${socN.description}</td>
                    </tr>
                </#list>
            </table>
        </div>

        <div style="margin-top: 50px">
            <form name="socialNetwork" action="" method="POST">
                Name:<@spring.formInput "socialNetwork.name" "" "text"/>
                <br>
                Url:<@spring.formInput "socialNetwork.url" "" "text"/>
                <br>
                Description:<@spring.formInput "socialNetwork.description" "" "text"/>
                <br>
                <input type="submit" value="Added"/>
            </form>
        </div>
    </fieldset>
</div>

</body>
</html>