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
            ProvideServiceId:
            </br>
            <#list contractor.providedServicesId as provideServiceId>
                ${provideServiceId}</br>
            </#list>
        </div>

        <div style="margin-top: 50px">
            <form name="provideServicesId" action="" method="POST">
                ProvideServicesId:<@spring.formSingleSelect "providedService.id" provideServicesId ""/>
                <br>
                <input type="submit" value="Added"/>
            </form>
        </div>
    </fieldset>
</div>

</body>
</html>