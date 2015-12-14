<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>操作</title>
  <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
  <link href="pages/css/top_style.css" rel="stylesheet">
  <link href="pages/css/bootstrap.min.css" rel="stylesheet">
  <link href="pages/css/login_style.css" rel="stylesheet">
  <link href="pages/css/op_style.css" rel="stylesheet">
  <script src="pages/js/jquery-2.1.4.min.js"></script>
  <script src="pages/js/op_js.js"></script>
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
  <div class="top">
   <div class="blackPurdah" style="height:15%;position:fixed;">
   </div>
   <%
       String e = (String)session.getAttribute("errMsg");
       if(e!=null){
    	   out.print(   
    	    "<div class=\"blackPurdah\" style=\"height:10%;position:fixed;top:16%;\">"
    	   +"<span style=\"font-family:SHSCN-Bold;font-size:36px;color:#FF9900;padding-left:40%\">"
    	   +"<strong>"+e+"</strong>"
    	   +"<span>"
           +"</div>");
    	   session.removeAttribute("errMsg");
       }
    %>
   <div style="z-index:4;position:fixed;top:3.5%;width:100%;">
      <a href="http://139.129.24.81:10566/QuickATM/LoginOut">                                    <!--  href -->
         <img style="cursor:pointer;position:relative;top:5%;" src="pages/image/prev.png"/>
	  </a>
	  <a href="http://139.129.24.81:10566/QuickATM/LoginOut">                                    <!--  href -->
	     <label style="cursor:pointer;color:rgba(255,255,255,0.6);font-family:SHSCN-Bold;font-size:28px;margin-top:5px">取卡退出</label>
	  </a>
	  <div style="top: 5px;position: fixed;right: 10%;">
	     <label style="color: #FF9900;font-family: SHSCN-Bold;font-size: 48px;margin-left: 1000px;margin-top: 15px;">
	        <strong>Q&A</strong>
	     </label>
	  </div>
   </div>  
   <div class="content">
      <span class="contentText" style="opacity:1;">
         <strong>
	        欢迎使用<span style="color:#FF9900;font-size:56px;display:inline;">QuickPay&ATM</span>
	     </strong><br/><br/><br/>
         <strong>
	        你可以在左边面板选择各类ATM操作，取卡退出请点击页面
顶部的退出条图标.
	     </strong><br/><br/><br/>
	  </span>
   </div>
   <div class="op_border">
      <div class="op_border_div" style="border-color:#FF9900 #FF9900 #FFFFFF #FF9900;margin-top:0px;background-color:#FF9900;color:#000000;">
	     <strong>操作</strong>
	  </div>
      <div class="op_border_div"   onclick="window.location.href='http://139.129.24.81:10566/QuickATM/pfs_s?p=op.jsp'" style="background-color:#FFFFFF;border-color:#FFFFFF #FF9900 #FFFFFF #FFFFFF;">
	    <span>
	     首页
		</span>
	  </div>
      <div class="op_border_div"  onclick="window.location.href='http://139.129.24.81:10566/QuickATM/pfs_s?p=op_deposit.jsp'" onmouseout="cgOpBorderDivMouseOut($(this))" onmousemove="cgOpBorderDivMouseOver($(this))">
	    <span>
	    存款
		</span>
	  </div>
      <div class="op_border_div"  onclick="window.location.href='http://139.129.24.81:10566/QuickATM/pfs_s?p=op_deposit.jsp'"  onmouseout="cgOpBorderDivMouseOut($(this))" onmousemove="cgOpBorderDivMouseOver($(this))">
	    <span>
	     取款
		</span>
	  </div>
      <div class="op_border_div"  onclick="window.location.href='http://139.129.24.81:10566/QuickATM/CheckAccountBalance'"  onmouseout="cgOpBorderDivMouseOut($(this))" onmousemove="cgOpBorderDivMouseOver($(this))">
	    <span>
	    查询账户余额
		</span>
	  </div>
      <div class="op_border_div"  onclick="window.location.href='http://139.129.24.81:10566/QuickATM/pfs_s?p=op_transfer.jsp'"  onmouseout="cgOpBorderDivMouseOut($(this))" onmousemove="cgOpBorderDivMouseOver($(this))">
	    <span>
	      转账
		</span>
	  </div>
      <div class="op_border_div"  onclick="window.location.href='http://139.129.24.81:10566/QuickATM/pfs_s?p=op_modifyPassword.jsp'"  onmouseout="cgOpBorderDivMouseOut($(this))" onmousemove="cgOpBorderDivMouseOver($(this))">
	    <span>
	     修改密码
		</span>
	  </div>
   </div>
  </div>
  <!--
  <div class="intro3">
     <label class="introText">
	   <strong>���֧������</strong>
	 </label>
  </div>
  <div class="intro1">
     <label class="introText" style="left:10%;">
	    <strong>��ȫ֧������</strong>
	 </label>
  </div>
  <div class="intro2">
     <label class="introText">
	    <strong>����֧������</strong>
	 </label>
  </div>
  -->
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