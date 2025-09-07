<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex04</title>
<style>
   #name-message {
      color:black;
   }
   #name-message.active {
      color: red;
   }
</style>
</head>
<body>
   <form action="ex04" method="post" name="placeForm">
      <input type="text" name="place" placeholder="지역을 입력해주세요.">
      <p id="name-message"></p>
      <input type="button" value="전송">
      
   </form>
</body>
<script>
   const button = document.querySelector("input[type=button]");
   
   button.addEventListener("click", (e) => {
      placeForm.submit(); 
   })
   
</script>
</html>




