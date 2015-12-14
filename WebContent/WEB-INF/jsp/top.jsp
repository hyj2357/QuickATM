<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>主页</title>
  <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
  <link href="pages/css/top_style.css" rel="stylesheet">
  <script src="pages/js/jquery-2.1.4.min.js"></script>
</head>

<body>
  <script type="text/javascript">
     function changeButtonStatusMouseOver(){
         $(".topButton").css("color","#FFFFFF");
         $(".topButton").css("background-color","#FF9900");
	 }
     function changeButtonStatusMouseOut(){
		 $(".topButton").css("color","#FF9900");
         $(".topButton").css("background-color","");
	 }
  </script>
  <div class="floatInfo">
  </div>
  <div class="top">
    <div class="blackPurdah"></div>	   
	<div class="name">
	       <strong>QuickPay&ATM</strong>
	</div>
	<div class="topButton" align="center" onclick="window.location.href='http://139.129.24.81:10566/QuickATM/pfs?pagePath=login.jsp'" onmouseout="changeButtonStatusMouseOut()" onmousemove="changeButtonStatusMouseOver()">
	  <span class="buttonText">
	      <strong>点击进入</strong>	  
	  </span>
	</div>
  </div>
  <div class="intro3">
     <label class="introText">
	   <strong>快捷支付体验</strong>
	 </label>
  </div>
  <div class="intro1">
     <label class="introText" style="left:10%;">
	    <strong>安全支付保障</strong>
	 </label>
  </div>
  <div class="intro2">
     <label class="introText">
	    <strong>方便支付需求</strong>
	 </label>
  </div>
  <div class="pageInfo">
     <div class="introText" style="left:50%;top:30%">
	  	<a href="http://www.baidu.com">
		    <strong>联系我们</strong>
		</a>
	 </div>
     <div class="introText" style="left:42%;">
	  	<strong>备案信息:XXXXXXXXXXXXX</strong>  
	 </div>
  </div>
</body>

</html>