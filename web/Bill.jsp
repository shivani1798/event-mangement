

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
		

header { margin: 0 0 3em; }
header:after { clear: both; content: ""; display: table; }

header h1 { background: #000; border-radius: 0.25em; color: #FFF; margin: 0 0 1em; padding: 0.2em 0; }

#table-example-1 { 
  border: solid thin; 
  border-collapse: collapse; 
}
#table-example-1 caption { 
  padding-bottom: 0.5em; 
}
#table-example-1 th, 
#table-example-1 td { 
  border: solid thin;
  padding: 0.5rem 2rem;
}
#table-example-1 td {
  white-space: nowrap;
}
#table-example-1 th { 
  font-weight: normal; 
}
#table-example-1 td { 
  border-style: none solid; 
  vertical-align: top; 
}
#table-example-1 th { 
  padding: 0.2em; 
  vertical-align: middle; 
  text-align: center; 
}

#table-example-1 tbody td:first-child::after { 
  content: leader(". "); 
}

body {
  padding: 1rem;
}
  

	</style>

</head>
<body>
		<header>
			<center>
			<h1>Invoice</h1>
			</center>
			<address contenteditable>
				<p>Owner Name : Samiksha Bhagade<br>
				Office Add: 101 E. SB Events<br>Mahad, 402301-Raigad<br>
				Mob: 9878654107</p>
			</address>
		</header>

<table id="table-example-1">
 
   <thead><tr><th rowspan="2">Customer Details</th>
     <th rowspan="2"></th>

    </tr></thead><tbody><tr><td>Invoice NO </td>
     <td>
     	
     </td>
     
     </tr></thead><tbody><tr><td>Customer Name</td>
     <td></td>

<table id="table-example-1"><caption>Bill Details</caption>
 
   <thead><tr><th rowspan="2">Event Type</th>
     <th rowspan="2">Total People</th>
     
     <th rowspan="2">Extra Decoration & Stuff </th>
     <th rowspan="2">Total Amount</th>
    </tr><tr><th>Remark</th>
     
    </tr></thead><tbody><tr><td>Birthday</td>
     <td></td>
     <td></td>
     <td></td>
     <td></td>
     
     </tr></thead><tbody><tr><td>Marriage</td>
     <td></td>
     <td></td>
     <td></td>
     <td></td>

      </tr></thead><tbody><tr><td>Other Event</td>
     <td></td>
     <td></td>
     <td></td>
     <td></td>
       </tr></tbody></table><br></br>
      
         <button type="submit" formaction="Home.jsp">Do Payment</button>

    </body>
</html>
