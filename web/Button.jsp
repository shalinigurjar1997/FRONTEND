 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Employee</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

        <!--  JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <script>
            emps = new Array();
            index = 0;
            function saveData() {
                if(nm.value.trim().length==0 || empid.value.trim().length==0 || Dept.value.trim().length==0 || Eid.value.trim().length==0 || Doj.value.trim().length==0)
                {
                    alert('Please fill all required field');
                    return;
                }
                emps[index++] = {"name": nm.value, "empid": empid.value, "Dept":Dept.value, "Eid":Eid.value, "Doj":Doj.value};
                //alert('data saved');
                showData();
                 $("#myModal").modal('hide');
            }
            function showData() {
                //alert('datat is shwoing ');
                 document.getElementById("table1").innerHTML="<tr><td></td><td>Name</td><td>Employee id</td><td>Department</td><td>Email</td><td>Date of joining</td></tr>";
                for (var x = 0; x < emps.length; x++)
                {
                   $("#table1").append("<tr><td><input type='Button' class='btn btn-danger' onclick='remove("+x+");' value='X'></td><td>"+ emps[x].name +"</td><td>" +emps[x].empid +"</td>+<td>" +emps[x].Dept +"</td><td>" +emps[x].Eid +"</td><td>" +emps[x].Doj +"</td></tr>");
                     
                }
            }
            
            function remove(x){
               // alert(x);
                 emps.splice(x, 1);
                 showData();    
            }

            function clearData(){
                nm.value="";
                empid.value="";
                Dept.value="";
                Eid.value="";
                Doj.value="";
}

        </script>

    </head>
    <body>
        <div class="container"><br>
            <!-- Trigger the modal with a button -->
            <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal" onclick="clearData();">New Employee</button>
            <br/><br/>.
            <div id ="div1">
                <table class="table table-striped" id = "table1">
                     <tr><td></td><td>Name</td><td>Employee id</td><td>Department</td><td>Email id</td><td>Date of Joining</td></tr>
                </table>
            </div>
            <!-- Modal -->
            <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title"> New Employee</h4>

                        </div>
                        
                            <div class="modal-body">

                                <tr>
                                    <td> Name:</td>
                                    <th><input type="text" class="form-control" required id="nm"><br></th>
                                </tr>
                                <tr>
                                    <td> Employee ID:</td>
                                    <th><input type="text" class="form-control" required id="empid"><br></th>
                                </tr>
                                <tr>
                                    <td> Department</td>
                                    <th><select id="Dept">
                                            <option value="" selected disabled="disabled">Select any department</option>      
                                            <option value="Finance">Finance</option>
                                            <option value="Information Technology">Information Technology</option>
                                            <option value="Human resource">Human Resource</option>
                                            <option value="Sales" >Sales </option>
                                            <option value="Research & Development">R & D</option>
                                        </select></th>
                                <br><br></tr>
                                <tr>
                                    <td> Email ID:</td>
                                    <th><input type="text" class="form-control" required id="Eid"><br></th>
                                </tr>
                                <tr>
                                    <td> Date of joining:</td>
                                    <th><input type="date" name="doj" required id="Doj"> <br><br></th>
                                </tr>
                                <button type="reset" class="btn btn-danger" onclick="clearData()">Clear Data</button>

                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-primary" onclick="saveData();">Submit</button>
                            </div>
                         
                    </div>
                </div>
            </div>
        </div>



    </body>
</html>
