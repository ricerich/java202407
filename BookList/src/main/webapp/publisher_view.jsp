<%@ page import="java.sql.*" contentType="text/html;charset=UTF-8"%>
<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1522:xe";
	Connection dbconn = DriverManager.getConnection(url, "c##madang", "c##madang");
	Statement stmt = dbconn.createStatement();
	String publisher = request.getParameter("publisher");
	ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK WHERE publisher like '" + publisher + "'");
	if (rs != null) {
		//rs.next();
%>
<html>

<head>
<meta http-equiv="content-type" content="text/html; charset=EUC-KR">
<title>** BOOK VIEW **</title>
</head>

<body bgcolor="white" text="black" link="blue" vlink="purple"
	alink="red">
	

	<table border="1" cellspacing="0" width="400" bordercolor="#9AD2F7"
		bordercolordark="white" bordercolorlight="#B9E0FA">
		<tr bgcolor="#D2E9F9">
			<td width="150" height="23">
				<p align="center">
					<span style="font-size: 9pt;"><b>책 제 목</b></span>
				</p>
			</td>
			<td width="150" height="23">
				<p align="center">
					<span style="font-size: 9pt;"><b>출 판 사</b></span>
				</p>
			</td>
			<td width="150" height="23">
				<p align="center">
					<span style="font-size: 9pt;"><b>가 격</b></span>
				</p>
			</td>
		</tr>
		
<%
	while(rs.next())
	{
%>
	<tr>
		<td width="150" height="23">
				<p align="center">
					<span style="font-size: 8pt;"><b><%= rs.getString("bookname") %></b></span>
				</p>
		</td>
		<td width="150" height="23">
			<p align="center">
				<span style="font-size: 8pt;"><b><%= rs.getString("publisher") %></b></span>
			</p>
		</td>
		<td width="150" height="23">
			<p align="center">
				<span style="font-size: 8pt;"><b><%= rs.getInt("price") %></b></span>
			</p>
		</td>
	</tr>
		
<%
	}
%>		
	</table>


	<table cellpadding="0" cellspacing="0" width="400" height="23">
		<tr>
			<td width="150">
				<p align="right">
					<span style="font-size: 9pt;"> <a href="booklist.jsp?">
							<font color="black">목록</font>
					</a></span>
				</p>
			</td>
		</tr>
	</table>
	<%
	}
	stmt.close();
	dbconn.close();
	%>
</body>
</html>