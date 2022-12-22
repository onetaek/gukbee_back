<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Okky</title>
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/Okky-1.css">
</head>

<body>
    <!-- ----------------------------------------로고-------------------------------------------- -->
    <div id="headerWrap">
        <a href="#"><img class="logo" src="./img/okky.svg" alt="OKKY Logo"></a>
        <h2>OKKY에 오신것을 환영합니다.</h2>
        <p class="Explanation">OKKY는 소프트웨어 개발자를 위한 지식공유 플랫폼입니다.</p>
        <!-- --------------------------------------SNS로그인----------------------------------------------- -->
        <div class="SNSlogin">
            <span>SNS 회원가입</span>
            <div class="SNSimages">
                <a
                    href="https://github.com/login?client_id=ecbb8f7b235f3b66ae8e&return_to=%2Flogin%2Foauth%2Fauthorize%3Fclient_id%3Decbb8f7b235f3b66ae8e%26redirect_uri%3Dhttps%253A%252F%252Fapi.okky.kr%252Flogin%252Foauth2%252Fcode%252Fgithub%26response_type%3Dcode%26scope%3Dread%253Auser%26state%3Dth37thGwVHWTM0N-vVvhvsiIA3xQVYRRVGFkMN9-pJ0%253D"><svg
                        class="im1"></svg></a>
                <a
                    href="https://accounts.google.com/o/oauth2/v2/auth/identifier?response_type=code&client_id=1095456345592-lli7avm065sg4fakic8434am7gs1rscb.apps.googleusercontent.com&scope=email%20profile&state=8hl2PBampcmRnlOyUBl8wSLp-oNUPfbdtELy7-XYH0s%3D&redirect_uri=https%3A%2F%2Fapi.okky.kr%2Flogin%2Foauth2%2Fcode%2Fgoogle&service=lso&flowName=GeneralOAuthFlow"><svg
                        class="im2"></svg></a>
                <a
                    href="https://www.facebook.com/login.php?skip_api_login=1&api_key=1451111438499030&kid_directed_site=0&app_id=1451111438499030&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv2.8%2Fdialog%2Foauth%3Fresponse_type%3Dcode%26client_id%3D1451111438499030%26scope%3Demail%26state%3D1s_onDC1MCR0wP8a1xtUHdFMAHl6KSqeeMHrH4_40yE%253D%26redirect_uri%3Dhttps%253A%252F%252Fapi.okky.kr%252Flogin%252Foauth2%252Fcode%252Ffacebook%26ret%3Dlogin%26fbapp_pres%3D0%26logger_id%3D7d56204e-c3ab-41b7-a15d-dfd7d40a88a0%26tp%3Dunspecified&cancel_url=https%3A%2F%2Fapi.okky.kr%2Flogin%2Foauth2%2Fcode%2Ffacebook%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26state%3D1s_onDC1MCR0wP8a1xtUHdFMAHl6KSqeeMHrH4_40yE%253D%23_%3D_&display=page&locale=ko_KR&pl_dbl=0"><svg
                        class="im3"></svg></a>
                <a
                    href="https://nid.naver.com/oauth2.0/authorize?response_type=code&client_id=Vr0VLhUtPT00W8PYss0h&state=NHD8HmMSxzfPP7JuDSI17cdImrl9trHQnlspvpwkyBA%3D&redirect_uri=https://api.okky.kr/login/oauth2/code/naver"><svg
                        class="im4"></svg></a>
                <a
                    href="https://accounts.kakao.com/login?continue=https%3A%2F%2Fkauth.kakao.com%2Foauth%2Fauthorize%3Fscope%3Dprofile%2520account_email%26response_type%3Dcode%26state%3DiZnYSV7W2B4M2nic1aXeA31Mgob1YiJVMNW8F_cypCk%253D%26redirect_uri%3Dhttps%253A%252F%252Fapi.okky.kr%252Flogin%252Foauth2%252Fcode%252Fkakao%26through_account%3Dtrue%26client_id%3D71f448832727a1037722d48ee92a0701"><svg
                        class="im5"></svg></a>
            </div>
        </div>
        <!-- ---------------------------------------회원가입정보--------------------------------------------- -->
        <div id="signUptitle">
            <span>회원가입에 필요한 기본정보를 입력해주세요.</span>
        </div>
        <div id="lnformation">
            <form action="joinProc.jsp">
                <div>
                    <div class="emaillabel">
                        <label for="email">이메일</label>
                        <input name="email" id="email" type="text" class="box" placeholder="munchkin@okky.kr">
                    </div>
                    <div class="pwbox">
                        <label for="password">비밀번호</label>
                        <input name="password" id="passwrod" minlength="6" maxlength="15" type="password" class="box"
                            placeholder="최소 6자 이상(알바벳, 숫자 필수)">
                    </div>
                    <div class="pwConfirm">
                        <label for="passwordCheck">비밀번호 재확인</label>
                        <input name="passwordCheck" id="passwrodCheck" minlength="6" maxlength="15" type="password"
                            class="box" placeholder="최소 6자 이상(알바벳, 숫자 필수)">
                    </div>

                    <div class="name">
                        <label for="name">이름</label>
                        <input name="name" id="name" type="text" class="box" placeholder="홍길동">
                    </div>
                    <div class="nickname">
                        <label for="nickname">닉네임</label>
                        <input name="nickname" id="nickname" type="text" class="box"
                            placeholder="별명을 알파벳, 한글, 숫자를 20자 이하로 입력해주세요.">
                    </div>
                    <div class="phoneNumber">
                        <label for="phoneNumber">휴대폰 번호</label>
                        <div class="boxbundle">
                            <div id="phoneinfo">
                                <select name="newsAgency" id="newsAgency">
                                    <option value="SKT">SKT</option>
                                    <option value="KT">KT</option>
                                    <option value="LGU+">LGU+</option>
                                    <option value="알뜰폰">알뜰폰</option>
                                </select>
                                <input name="phoneNumber" id="phoneNumber" class="phoneBox" type="tel"
                                placeholder="전화번호 입력">
                            </div>
                            <input class="certification" type="submit" value="인증요청">
                        </div>
                        <div class="CertificationNumber">
                            <label for="CertificationNumber">인증번호 확인</label>
                            <div class="CNbox">
                            <input name="CNumber" id="CNumber" class="CNumber" type="tel"
                            placeholder="인증번호를 입력하세요">
                            <input class="CNConfirm" type="submit" value="인증확인">
                           </div>
                        </div>

                    </div>
                </div>
                <!-- -------------------------------이메일수신 동의 및 가입----------------------------------------------- -->
                <div class="emailbox">
                    <div class="email">
                        <label for="emailReceive" class="emailtext">이메일 수신동의</label>
                        <!-- <input type="checkbox" id="toggle" hidden> 
                    <label for="toggle" class="toggleSwitch">
                      <span class="toggleButton"></span> -->
                        <input type="checkbox" name="emailReceive" id="emailReceive">
                        <!-- <input type="radio" name="aree">
                      <input type="radio" name="isagree"> -->
                        </label>
                    </div>
                    <p>OKKY에서 주최하는 다양한 이벤트, 정보성 뉴스레터 및 광고 수신여부를 설정할 수 있습니다.</p>
                </div>
                <div>
                    <input class="submit" type="submit" value="회원가입"/>
                </div>
                <p class="loginbox">
                    <span>이미 회원이신가요?</span>
                    <a href="./login.jsp">로그인</a>
                </p>
            </form>
        </div>
    </div>
</body>

</html>