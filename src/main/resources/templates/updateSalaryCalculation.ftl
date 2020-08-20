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
        <legend>Update workLoad</legend>
        <form name="salaryCalculation" action="" method="POST">
            Teacher:<@spring.formSingleSelect "workLoadForm.teacher", mevs,"" />
            <br>
            Amount of Lectures:<@spring.formInput "workLoadForm.amountOfLectures" "" "text"/>
            <br>
            Price For Lecture Hours:<@spring.formInput "workLoadForm.priceForLectureHours" "" "text"/>
            <br>
            Amount Of Practice:<@spring.formInput "workLoadForm.amountOfPractice" "" "text"/>
            <br>
            Price For Practice Hours:<@spring.formInput "workLoadForm.priceForPracticeHours" "" "text"/>
            <br>
            Total Salary:<@spring.formInput "workLoadForm.totalSalary" "" "text"/>
            <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>
</body>
</html>