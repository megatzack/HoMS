<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div class="container">
        <h5 style="padding-top: 3vh;">Review List</h5>
        <!--list of reviews goes here-->
        <table class="table table-hover" th:if="${review != null}">
            <tr>
                <th>Product ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Review Content</th>
            </tr>
            <tr th:each="review : ${review}">
                <td>1</td>
                <td th:text="${review.getName()}"></td>
                <td th:text="${review.getEmail()}"></td>
                <td th:text="${review.getReviewContent()}"></td>
            </tr>
        </table>
    </div>
    <div th:if="${review == null}">
        <p>Nothing to show here...</p>
    </div>
    
    
</body>
</html>