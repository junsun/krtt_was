<!DOCTYPE html>
<html lang="en">
<head>
	<%@include file="common_config.jsp"%>
</head><!--/head-->
<body class="homepage">

	<%@include file="common_header.jsp"%><!--/.header(menu) -->

	<section id="main-slider" class="no-margin">
		<div class="carousel slide">
			<div class="carousel-inner">

				<div class="item active"
					style="background-image: url(/resources/bootstrap/images/slider/bg1.jpg)">
					<div class="container">
						<div class="row slide-margin">
							<div class="col-sm-6">
								<div class="carousel-content">
									<h1 class="animation animated-item-1">(주)더바이오그룹은</h1>
									<h1 class="animation animated-item-2">대한민국 저온 발효과학의 대표
										브랜드입니다</h1>
									<h2 class="animation animated-item-3">
										이로운 균을 빌려주고 배양하는 발표기술<br>생리활성물질을 만들어내는 비법
									</h2>
								</div>
							</div>

							<div class="col-sm-6 hidden-xs animation animated-item-4">
								<div class="slider-img">
									<img src="/resources/bootstrap/images/slider/img1.png"
										class="img-responsive">
								</div>
							</div>

						</div>
					</div>
				</div>
				<!--/.item-->
				
			</div>
		</div>
	</section>
	<!--/#conatcat-info-->

	<%@include file="common_sitemap.jsp"%>
	<%@include file="common_footer.jsp"%>
    <script src="/resources/bootstrap/js/jquery.js"></script>
    <script src="/resources/bootstrap/js/bootstrap.min.js"></script>
    <script src="/resources/bootstrap/js/jquery.prettyPhoto.js"></script>
    <script src="/resources/bootstrap/js/jquery.isotope.min.js"></script>
    <script src="/resources/bootstrap/js/main.js"></script>
    <script src="/resources/bootstrap/js/wow.min.js"></script>
   
	<script>
	jQuery(document).ready(function($) {
		//$('#menu_company').addClass("active");
	});
	</script>
</body>
</html>