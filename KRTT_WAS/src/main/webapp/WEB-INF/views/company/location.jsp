<!DOCTYPE html>
<html lang="en">
<head>
<%@include file="../common_config.jsp"%><!--/.configurations (imports files, links files) -->
</head>
<!--/head-->
<body class="homepage">

	<%@include file="../common_header.jsp"%><!--/.header(menu) -->

 	<section>
        <div class="center">                
            <h2>How to Reach Us?</h2>
            <p class="lead">제품의 연구개발/생산은 한국에서 이루어지며, 각 판매처의 지사를 통하여 제품을 판매합니다.</p>
        </div>
        <div class="gmap-area">
            <div class="container">
                <div class="row">
                    <div class="col-sm-5 text-center">
                        <div class="gmap">
                            <iframe frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=JoomShaper,+Dhaka,+Dhaka+Division,+Bangladesh&amp;aq=0&amp;oq=joomshaper&amp;sll=37.0625,-95.677068&amp;sspn=42.766543,80.332031&amp;ie=UTF8&amp;hq=JoomShaper,&amp;hnear=Dhaka,+Dhaka+Division,+Bangladesh&amp;ll=23.73854,90.385504&amp;spn=0.001515,0.002452&amp;t=m&amp;z=14&amp;iwloc=A&amp;cid=1073661719450182870&amp;output=embed"></iframe>
                        </div>
                    </div>

                    <div class="col-sm-7 map-content">
                        <ul class="row">
                            <li class="col-sm-6">
                                <address>
                                    <h5>한국 지사</h5>
                                    <p>경기도 시흥시 큰솔로22번길 9-1, 102<br>
                                    (정왕동 1404-7), 대한민국</p>
                                    <p>Phone : 010-2909-3855<br>
                                    Email : ebaek2020@gmail.com</p>
                                </address>

                                <address>
                                    <h5>상해 지사</h5>
                                    <p>1537 Flint Street <br>
                                    Tumon, MP 96911</p>                                
                                    <p>Phone : 010-2909-3855<br>
                                    Email : ebaek2020@gmail.com</p>
                                </address>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </section>  <!--/gmap_area -->

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