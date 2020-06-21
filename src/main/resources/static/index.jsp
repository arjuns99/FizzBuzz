<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="/lib/bootstrap/3.3.5/css/bootstrap.min.css?v=3.3.5">
<link rel="stylesheet"
	href="/lib/bootstrap/3.3.5/css/bootstrap-theme.min.css?v=3.3.5">
<script src="/lib/jquery/2.1.4/jquery.min.js?v=2.1.4"></script>
<script
	src="/lib/datatables/1.10.8/media/js/jquery.dataTables.min.js?v=1.10.8"></script>
<script
	src="/lib/datatables/1.10.8/media/js/dataTables.bootstrap.min.js?1.10.8"></script>
<link rel="stylesheet"
	href="/lib/datatables/1.10.8/media/css/dataTables.bootstrap.min.css?1.10.8"></link>

<style type="text/css">
body {
	margin-top: 37px;
	text-align: center;
}

.fizz{
color:blue;
}
.buzz{
color:green;
}
</style>

</head>
<body>
	<div id="assetFormDiv" class="panel panel panel-default">

		<div class="panel-heading">Fizz Buzz</div>

		<div class="panel-body">
			<div class="form-horizontal">
				<input name="numfuzz" id="numfuzz" placeholder="Enter Number:" />
				<button id="btnfuzz" class="btn">button</button>
			</div>
			<br/>
			<p id="msg"></p>
			<br/>
			<div>
				<table id="fizztable"
					class="table table-hover table-bordered results">
					<thead>
						<tr>
							<th>#</th>
						</tr>
					</thead>
					<tbody id="fizzBody">
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<script src="/js/fizzbuzz.js"></script>
</body>
</html>
