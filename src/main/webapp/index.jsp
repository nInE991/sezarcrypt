<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap-theme.css" rel="stylesheet">
        <title>Rot with key</title>
    </head>
    <body>
        <div class="container" style="width: 400px; height: 200px; margin: auto; position: initial; top: 0; left: 0; bottom: 0; right: 0;">
            <center><h2 class="" style="">Rotation Encryption with Key</h2></center>
                <form action="Servlet" method="post" class="form-signin" id="">
                    <input type="text" class="form-control" name="text" value="${text}" placeholder="Text">
                    <hr>
                    
                    <input type ="text" class="form-control" name="ztext" value = "${ztext}" placeholder="Encrypted text" blocked>
                    <hr>
                    <input type ="submit" class="btn btn-default form-control" name = "encrypt" value = "Encrypt"/>
                    <input type ="submit" class="btn btn-default form-control" name ="decrypt" value="Decrypt"/>
                    <input type ="submit" class="btn btn-default form-control" name ="clear" value="Clear"/>
                </form>
        </div>
    </body>
</html>