<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <div class="thanks-container">
        <h1>Thanks for joining our email list</h1>

        <p>Here is the information that you entered:</p>

        <label>Email:</label>
        <span>${email}</span><br>
        <label>First Name:</label>
        <span>${firstName}</span><br>
        <label>Last Name:</label>
        <span>${lastName}</span><br>
        <label>Day of Birth:</label>
        <span>${dob}</span><br>
        <label>Heard From:</label>
        <span>${heardFrom}</span><br>
        <label>Wants Updates:</label>
        <span>${wantsUpdates}</span><br>
        <label>Email OK:</label>
        <span>${emailOK}</span><br>
        <label>Contact Via:</label>
        <span>${contactVia}</span><br>

        <p>To enter another email, click the Return button below.</p>

        <form action="index.html" method="get">
            <input type="submit" value="Return">
        </form>
    </div>
</body>
</html>
