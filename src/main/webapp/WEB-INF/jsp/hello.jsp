<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">
	$(function(){
	/* 
		查询一级下拉
	*/
		$.post("/industry/queryAll.do",function(data){
			alert(data);
			var str = "";
			for(var i in data){
				str+="<option value='"+data[i].sid+"'>"+data[i].name+"</option>"
			}
			$("#one").html(str);
		},"json")
		
		$("#one").change(function(){
			
			var id = $(this).val();
			
			$.post("/industry/queryAll.do",{"id":id},function(data){
				
				var str = "";
				for(var i in data){
					str+="<option value='"+data[i].id+"'>"+data[i].name+"</option>"
				}
				$("#two").html(str);
			},"json")
		})
		
		$("#two").change(function(){
			
			var id = $(this).val();
			
			$.post("/industry/queryAll.do",{"id":id},function(data){
				
				var str = "";
				for(var i in data){
					str+="<option value='"+data[i].id+"'>"+data[i].name+"</option>"
				}
				$("#three").html(str);
			},"json")
		})
	})

</script>
<body>
行业:<select id="one">
			<option value="0">请选择行业</option>
		</select>
	<select id="two">
			<option value="0">请选择行业</option>
		</select>
		<select id="three">
			<option value="0">请选择行业</option>
		</select>
</body>
</html>