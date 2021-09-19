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
            Name:${contractor.name}
            </br>
            <div class="add-component-table">
                TypeContractorId:
                </br>
                <#list contractor.typeContractorId as typeContractorId>
                    ${typeContractorId}</br>
                </#list>
            </div>
        </div>

        <div style="margin-top: 50px">
            <form name="typeContractorsId" action="" method="POST">
                <div class="block-input">
                    TypeContractorId:<@spring.formSingleSelect "typeContractor.id" typeContractorsId ""/>
                </div>
                <input type="submit" class="block-input_btn btn btn-primary" value="Added"/>
            </form>
        </div>
    </fieldset>
</div>

</body>
</html>