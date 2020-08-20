<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WorkLoad list</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div>
    <form method="post">
        <input type="text" value="" name="search">
        <input type="submit" value="Go" onclick="">
    </form>

    <h1 style="color: crimson">
        WorkLoad List
    </h1>

    <table class="table table-dark">
        <tr>
            <th>Group</th>
            <th>Teacher</th>
            <th>Subject</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.group.getName()}</td>
                <td>${item.teacher.getName()}</td>
                <td>${item.subject}</td>
                <td><a href="http://localhost:8083/web/workLoad/update/${item.id}">
                        <input type="button" value="update" class="btn-primary"></a>
                </td>
                <td><a href="http://localhost:8083/web/workLoad/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger">
                    </a>
            </tr>
        </#list>

    </table>
    <a href="/web/workLoad/reloadDB">
        <input type="button", value="Reload Database" class="btn-danger"></a>
    </a>
</div> <div>
    <a href="/web/workLoad/create">
        <input type="button" value="New WorkLoad From" class="btn-danger">
    </a>

    <b1>

        <p>
        <p>
        Work Load Progress
        </p>
        </p>
    </b1>

    <div class="progress">
        <div class="progress-bar bg-success" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
    </div>
    <div class="progress">
        <div class="progress-bar bg-info" role="progressbar" style="width: 50%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
    </div>
    <div class="progress">
        <div class="progress-bar bg-warning" role="progressbar" style="width: 75%" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
    </div>
    <div class="progress">
        <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
    </div>
</div>
</body>
</html>