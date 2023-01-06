<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.css" />
<title>Ajax</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="js/bootstrap.js"></script>
<script type="text/javascript">
	let searchRequest = new XMLHttpRequest();
	let registerRequest = new XMLHttpRequest();
	function searchFunction() {
		console.log(searchRequest);
		searchRequest.open("POST", "./UserSearchServlet?userName="
				+ encodeURIComponent(document.getElementById("userName").value,
						true));
		searchRequest.onreadystatechange = searchProcess;
		console.log(searchRequest);
		searchRequest.send(null);
		console.log(searchRequest);
	}

	function searchProcess() {
		let table = document.getElementById("ajaxTable");
		table.innerHTML = "";
		if (searchRequest.readyState == 4 && searchRequest.status == 200) {
			let object = eval('(' + searchRequest.responseText + ')');
			let result = object.result;
			for (let i = 0; i < result.length; i++) {
				let row = table.insertRow(0);
				for (let j = 0; j < result[i].length; j++) {
					let cell = row.insertCell(j);
					cell.innerHTML = result[i][j].value;
				}
			}
		}
	}
	
	function registerFunction(){
		registerRequest.open("POST", "./UserRegisterServlet?userName="+ encodeURIComponent(document.getElementById("registerName").value)
						+ "&userAge=" + encodeURIComponent(document.getElementById("registerAge").value)
						+ "&userGender=" + encodeURIComponent($('input[name=registerGender]:checked').val())
						+ "&userEmail=" + encodeURIComponent(document.getElementById("registerEmail").value),true);
		registerRequest.onreadystatechange = registerProcess;
		registerRequest.send(null);
	}
	function registerProcess(){
		if (registerRequest.readyState == 4 && registerRequest.status == 200) {
			let result = registerRequest.responseText;
			if(result != 1){
				alert('등록에 실패했습니다.');
			}else{
				let userName = document.getElementById("userName");
				let registerName = document.getElementById("registerName");
				let registerAge = document.getElementById("registerAge");
				let registerEmail = document.getElementById("registerEmail");
				userName.value="";
				registerName.value="";
				registerAge.value="";
				registerEmail.value="";
				searchFunction();
			}
		}
	}
	
	window.onload = function() {
		console.log("window onload시 searchFunction 실행");
		searchFunction();
	}
</script>
</head>
<body>
	<br>
	<div class="container">
		<div class="form-group row pull-right">
			<div class="col-xs-8">
				<input type="text" onkeyup="searchFunction()" id="userName"
					class="form-control" size="20" />
			</div>
			<div class="col-xs-2">
				<button class="btn btn-primary" onclick="searchFunction();"
					type="button">검색</button>
			</div>
		</div>
		<table class="table"
			style="text-align: center; border: 1px solid #dddddd">
			<thead>
				<tr>
					<th style="background-color: #fafafa; text-align: center;">이름</th>
					<th style="background-color: #fafafa; text-align: center;">나이</th>
					<th style="background-color: #fafafa; text-align: center;">성별</th>
					<th style="background-color: #fafafa; text-align: center;">이메일</th>
				</tr>
			</thead>
			<tbody id="ajaxTable">
				<tr>
					<td>오원택</td>
					<td>25</td>
					<td>남자</td>
					<td>dnjsxorchlrh@naver.com</td>
				</tr>
			</tbody>
		</table>
	</div>

	<div class="container">
		<table class="table" style="text-aglin:center; border:1px solid #dddddd">
			<thead>
				<tr>
					<th colspan="2" style="background-color:#fafafa; text-align:center;">회원 등록 양식</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td style="background-color:#fafafa; text-align:center;"><h5>이름</h5></td>
					<td><input class="form-control" type="text" id="registerName" size="20" /></td>
				</tr>
				<tr>
					<td style="background-color:#fafafa; text-align:center;"><h5>나이</h5></td>
					<td><input class="form-control" type="text" id="registerAge" size="20" /></td>
				</tr>
				<tr>
					<td style="background-color:#fafafa; text-align:center;"><h5>성별</h5></td>
					<td>
						<div class="form-group" style="text-align:center;margin:0 auto;">
							<div class="btn-group" data-toggle="buttons" style="text-align:center; margin: 0 auto;">
								<label class="btn btn-primary active">
									<input type="radio" name="registerGender" autocomplete="off" value="남자" checked>남자
								</label>
								<label class="btn btn-primary">
									<input type="radio" name="registerGender" autocomplete="off" value="여자" checked>여자
								</label>
							</div> 
						</div>
					</td>					
				</tr>
				<tr>
					<td style="background-color:#fafafa; text-align:center;"><h5>이메일</h5></td>
					<td><input class="form-control" type="text" id="registerEmail" size="20" /></td>
				</tr>
				
				<tr>
					<td colspan="2"><button class="btn btn-primary pull-right" onclick="registerFunction();" type="button">등록</button></td>	
				</tr>
			</tbody>
		</table>
	</div>


</body>
</html>