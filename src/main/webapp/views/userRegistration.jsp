<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
   
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .registration-form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        .registration-form h2 {
            margin-bottom: 20px;
        }
        .registration-form label {
            display: block;
            margin-bottom: 5px;
        }
        .registration-form input[type="text"],
        .registration-form input[type="email"],
        .registration-form input[type="password"],
        .registration-form input[type="tel"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        .registration-form input[type="submit"] {
            width: 100%;
            padding: 20px;
            background-color: #4CAF50;
            border: none;
            border-radius: 3px;
            color: white;
            font-size: 16px;
            cursor: pointer;
        }
        .registration-form input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <div class="registration-form">
    
        <h2>User Registration</h2>
        <form action="registerUser" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            
            <label for="phoneNumber">Phone Number:</label>
            <input type="tel" id="phoneNumber" name="phoneNumber" required>
            
            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>