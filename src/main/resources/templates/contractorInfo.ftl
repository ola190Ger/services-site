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
<a href="/client">Back</a>

<div class="wrapper">
    <div class="container">
        <h3 style="text-align: center">Contractor</h3>
        <br>
        <div class="block-up">
            <div class="contractor-info_image">
                <img src="${contractorImage.imageUrl}">
            </div>
            <div class="contractor-info_up">
                <div class="contractor-info_name">
                    <span>Name:</span>  <input readonly value="${contractor.name}"/>
                </div>
                <div class="contractor-info_phone">
                    <#list contractor.phone as phone>
                        <div>
                            <span>Phone:</span> <input readonly value="${phone}">
                        </div>
                    </#list>
                </div>
                <div class="contractor-info_location">
                    <#list locations as loc>
                        <div>
                            <span>Location:</span> <input readonly value="${loc.city}">
                        </div>
                    </#list>
                </div>
                <div class="contractor-info_socnetwork">
                    <#list socialNetworks as soc>
                        <div>
                            <span>${soc.name}:</span> <input readonly value="${soc.url}">
                        </div>
                    </#list>
                </div>

            </div>
        </div>
        <div class="block-down">
            <div class="contractor-info_typecont">
                <span>Type Contractor:</span>
                <#list typeContractor as type>
                    <div>
                        <span>${type.name}</span>
                    </div>
                </#list>
            </div>
            <div class="contractor-info_provervice">
                <span>Provided Service:</span>
                <#list providedServices as provServ>
                    <div>
                        <span>${provServ.name}</span>
                    </div>
                </#list>
            </div>
            <div class="contractor-info_reviews">
                <span>Reviews:</span>
                <#list reviews as rev>
                    <div>
                        <span>${rev.text}</span>
                    </div>
                </#list>
            </div>
        </div>

    </div>

</div>

</body>
</html>