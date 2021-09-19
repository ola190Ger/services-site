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
<a href="/web/subscriptions/list">Back</a>

<div class="container">
    <fieldset>
        <legend>Add Subscription</legend>
        <form name="subscriptionForm" action="" method="POST">
            <div class="block-input">
                ContractorId:<@spring.formSingleSelect "subscriptionForm.contractorId", contractorId ,""/>
            </div>
            <div class="block-input">
                Start date:<@spring.formInput "subscriptionForm.startDate" "" "date"/>
            </div>
            <div class="block-input">
                End date:<@spring.formInput "subscriptionForm.endDate" "" "date"/>
            </div>
            <div class="block-input">
                Description:<@spring.formInput "subscriptionForm.description" "" "text"/>
            </div>
            <input type="submit" class="block-input_btn btn btn-primary" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>