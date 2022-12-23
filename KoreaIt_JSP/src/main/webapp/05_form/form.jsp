<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입</h3>
	<form action="form_proc3.jsp" name="member" method="post">
		<p>아이디: <input type="text" name="id"> <input type="button" value="아이디 중복검사"></p>
		<p>비밀번호: <input type="password" name="passwd"/></p>
		<p>이름: <input type="text" name="name"/></p>
		<p>연락처:
			<select name="phone1">
				<option value="010">010</option>
				<option value="011">011</option>
				<option value="016">016</option>
				<option value="017">017</option>
				<option value="019">019</option>
			</select>	
	
		- <input type="text" maxlength="4" size="4" name="phone2"/>
		- <input type="text" maxlength="4" size="4" name="phone3"/></p>
		<p>성별 : <input type="radio" name="sex" value="남성" checked />남성
		<input type="radio" name="sex" value="여성" />여성</p>
		<p>취미 : 독서<input type="checkbox" name="hobby" value="독서" checked>
			운동<input type="checkbox" name="hobby" value="운동" >
			영화<input type="checkbox" name="hobby" value="영화" >
		</p>
		<p>
			<textarea name="comment" cols="30" rows="3" placeholder="가입인사를 입력해주세요"></textarea>
		</p>
		<p> 
			<input type="submit" value="가입하기">
			<input type="reset" value="다시쓰기">
		</p>	
		<p> 주소 : 
			<input name="zipcode" id="zipcode" size="10" maxlength="7" readonly>
            <span onclick="execDaumPostcode();" style="cursor:pointer;">우편번호 검색</span><br />
            <input name="address01" id="address01" size="70" maxlength="70" readonly> 
            <input name="address02" id="address02" size="70" maxlength="70">
		</p>	
		
		
	</form>
	<script src="https://spi.maps.daum.net/imap/map_js_init/postcode.v2.js"></script>
    <script>
        /* 
        카카오 우편번호 검색 가이드 페이지 :  https://postcode.map.daum.net/guide
        getElementById() : html 에서 매개변수로 받은 id 값이 있는 요소를 반환.
        */
        function execDaumPostcode() {
            new daum.Postcode({
                oncomplete: function(data) {
                    // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                    // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                    // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                    var fullAddr = ''; // 최종 주소 변수
                    var extraAddr = ''; // 조합형 주소 변수

                    // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                    if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                        fullAddr = data.roadAddress;
                    }
                    else { // 사용자가 지번 주소를 선택했을 경우(J)
                        fullAddr = data.jibunAddress;
                    }

                    // 사용자가 선택한 주소가 도로명 타입일때 조합한다.
                    if(data.userSelectedType === 'R'){
                        //법정동명이 있을 경우 추가한다.
                        if(data.bname !== ''){
                            extraAddr += data.bname;
                        }
                        // 건물명이 있을 경우 추가한다.
                        if(data.buildingName !== ''){
                            extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                        }
                        // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
                        fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
                    }

                    // 우편번호와 주소 정보를 해당 필드에 넣는다.
                    document.getElementById('zipcode').value = data.zonecode; //5자리 새우편번호 사용
                    document.getElementById('address01').value = fullAddr;

                    // 커서를 상세주소 필드로 이동한다.
                    document.getElementById('address02').focus();
                }
            }).open();
        }
    </script>    
</body>
</html>