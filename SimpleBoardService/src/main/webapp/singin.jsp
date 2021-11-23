<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<title>Section</title>
</head>
<body>
	<header>
		<div class="row-fluid">

			<div align="left">

				<nav class="navbar navbar-default">
					<div class="container-fluid">
						<div class="navbar-header" style="display: flex">


							<div class="page-header">
								<a href="Section.jsp"><h1>
										Simple Board <small>Toy Project</small>
									</h1></a>
							</div>

							<div
								style="position: absolute; top: 0px; right: 0px; float: right">
								<div>
									<button type="button" class="btn btn-default navbar-btn"
										onclick="location.href='singin.jsp'">Sign-in</button>
									<button type="button" class="btn btn-default navbar-btn"
										onclick="location.href='login.jsp'">Log-in</button>
								</div>
								<div class="login_box" id="id" style="display: none;">빙빙
									돌아가는 회전 목마 처럼</div>
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
		<div class="imgbox"
			style="height: 400px; background-image: url('https://media.istockphoto.com/photos/old-school-chalkboard-picture-id547016978?b=1&amp;k=20&amp;m=547016978&amp;s=170667a&amp;w=0&amp;h=CFpK3c30n2dD059xLC0PxngaX1wMn2Aa5erw9M0ub3s=')">
			<h1
				style="color: white; position: absolute; left: 50%; top: 50%; margin: auto;">Simple
				Board</h1>

			<hr>
		</div>


		<section style="width: 65%">
			<!-- 본문 -->
			<!-- <table border="4" style="background-color: gray; border-color: black">
			<thead><tr align="center"> <td colspan="2"><h3>회원가입</h3></td></tr> </thead>
				<tr><td>아이디(이메일):</td><td><input type="email" name="email" placeholder="hgj0307@hanmail.net" required="required" ></td></tr>
				<tr><td>비밀번호:</td><td><input type="password" name="password" required="required"   id="password"></td></tr>
				<tr><td>비밀번호 확인:</td><td><input type="password"  id="password2" name="name" required="required" ></td><td><div id="pwd_check"></div></td></tr>
				
				<tr><td>이름 :</td><td><input type="text"  id="name" name="name" required="required" ></td></tr>
				<tr><td>주소:</td><td><input type="text"  id="address" required="required" name="address" ></td></tr>
			</table> --> 
			
			<h1>회원가입</h1>
			<form method="post" action="/signin.do">
				<div align="left" class="form_box">
					<div class="form-group">
						<label for="InputName">성명</label> <input type="text"
							class="form-control" id="name" name="name" placeholder="ex)황규준">
					</div>
					<div class="form-group">
						<label for="InputEmail">이메일 주소</label> <input type="email"
							class="form-control" id="email" name="email"
							placeholder="ehdrmf0307@naver.com">
					</div>


					<div class="form-group">
						<label for="InputPassword">비밀번호</label> <input type="password"
							class="form-control" id="password" name="password">
					</div>
					<div class="form-group" style="">
						<label for="InputPassword2">비밀번호 확인</label> <input type="password"
							class="form-control" id="password2">
						<div id="pwd">이히히</div>

					</div>
					<div class="form-group">
						<label for="InputAddress">주소</label> <input type="text"
							class="form-control" id="address" name="address">
					</div>

					<div class="form-group">

						<input type="submit" class="btn btn-primary" id="btn_final"
							value="회원가입">
					</div>


				</div>
			</form>
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
<script src="${pageContext.request.contextPath}/resources/js/signin.js"></script>
</body>
</html>