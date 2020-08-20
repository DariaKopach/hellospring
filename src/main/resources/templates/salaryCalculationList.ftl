<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Group list</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div>
    <form method="post">
        <input type="text" value="" name="search">
        <input type="submit" value="Go" onclick="">
    </form>

    <h1 style="color: crimson">
        Group List
    </h1>

    <table class="table table-dark">
        <tr>
            <th>Teacher</th>
            <th>AmountOfLectures</th>
            <th>PriceForLectureHours()</th>
            <th>AmountOfPractice</th>
            <th>PriceForPracticeHours</th>
            <th>TotalSalary</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.teacher.getName()}</td>
                <td>${item.amountOfLectures}</td>
                <td>${item.priceForLectureHours}</td>
                <td>${item.amountOfPractice}</td>
                <td>${item.priceForPracticeHours}</td>
                <td>${item.totalSalary}</td>
                <td><a href="http://localhost:8083/web/salaryCalculation/update/${item.id}">
                        <input type="button" value="update" class="btn-primary"></a>
                </td>
                <td><a href="http://localhost:8083/web/salaryCalculation/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger">
                    </a>
            </tr>
        </#list>

    </table>
    <a href="/web/salaryCalculation/reloadDB">
        <input type="button", value="Reload Database" class="btn-danger"></a>
    </a>
</div> <div>
    <a href="/web/salaryCalculation/create">
        <input type="button" value="New Group From" class="btn-danger">
    </a>
</div>
</body>
</html>