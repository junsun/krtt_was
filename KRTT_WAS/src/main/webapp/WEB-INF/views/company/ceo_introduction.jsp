<!DOCTYPE html>
<html lang="en">
<head>
<%@include file="../common_config.jsp"%><!--/.configurations (imports files, links files) -->
</head>
<!--/head-->
<body class="homepage">

	<%@include file="../common_header.jsp"%><!--/.header(menu) -->

	<section id="ceo-introduction">
		<div class="container">
			<div class="row">
				<div class="col-sm-8">
					<div class="media ceo-introduction wow fadeInDown"
						data-wow-duration="1000ms" data-wow-delay="0ms">
						<div>
							<h1>CEO 인사말</h1>
							<h2>도전하고 또 도전하여 새로운 성장의 길을 개척하는 것이 우리의 사명입니다.</h2>
							<p>Daum은 창의적인 업무 환경, 일과 삶의 균형, 지역 상생 발전을 위한 본사 이전 프로젝트를 성공적으로
								완료하고 ‘즐거운 실험’을 넘어 ‘즐거운 정착’의 새로운 제주 시대를 열어가고 있습니다. 또, 변화의 속도가 점점
								빨라지는 지금, 더 나은 세상을 위해 무엇을 할 수 있을까를 항상 고민하며 기업의 사회적 책무를 다하면서 함께
								성장하는 지속가능한 세상을 만들기 위한 다양한 활동을 펼치고 있습니다.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--/.container-->
	</section>
	<!--/#ceo-introduction-info-->


	<%@include file="../common_sitemap.jsp"%>
	<%@include file="../common_footer.jsp"%>
	<script src="/resources/bootstrap/js/jquery.js"></script>
	<script src="/resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="/resources/bootstrap/js/jquery.prettyPhoto.js"></script>
	<script src="/resources/bootstrap/js/jquery.isotope.min.js"></script>
	<script src="/resources/bootstrap/js/main.js"></script>
	<script src="/resources/bootstrap/js/wow.min.js"></script>

	<script>
	jQuery(document).ready(function($) {
		$('#menu_company').addClass("active");
	});
	</script>
</body>
</html>