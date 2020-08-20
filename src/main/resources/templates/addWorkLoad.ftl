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
    <fieldset class="thead-dark">
        <legend>Create WorkLoad</legend>
        <form name="workLoad" action="" method="POST">
            Teacher:<@spring.formSingleSelect "workLoadForm.teacher", movs,"" />
            <br>
            Group:<@spring.formSingleSelect "workLoadForm.group", mavs,"" />
            <br>
            Subject:<@spring.formInput "workLoadForm.subject" "" "text"/>
            <br>
            Type of Class:<@spring.formInput "workLoadForm.typeOfClass" "" "text"/>
            <br>
            Amount of hours:<@spring.formInput "workLoadForm.amountOfHours" "" "text"/>
            <br>
            Payment:<@spring.formInput "workLoadForm.payment" "" "text"/>
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>
</body>
</html>