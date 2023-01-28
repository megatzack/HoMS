<!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="description" content="MoHS Login Screen">
            <meta name="keywords" content="LoginScreen">
            <meta name="author" content="Amin Haiqal">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">  
            <!-- CSS only -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
            <link rel="stylesheet" th:href="@{/css/login.css}">
            <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
            <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inter">
            <!-- JavaScript Bundle with Popper -->
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
            <link rel="shortcut icon" href="https://drive.google.com/uc?id=1P0d6aIdRMr61ImxVX2uAvYFrRzKb3PQo">
            <title>HoMS</title>
        </head>
        <body>
            <img class="logo" src="/image/HoMS-04.png" alt="login">
            <img class="wallpaper" src="/image/login.jpg" alt="login">
            <p class="title">Welcome Back !</p>
            <p class="description">please enter your details.</p>
            <form action="welcomeBack" method="post">
                <div class="mb-3">
                    <label for="Output1" class="email">Email</label>
                    <input type="email" class="form-control" name="email" id="email" placeholder="name@example.com">

                </div>
                <div class="mb-3">
                    <label for="Output2" class="password">Password</label>
                    <input type="password" class="form-control" name="password" id="pass">
                </div>
                <table>
                    <tr>
                        <td class="forgotPassword">Forgot Password?</td>
                    </tr>
                </table>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" unchecked required>
                    <label class="form-check-label" for="flexCheckChecked">
                        I agree to <b>Terms and Conditions.</b>
                    </label>
                </div>
                <button type="submit" id="submit">Sign In</button>
            </form>
            <p class="signUp">Dont have an account?
            <a href="/register">
                <u>Create Account</u>
            </a></p>

            <div class="alert alert-danger" role="alert">
                This is a danger alert with <a href="#" class="alert-link">an example link</a>. Give it a click if you like.
            </div>
        </body>
    </html>

    <script>
        $('.alert').alert();
    </script>