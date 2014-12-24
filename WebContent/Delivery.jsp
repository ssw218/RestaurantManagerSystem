<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Insert title here</title>
	</head>
	<body>
		<table id="table_click" width="820" border="0" bgcolor="#2e8b57">
        	<tbody>
        	<tr id="letter" style="color: #FFFFFF; font-weight: lighter">
            	<td width="664" height="23" align="left">送餐计划时间段: 11:00 — 13:00 现在是 <span id="clock"></span></td>
            	<td id="add" width="136">添加更多送餐计划</td>
          	</tr>
        	</tbody>
      	</table>
		<table id="table_close" width="820" height="200" border="0" bgcolor="#2e8b57">
  			<tbody>
   	 		<tr>
      			<td valign="top" bgcolor="#FFFFFF">
      				<br>
        			<div><input type="checkbox" name="CheckboxGroup1" value="复选框" id="CheckboxGroup1_0">1号套餐 * 3 送餐地点：天津市西青区</div>
       				<div><input type="checkbox" name="CheckboxGroup1_" value="复选框" id="CheckboxGroup1_1">2号套餐* 1 送餐地点：天津市西青区</div>
       	 			<div><input type="checkbox" name="CheckboxGroup1_" value="复选框" id="CheckboxGroup1_2">1号套餐 * 1 3号套餐 * 1 送餐地点：天津市西青区</div>
        			<div><input type="checkbox" name="CheckboxGroup1_" value="复选框" id="CheckboxGroup1_3">1号套餐 送餐地点：天津市西青区</div>
        			<div><input type="checkbox" name="CheckboxGroup1_" value="复选框" id="CheckboxGroup1_4">1号套餐 送餐地点：天津市西青区</div>
      			</td>
    		</tr>
    		<tr>
      			<td height="50">———————<input type="button" name="button" id="button" value="做菜">
     			 	———————<input type="button" name="button2" id="button2" value="装菜">
      				————————<input type="button" name="button3" id="button3" value="送饭">
      				————————————<input type="button" name="button4" id="button4" value="完成">—
      			</td>
    		</tr>
  			</tbody>
		</table>
		<script src="./js/jquery-2.1.1.min.js"></script>
		<script src="./js/clock.js"></script>
		<script src="./js/close.js"></script>
		<script src="./js/progress.js"></script>
	</body>
</html>