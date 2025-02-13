<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<script src="/js/common_util.js"></script>
<script>
function keypressed()
{
	if (event.keyCode == 116 || event.keyCode == 123) {
	//alert("키보드 사용은 안됩니다");
	event.keyCode = 0;
	return false;
	}
}

function click()
{
	if((event.button==2) || (event.button==3)){
		alert("오른쪽 버튼을 사용할 수 없습니다");
	}
}
document.onkeydown = keypressed;
document.onmousedown = click;	
</script>
			<h1 id="logo">
				<a href="/index.html">
					<img src="/images/coreplus_logos.png" alt="코어플러스" />

				</a>
			</h1>

			<section>
				<h1 class="hidden">헤더</h1>

				<nav id="main-menu">
					<h1>메인메뉴</h1>
					<ul>
						<li><a href="/guide">학습가이드</a></li>

						<li><a href="/course">강좌선택</a></li>
						<li><a href="/answeris/index">AnswerIs</a></li>
					</ul>
				</nav>

				<div class="sub-menu">

					<section id="search-form">
						<h1>강좌검색 폼</h1>
						<form action="/course">
							<fieldset>
								<legend>과정검색필드</legend>
								<label>과정검색</label>
								<input type="text" name="q" value="" />
								<input type="submit" value="검색" />
							</fieldset>
						</form>
					</section>

					<nav id="acount-menu">
						<h1 class="hidden">회원메뉴</h1>
						<ul>
							<li><a href="/index.html">HOME</a></li>
							<li><a href="/member/login.html">로그인</a></li>
							<li><a href="/member/agree.html">회원가입</a></li>
						</ul>
					</nav>

					<nav id="member-menu" class="linear-layout">
						<h1 class="hidden">고객메뉴</h1>
						<ul class="linear-layout">
							<li><a href="/member/home"><img src="/images/txt-mypage.png" alt="마이페이지" /></a></li>
							<li><a href="/notice/list.html"><img src="/images/txt-customer.png" alt="고객센터" /></a></li>
						</ul>
					</nav>

				</div>
			</section>