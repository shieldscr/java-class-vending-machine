<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>AwesomeCo Vending Machine</title>
	<link href='http://fonts.googleapis.com/css?family=PT+Mono' rel='stylesheet' type='text/css'>
	<link href="css/vendingMachine.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="content">
		<div id="machineBody">
			<h1>AwesomeCo Snacks</h1>
			<div id="functions" class="clearfix">
				<div id="products">
					<div class="product" id="chips"><a href="product?product=CHIPS">Chips</a></div>
					<div class="product" coinid="candy"><a href="product?product=CANDY">Candy</a></div>
					<div class="product" id="cola"><a href="product?product=COLA">Cola</a></div>
					<div id="productBin"><c:out value="${machine.getProductChute()}" /></div>
				<div id="payment">
					<div id="display">
						<div id="line1"><c:out value="${machine.message}" /></div>
						<div id="line2">$<c:out value="${machine.balance}" /></div>
					</div>
					<div id="coinslot">
						<form name="coinslotform" method="post" action="insertcoin">
							<input name="coin" type="text" size="12" maxlength="12">
						</form>
						<div id="returnCoin">Return</div>
					</div>
					<div id="return"></div>
				</div>
			</div>	
		</div>
	</div>
</body>
</html>