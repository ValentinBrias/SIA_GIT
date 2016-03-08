<%-- 
    Document   : LignesAjouter
    Created on : 8 mars 2016, 14:17:14
    Author     : 3099709
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:useBean id="listel
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" />
        <title>Lignes</title>
    </head>
    <body>
        <ul>
            <li><a href="MenuPrincipal.jsp">Page d'accueil</a></li>
            <li><a href="Lignes.jsp">Lignes</a></li>
            <li><a href="Gares.jsp">Gares</a></li>
            <li><a href="Abonnements.jsp">Abonnements</a></li>
        </ul>
        <br><br>
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
