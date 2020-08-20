<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Teacher list</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div>
    <form method="post">
        <input type="text" value="" name="search">
        <input type="submit" value="Go" onclick="">
    </form>
    <h1 style="color: crimson">
        Teacher List
    </h1>
    <table class="table table-dark">
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Description </th>
            <th>Mobile</th>
            <th>Experience</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.name}</td>
                <td>${item.surname}</td>
                <td>${item.description}</td>
                <td>${item.mobile}</td>
                <td>${item.experience}</td>
                <td><a href="http://localhost:8083/web/teacher/update/${item.id}">
                        <input type="button" value="update" class="btn-primary"></a>
                </td>
                <td><a href="http://localhost:8083/web/teacher/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger">
                </a>
            </tr>
        </#list>

    </table>
    <a href="/web/teacher/reloadDB">
        <input type="button", value="Reload Database" class="btn-danger"></a>
    </a>
</div> <div>
    <a href="/web/teacher/create">
        <input type="button" value="New Teacher From" class="btn-danger">
    </a>
</div>
</body>
</html>