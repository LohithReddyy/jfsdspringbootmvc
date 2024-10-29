


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <style>
        .welcome-message {
            position: absolute;
            top: 20px;
            right: 20px;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border-radius: 5px;
            display: none; /* Initially hide the message */
        }
    </style>
</head>
<body>
 <%@include file="navbar.jsp" %>
    <h1>Home Page</h1>
    
    <div class="welcome-message" id="welcomeMessage">
        <c:if test="${not empty welcomeMessage}">
            <p>${welcomeMessage}</p>
        </c:if>
    </div>

    <script>
        // Show the welcome message if it exists
        window.onload = function() {
            var messageDiv = document.getElementById("welcomeMessage");
            if (messageDiv.innerHTML.trim() !== "") {
                messageDiv.style.display = "block"; // Show the message
                setTimeout(() => { messageDiv.style.display = "none"; }, 5000); // Hide after 5 seconds
            }
        };
    </script>
</body>
</html>
