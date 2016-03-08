<%-- 
    Document   : LignesAjouter
    Created on : 8 mars 2016, 14:17:14
    Author     : 3099709
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ligne</title>
        <link rel="stylesheet" href="css/style.css" />
    </head>
    <body>   
        <%@ include file="Navigation.jsp" %>
        <h1>Lignes > Ajouter</h1>
        <br><br>
        <form method="get" action="Servlet_STF">
            Identifiant : <input type="text" placeholder="Identifiant" />
            Départ : <input type="text" placeholder="Gare de départ" />
            Arrivée : <input type="text" placeholder="Gare d'arrivée" />
            
        </form>
            <br>
            <br>
            <div class ="lignesbtn">
                <input type="submit" value="Ajouter"/><input type="hidden" name="action" value="Enregistrer">
            </div>
        </form>
    </body>
</html>
