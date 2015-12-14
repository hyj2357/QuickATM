<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>操作</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
   <div style="z-index:4;position:fixed;top:3.5%;width:100%;">
      <a href="http://localhost:8080/QuickATM/LoginOut">
         <img style="cursor:pointer;position:relative;top:5%;" src="pages/image/prev.png"/>
	  </a>
	  <a href="http://localhost:8080/QuickATM/LoginOut">
	     <label style="cursor:pointer;color:rgba(255,255,255,0.6);font-family:SHSCN-Bold;font-size:28px;margin-top:5px">取卡退出</label>
	  </a>
	  <div style="top: 5px;position: fixed;right: 10%;">
	     <label style="color: #FF9900;font-family: SHSCN-Bold;font-size: 48px;margin-left: 1000px;margin-top: 15px;">
	        <strong>Q&A</strong>
	     </label>
	  </div>
   </div>  
   <div class="content">
      <div style="left: 50%;position: absolute;top:30%;">
          <form>
	          <div class="inputGroup">
	            <label>	  
	               <span class="inputLabel" style="font-size:36px;">
	                  <strong>您的账户(人民币)余额:</strong>	  
	               </span>
	            </label>&nbsp;&nbsp;&nbsp;
                <!-- <input class="inputTxt"  type="text" placeholder="������������"/><br/><br/><br/> -->
	            <label>	  
	               <span class="inputLabel" style="font-size:36px;">
	                  <strong>
	                   <%
	                       out.print(session.getAttribute("balance"));                    //动态插入
	                       session.removeAttribute("balance");
	                   %> 元
	                   </strong>	  
	               </span>
	            </label>
	          </div>
	      </form>
      </div>
      <br/><br/>
     </div>
   </div>
   <div class="op_border">
      <div class="op_border_div" style="border-color:#FF9900 #FF9900 #FFFFFF #FF9900;margin-top:0px;background-color:#FF9900;color:#000000;">
	     <strong>操作</strong>
	  </div>
      <div class="op_border_div"   onclick="window.location.href='http://localhost:8080/QuickATM/pfs_s?p=op.htm'" onmouseout="cgOpBorderDivMouseOut($(this))" onmousemove="cgOpBorderDivMouseOver($(this))">
	    <span>
	     首页
		</span>
	  </div>
      <div class="op_border_div"  onclick="window.location.href='http://localhost:8080/QuickATM/pfs_s?p=op_deposit.htm'" onmouseout="cgOpBorderDivMouseOut($(this))" onmousemove="cgOpBorderDivMouseOver($(this))">
	    <span>
	     存款
		</span>
	  </div>
      <div class="op_border_div"  onclick="window.location.href='http://localhost:8080/QuickATM/pfs_s?p=op_draw.htm'"  onmouseout="cgOpBorderDivMouseOut($(this))" onmousemove="cgOpBorderDivMouseOver($(this))">
	    <span>
	     取款
		</span>
	  </div>
      <div class="op_border_div"  onclick="window.location.href='http://localhost:8080/QuickATM/CheckAccountBalance'"   style="background-color:#FFFFFF;border-color:#FFFFFF #FF9900 #FFFFFF #FFFFFF;">
	    <span>
	     查询账户余额
		</span>
	  </div>
      <div class="op_border_div"  onclick="window.location.href='http://localhost:8080/QuickATM/pfs_s?p=op_transfer.htm'"  onmouseout="cgOpBorderDivMouseOut($(this))" onmousemove="cgOpBorderDivMouseOver($(this))">
	    <span>
	      转账
		</span>
	  </div>
      <div class="op_border_div"  onclick="window.location.href='http://localhost:8080/QuickATM/pfs_s?p=op_modifyPassword.htm'"  onmouseout="cgOpBorderDivMouseOut($(this))" onmousemove="cgOpBorderDivMouseOver($(this))">
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