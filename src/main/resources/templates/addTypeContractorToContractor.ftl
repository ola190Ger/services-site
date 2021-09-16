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
            TypeContractorId:
            </br>
            <#list contractor.typeContractorId as typeContractorId>
                ${typeContractorId}</br>
            </#list>
        </div>

        <div style="margin-top: 100px">
            <form name="typeContractorsId" action="" method="POST">
                TypeContractorId:<@spring.formSingleSelect "typeContractorsId", typeContractorsId , ""/>
                <br>
                Description:<@spring.formInput "contractor.description" "" "text"/>
                <br>
                <input type="submit" value="Create"/>
            </form>
        </div>
    </fieldset>
</div>

</body>
</html>