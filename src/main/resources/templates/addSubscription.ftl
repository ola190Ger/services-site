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
    <a href="/web/subscriptions/list">Back</a>
    <fieldset>
        <legend>Add Subscription</legend>
        <form name="subscription" action="" method="POST">
            ContractorId:<@spring.formSingleSelect "subscription.contractorId", contractorId ,""/>
            <br>
            Start date:<@spring.formInput "subscription.startDate" "" "date"/>
            <br>
            End date:<@spring.formInput "subscription.endDate" "" "date"/>
            <br>
            Description:<@spring.formInput "subscription.description" "" "text"/>
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>