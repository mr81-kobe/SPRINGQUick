<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<title>InsertBoard</title>
</head>
<body>
	<header>
		<div class="row-fluid">

			<div align="left">

				<nav class="navbar navbar-default">
					<div class="container-fluid">
						<div class="navbar-header" style="display: flex">


							<div class="page-header" >
								<a href="Section.jsp"><h1>
										Simple Board <small>Toy Project</small>
									</h1></a>
							</div>

							<div style="position: absolute; top: 0px; right: 0px; float: right"  >
								<div id="first"  style="display: block;">
									<button type="button" class="btn btn-default navbar-btn" onclick="location.href='singin.jsp'">Sign-in</button>
									<button type="button" class="btn btn-default navbar-btn" onclick="location.href='login.jsp'">Log-in</button>
								</div>
								<div class="login_box" id="last" style="display: block;" >${userID } 님 환영합니다.
									<button type="button" class="btn btn-default navbar-btn" onclick="location.href='logout.do'">log-out</button>
								</div>
								<ul class="nav nav-tabs">
									<li role="presentation" class="active"><a href="#">Home</a></li>
									<li role="presentation"><a href="#">BoardList</a></li>
									<li role="presentation"><a href="#">Info</a></li>
									<li role="presentation"><a href="#">Profile</a></li>
								</ul>
								
							</div>



						</div>
					</div>
				</nav>
			</div>



		</div>
	</header>
	<div class="container" align="center">
		<div class="imgbox" align="center"
			style="height: 400px; background-image: url('https://media.istockphoto.com/photos/old-school-chalkboard-picture-id547016978?b=1&amp;k=20&amp;m=547016978&amp;s=170667a&amp;w=0&amp;h=CFpK3c30n2dD059xLC0PxngaX1wMn2Aa5erw9M0ub3s=')">
			<h1
				style="color: white; position: absolute; left: 50%; top: 50%; margin: auto;">Simple
				Board</h1>

			<hr>
		</div>


		<section style="width: 80%">
			<div class="panel panel-default">
				
				

						

				<h1>글 쓰기</h1>
				<hr>
				<form action="/insertBoard.do" method="post" id="insertform">
					<div align="left" class="form_box">

						<div class="form-group">
							<label for="InputMail">제목</label> <input type="text"
								class="form-control" id="title" name="title"
								placeholder="">
						</div>
						<div class="form-group">
							<label for="InputPassword">내용:</label> 
							<br>
							<textarea rows="14" cols="100" name="content"></textarea>
						</div>
						<select class="form-select" aria-label="Default select example" name="tag">
  							<option selected >Open this select menu</option>
  							<option value="option1">One</option>
  							<option value="option2">Two</option>
  							<option value="option3">Three</option>
						</select>
						<input type="hidden" value="${userID}" name="writer">
						
						<input type="submit" value="글 쓰기" class="btn primary-btn"
							id="insertBoard">
					</div>
				</form>


			</div>


		</section>
		<footer>
			<div class="jumbotron" align="center">
				<h3>Footer</h3>
				<p>
					You only live once<br> <br> Follow your heart<br> <br>
					Past in jsust past<br> <br> Love your self
				</p>
			</div>
			<hr>
		</footer>
	</div>
<script type="text/javascript">
	var userID ='${userID}';
	if(userID!=""){
		
		$("#id").css("display" ,"block"); 
		$("#first").css("display","none");
		
	}
	</script>

</body>
</html>