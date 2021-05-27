

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Venue Booking</title>

        <style type="text/css">
            .container{
                display:grid ;
                /*grid-template-columns: 2fr auto;*/
                grid-template-columns: 350px 350px;
                justify-content: center;
                background-color: #7b6fc2;
               
                

                    
            }
            /* Split the screen in half */
            .split {
                            
                height: 100%;
                /*width: 50%;*/
                /*position: fixed;*/
                /*z-index: 1;*/
                /*top: 0;*/
                /*overflow-x: hidden;*/
                padding-top: 20px;
                padding-bottom: 20px;
                justify-content: center;
                align-items: center;
              
            }
            .left {
                grid-column: 1 / 2;
                grid-row: 1;
            }
            .right{
                grid-column: 2 / 2;
                grid-row: 1;
            }
            /* Control the left side */
/*            .left {
                left: 0;
                margin: 5px;
                padding-left: 300px;
                background-color: #7b6fc2;
                bottom-margin:5px;
                

            }

             Control the right side 
            .right {
                right: 0;
                margin: 5px;
                padding-right: 0px;
                background-color: #7b6fc2;
                bottom-margin:5px;
            }*/

            
            button {
                background-color: black; /* Green */
                border: none;
                color: white;
                padding: 5px 15px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 15px;
                border: 3px solid blue;
                border-radius: 4px;
                height: 35px;
            }

            label
            {
                color:white;

            }

            input{

                border: 3px solid blue;
                border-radius: 4px;
            }

            select
            {
                border: 3px solid blue;
                border-radius: 4px;
            }


            input[type= radio]
            {
                border: 3px solid blue;
                border-radius: 4px;
            }

            textarea{
                border: 3px solid blue;
                border-radius: 4px;
            }


        </style>
    </head>
    <body>
        <div class="container">
        <div class="split left">


            <form>
                <label for="fname"><b>First Name</b></label><br>
                <input type="text" id="fname" name="fname"><br><br>
                <label for="lname"><b>Last Name</label></b><br>
                <input type="text" id="lname" name="lname"><br><br>
                <label for="email"><b>Email</b></label><br>
                <input type="email" id="email" name="email"><br><br>
                <label for="mobile"><b>Mobile No</b></label><br>
                <input type="mobile" id="mobile" name="mobile"><br><br>

                <label for="Gender"><b>Select Gender</b></label><br>
                <input type="radio" id="male" name="gender" value="male">
                <label for="male">Male</label><br>
                <input type="radio" id="female" name="gender" value="female">
                <label for="female">Female</label><br>


                <div>
                    <br>
                    <label for="Food options"><b>Food Options</b></label><br>
                    <input type="checkbox" id="Vegetarian Meal" name="Vegetarian Meal" value="Vegetarian Meal">
                    <label for="vehicle1"> Vegetarian Meal</label><br>
                    <input type="checkbox" id="Non Vegetarian Meal" name="Non Vegetarian Meal" value="Non Vegetarian Meal">
                    <label for="Non Vegetarian Meal"> Non Vegetarian Meal</label><br>
                    <input type="checkbox" id="Chinese" name="Chinese" value="Chinese">
                    <label for="Chinese"> Chinese</label><br>
                    <input type="checkbox" id="Other" name="Other" value="Other">
                    <label for="Other">Other Meal</label> <br><br>
                    <textarea name="message" rows="04" cols="18">Food Options</textarea><br>
                </div>

                <div><br>
                    <label for="Event"><b>Select Event</b></label><br>
                    <input type="radio" id="male" name="gender" value="male">
                    <label for="male">Birthday</label><br>
                    <input type="radio" id="female" name="gender" value="female">
                    <label for="female">Marriage</label><br>
                    <input type="radio" id="Engagement" name="gender" value="other">
                    <label for="other">Engagement</label><br>
                    <input type="radio" id="other" name="gender" value="other">
                    <label for="other">Other</label><br><br><br>

                    <button type="submit" formaction="Bill.jsp">Register Venue </button>
                </div>
        </div>
        <div class="split right">
            <label for="cars"><b>Select Location</b></label>
            <select name="Location" id="Locations">
                <optgroup label="Pune Locations">
                    <option value="Greenpark">Greenpark (Katraj) </option>
                    <option value="Richard">Richard Banquet (Baner)</option>
                </optgroup>
                <optgroup label="Mumbai Locations">
                    <option value="St.Merry">St.Merry (Andheri)</option>
                    <option value="GreenField">GreenField (Thane)</option>

                <optgroup label="Raigad Locations">
                    <option value="Butala Hall">Butala Hall (Mahad)</option>
                    <option value="Hilltop Hall">Hilltop Hall (Roha)</option>
                </optgroup>
            </select><br><br><br>
            <label for="quantity"><b>People Count(35 to 500)</b></label>
            <input type="number" id="quantity" name="quantity" min="35" max="500"><br><br><br>

            <label for="Date"><b>Select Date</b></label>
            <input type="date" id="Select Date" name="Select Date"><br><br><br>

            <label for="appt"><b>Select Event Timing Slot</b></label><br><br>
            <label for="appt"><b> From</b> </label> <input type="time" id="appt" name="appt"> <label for="appt"><b> To </b> </label><input type="time" id="appt" name="appt"><br><br>

            <label for="Decoration"><b>Extra Decoration & Stuff</b></label><br>
            <input type="checkbox" id="Flowers" name="Flowers" value="Flowers">
            <label for="Flowers"> Flowers</label><br>
            <input type="checkbox" id="Balloons" name="Balloons" value="Balloons">
            <label for="Balloons"> Balloons</label><br>
            <input type="checkbox" id=Chairs name="Chairs" value="Chairs">
            <label for="Chairs"> Chairs</label><br>
            <input type="checkbox" id=Bhatji name="Bhatji" value="Bhatji">
            <label for="Bhatji"> Bhatji</label><br><br>
            <label for="Suggestions">Any Suggestions</label> <br><br>
            <textarea name="message" rows="04" cols="20">Suggestions</textarea><br><br>

            <label for="Payment"><b>Payment</b></label><br><br>


            <input type="radio" id="Cash on Event" name="gender" value="Cash on Event">
            <label for="Payment">Cash on Event </label><br> 

            <input type="radio" id="Card Payment" name="gender" value="Card Payment">
            <label for="male">Card Payment</label><br>

            <input type="radio" id="Other" name="gender" value="Other">
            <label for="male">Other(Google Pay, PayTM)</label><br><br><br><br>  


            <button type="submit" formaction="Home.jsp">Cancel</button>


        </div>
</div>
    </body>
</html>
