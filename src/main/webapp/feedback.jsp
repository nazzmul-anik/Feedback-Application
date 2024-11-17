<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Feedback Page</title>
  <%@include file="comp/links.jsp"%>
</head>
<body>
  <%@include file="header.jsp"%>

  <div class="content_container container d-flex flex-column justify-content-center align-items-center">
    <h3 class="text-white">Fill the feedback form:</h3>

    <form action="feedback" method="post" class="mt-3 text-white">
      <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Email Address</label>
        <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter here">
        <div id="emailHelp" class="form-text text-white">We'll never share your email with anyone else.</div>
      </div>
      <div class="mb-3">
        <label for="phoneNumber" class="form-label">Phone Number</label>
        <input type="text" class="form-control" id="phoneNumber" placeholder="Enter here">
      </div>
      <div class="mb-3">
        <label for="feedbackMessage" class="form-label">Your Feedback Message</label>
        <textarea rows="7" placeholder="Enter Here" class="form-control"></textarea>
      </div>
      <div class="container text-center">
        <button type="submit" class="btn btn-success">Submit</button>
        <button type="submit" class="btn btn-light">Reset</button>
      </div>

    </form>
  </div>

<%@include file="comp/script.jsp"%>
</body>
</html>