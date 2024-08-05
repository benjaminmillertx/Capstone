<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login - Miller Talent Agency</title>
</head>
<body>
    <header>
        <h1><img src="camera_logo.png" alt="Miller Talent Agency Logo"> Miller Talent Agency</h1>
    </header>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <button type="submit">Login</button>
    </form>
    <footer>
        <p>© Miller Talent Agency</p>
    </footer>
</body>
</html>
