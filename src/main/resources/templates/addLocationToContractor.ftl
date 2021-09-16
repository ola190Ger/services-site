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
            Location:
            </br>

            <table border="3" bgcolor="#f0f8ff">
                <tr>
                    <th>Id</th>
                    <th>Country</th>
                    <th>Region</th>
                    <th>City</th>
                </tr>
                <#list locCont as loc>
                    <tr>
                        <td>${loc.id}</td>
                        <td>${loc.country}</td>
                        <td>${loc.region}</td>
                        <td>${loc.city}</td>
                    </tr>
                </#list>
            </table>
        </div>

        <div style="margin-top: 50px">
            <form name="location" action="" method="POST">
                LocationId:<@spring.formSingleSelect "location.id" locationsId ""/>
                <br>
                <input type="submit" value="Added"/>
            </form>
        </div>
    </fieldset>
</div>

</body>
</html>