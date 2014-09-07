<!DOCTYPE html>
<html lang="en">
<head>
<%@include file="../common_config.jsp"%><!--/.configurations (imports files, links files) -->
</head>
<!--/head-->
<body class="homepage">

	<%@include file="../common_header.jsp"%><!--/.header(menu) -->


	<section id="about-us">
		<div class="container">
			<!-- our-team -->
			<div class="team clearfix">
				<div class="center wow fadeInDown" style="margin-top: 20px"
					data-wow-duration="1000ms" data-wow-delay="0ms">

					<div>
						<div style="display: inline-block; width: 50%">
							<img src="/resources/bootstrap/images/vision.png" alt="team">
						</div>
						<div style="display: inline-block; width: 35%; vertical-align:middle; margin-left: 7%">
							<h3>도전, 노력 우리의 사명입니다.</h3>
							<p class="lead" >Daum은 온라인 미디어 환경 변화에 발맞춰서 우리의 생활을 변화시키는 새로운 기회와 즐거움을 드리기 위해 많은 노력을 기울였습니다
							계속해서 노력할 것입니다. </p>
							<p class="lead">자신이 네이버(주)의 얼굴이라는 책임감으로 매사에 임하며 공적으로나 사적으로 항상 겸손한 자세를 유지합니다.</p>
							<p class="lead">고객에게 최고의 가치와 만족을 창출하기 위하여 현재에 만족하지 않고 항상 창의적이며 혁신적인 사고로 업무에 임합니다.</p>
						</div>
					</div>
				</div>

				<!--/.row-->
			</div>
			<!--section-->
		</div>
		<!--/.container-->
	</section>
	<!--/#partner-->


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