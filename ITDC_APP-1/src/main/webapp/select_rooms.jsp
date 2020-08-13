    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
<body style = "background: url(https://images.unsplash.com/photo-1445991842772-097fea258e7b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80)">


           <form action="PayBill">
                
                    <tr>
                        <th>Registered Phone No</th>
                        <td><input type="number" name="userphno" id="userphno" required></td><br>
                    </tr>
                    <tr>
                        <th>How Many Rooms You Want?</th>
                        <td><input type="number" name="wrooms" id="wrooms" required></td><br>
                    </tr>
                    <tr>
                        <th>How Many Days You Want?</th>
                        <td><input type="number" name="days" id="days" required></td><br>
                    </tr>
                    <tr>
                        <th>From Date</th>
                        <td><input type="date" name="fdate" id="fdate" required></td><br>
                    </tr>
                    <tr>
                        <th>End Date</th>
                        <td><input type="date" name="edate" id="edate" required></td><br>
                    </tr>
                    <tr>
                        <th></th>
                        <td><button>PayBill</button></td>
                    </tr>
                </table>
            </form>


</body>
</center>
</html>




