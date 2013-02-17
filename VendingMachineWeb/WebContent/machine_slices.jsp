<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>AwsomeCo Vending Machine</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link href='http://fonts.googleapis.com/css?family=PT+Mono' rel='stylesheet' type='text/css'>
<LINK href="css/vendingMachine.css" rel="stylesheet" type="text/css">

</head>
<body bgcolor="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<!-- Save for Web Slices (machine.psd) -->
<table width="500" height="757" border="0" align="center" cellpadding="0" cellspacing="0" id="Table_01">
	<tr>
		<td colspan="5">
			<img src="images/machine_01.png" width="500" height="425" alt=""></td>
	</tr>
	<tr>
		<td>
			<img src="/VendingMachineWeb/images/machine_02.png" width="46" height="122" alt=""></td>
		<td>
			<img src="images/machine_candy.png" width="123" height="122" alt=""></td>
		<td>
			<img src="images/machine_chips.png" width="133" height="122" alt=""></td>
		<td>
			<img src="images/machine_cola.png" width="119" height="122" alt=""></td>
		<td>
			<img src="images/machine_06.png" width="79" height="122" alt=""></td>
	</tr>
	<tr>
		<td colspan="4">
			<img src="images/machine_07.png" width="421" height="117" alt=""></td>
		<td>
			<img src="images/machine_08.png" width="79" height="117" alt=""></td>
	</tr>
	<tr>
		<td colspan="5">
			<img src="images/machine_09.png" width="500" height="93" alt=""></td>
	</tr>
</table>


<div id="display"> <c:out value="${machine.message}" /></div>


<div id="coinslot">
  <form name="coinslotform" method="post" action="insertcoin">
  <input name="coin" type="text" value="type a coin" size="12" maxlength="12">
  </form>
</div>

<!-- End Save for Web Slices -->
</body>
</html>