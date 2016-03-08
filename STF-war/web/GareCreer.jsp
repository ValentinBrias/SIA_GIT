<%-- 
    Document   : GareCreer
    Created on : 8 mars 2016, 14:12:32
    Author     : 3092790
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Creation gares</h1>
        <form method="get" action="Servlet_STF">
            
                <legend> Création d'une gare </legend>
                    <TABLE>
                        <tr>
                            <td Width=100px><label for="nom">Nom <span class="requis">*</span></label></td>
                            <td Width=200px><input type="text" name="nom" value="" size="50" maxlength="20" /></td>
                        </tr>
                        <tr>
                            <td Width=100px><label for="adresse">Adresse <span class="requis">*</span></label></td>
                            <td Width=200px><input type="text" name="adresse" value="" size="50" maxlength="20" /></td>
                        </tr>
                    </TABLE>

                <br/>

                <input type="hidden" name="action" value="GareAjouter">

                <input type="submit" value="Valider"/>
                <input type="reset" value="Remettre à zéro"/>
                <br/>
        </form>
    </body>
</html>
