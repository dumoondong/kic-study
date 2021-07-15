<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/base/jquery-ui.css" />
<style type="text/css">
	/* 사용자 정의 CSS */
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		$('#accordion').accordion({
			collapsible: true
		});
		
		$('#btn1').button().on('click',function(){
			let html = '';
			html+='<h3>Section 1</h3>';
			html+='<div>';
			html+= '<p>Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integerut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sitamet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo utodio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate.</p>';
			html+='</div>';
			
			$('#accordion').append(html);
			$('#accordion').accordion('refresh');
		});
	});

</script>
</head>
<body>
<button id="btn1">데이터 추가</button>
<br /><hr /><br />
<div id="accordion">
  <h3>Section 1</h3>
  <div>
	<p>Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integerut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sitamet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo utodio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate.</p>
  </div>
  <h3>Section 2</h3>
  <div>
    <p>Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit ametpurus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitorvelit, faucibus interdum tellus libero ac justo. Vivamus non quam. Insuscipit faucibus urna.</p>
  </div>
  <h3>Section 3</h3>
  <div>
    <p>Nam enim risus, molestie et, porta ac, aliquam ac, risus. Quisque lobortis.Phasellus pellentesque purus in massa. Aenean in pede. Phasellus ac liberoac tellus pellentesque semper. Sed ac felis. Sed commodo, magna quislacinia ornare, quam ante aliquam nisi, eu iaculis leo purus venenatis dui.</p>
    <ul>
      <li>List item one</li>
      <li>List item two</li>
      <li>List item three</li>
    </ul>
  </div>
  <h3>Section 4</h3>
  <div>
    <p>Cras dictum. Pellentesque habitant morbi tristique senectus et netuset malesuada fames ac turpis egestas. Vestibulum ante ipsum primis infaucibus orci luctus et ultrices posuere cubilia Curae; Aenean laciniamauris vel est.</p>
    <p>Suspendisse eu nisl. Nullam ut libero. Integer dignissim consequat lectus.Class aptent taciti sociosqu ad litora torquent per conubia nostra, perinceptos himenaeos.</p>
  </div>
</div>
</body>
</html>