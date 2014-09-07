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
				<div class="center wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms">
					<h2>Organization chart</h2>
					<p class="lead">
						더욱 나은 기술을 위한 조직문화, 고객에게 최적화된 서비스를 제공하기 위한 조직문화를
						(주)더바이오그룹이 만들어갑니다.
					</p>
				</div>

				<div class="center wow fadeInDown" style="margin-top: 20px" data-wow-duration="1000ms" data-wow-delay="1000ms">
					<img src="/resources/bootstrap/images/team.png" alt="team">
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