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
        <legend>Add teacher</legend>
        <form name="teacher" action="" method="POST">
            Name:<@spring.formInput "teacherForm.name" "" "text"/>
            <br>
            Surname:<@spring.formInput "teacherForm.surname" "" "text"/>
            <br>
            Description:<@spring.formInput "teacherForm.description" "" "text"/>
            <br>
            Mobile:<@spring.formInput "teacherForm.mobile" "" "text"/>
            <br>
            Experience:<@spring.formInput "teacherForm.experience" "" "text"/>
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>