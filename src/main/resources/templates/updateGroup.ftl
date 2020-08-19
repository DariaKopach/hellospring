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
    <fieldset>
        <legend>Update group</legend>
        <form name="group" action="" method="POST">
            Name:<@spring.formInput "groupForm.name" "" "text"/>
            <br>
            Specialty:<@spring.formInput "groupForm.specialty" "" "text"/>
            <br>
            Description:<@spring.formInput "groupForm.description" "" "text"/>
            <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>
</body>
</html>