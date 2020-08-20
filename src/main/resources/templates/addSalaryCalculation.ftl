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
        <legend>Create </legend>
        <form name="salaryCalculation" action="" method="POST">
            Teacher:<@spring.formSingleSelect "salaryCalculationForm.teacher", mevs,"" />
            <br>
            Amount of Lectures:<@spring.formSingleSelect "salaryCalculationForm.amountOfLectures", mevs,"" />
            <br>
            Price For Lecture Hours:<@spring.formInput "salaryCalculationForm.priceForLectureHours" "" "text"/>
            <br>
            Amount Of Practice:<@spring.formInput "salaryCalculationForm.amountOfPractice" "" "text"/>
            <br>
            Price For Practice Hours:<@spring.formInput "salaryCalculationForm.priceForPracticeHours" "" "text"/>
            <br>
            Total Salary:<@spring.formInput "salaryCalculationForm.totalSalary" "" "text"/>
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>
</body>
</html>