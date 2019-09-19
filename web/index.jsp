<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ChuyenDoiTienTe</title>
  </head>
  <body>
<h2> Simple Caculator</h2>
  <form method="post" action="/Converter">
    <label>Caculator</label><br>
    <label>First Operand</label>
    <input type="text" name="first_operand" placeholder="First Operand"><br>
    <label>Operator</label>
    <select name="operator">
      <option value="+">Addition</option>
      <option value="-">Subtraction</option>
      <option value="*">multiplication</option>
      <option value="/">Division</option>

    </select><br>
    <label>Second Operand</label>
    <input type="text" name="second_operand" placeholder="Second Operand"><br>
    <input type="submit" name="submit" value="Caculate">


  </form>
  </body>
</html>
