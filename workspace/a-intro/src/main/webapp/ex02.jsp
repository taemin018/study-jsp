<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex01</title>
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
   <form action="ex02" method="post" name="nameForm">
      <input type="text" name="number1" placeholder="정수을 입력해주세요.">
      <input type="text" name="number2" placeholder="정수을 입력해주세요.">
      <p id="name-message"></p>
      <input type="button" value="전송">
   </form>
</body>
<script>
   const button = document.querySelector("input[type=button]");
   
   button.addEventListener("click", (e) => {
      nameForm.submit(); 
   })
   
</script>
</html>




