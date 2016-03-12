<%-- 
    Document   : Navigation
    Created on : 8 mars 2016, 16:26:32
    Author     : 3099709
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" />
    </head>
    <body> 
            <img id="logoMenu" src='image/logo_STF.jpg' alt='Logo'>
        
        <ul id="navigation">
            <li><a id="active" href="MenuPrincipal.jsp">Page d'accueil</a></li>
            <li><a href="Servlet_STF?action=AfficherLignes">Lignes</a></li>
            <li><a href="Servlet_STF?action=AfficherGares">Gares</a></li>
            <li><a href="Servlet_STF?action=AfficherAbonnement">Abonnements</a></li>
        </ul>
        <br><br>
    </body>
</html>
