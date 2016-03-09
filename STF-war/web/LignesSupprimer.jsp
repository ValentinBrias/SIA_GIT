<%-- 
    Document   : LignesSupprimer
    Created on : 8 mars 2016, 14:09:54
    Author     : 3099709
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" />
        <title>Lignes</title>
    </head>
    <body>
        <%@ include file="Navigation.jsp" %>
        <h1 id="h1">Lignes > Supprimer</h1>
        <br><br>
        <div class="lignesbody">Etes-vous sûr de vouloir supprimer la ligne sélectionnée ?</div>
        <form method="get" action="Servlet_STF">
            <br><br>
        <TABLE align='center' border="solid black" width="80%" CELLSPACING=0 CELLPADDING=5>
            <tr BGCOLOR="#C0C0C0">
                <th>Identifiant lignes</th>
                <th>Départ</th>
                <th>Arrivée</th>
                <th>Nombre d'arrêts</th>
                <th>Fiche horaire</th>
                <th>Fiche tarifaire</th>
                <th>Sélectionner</th>
            </tr>
        </TABLE>
        <br>
        <br>
        <div class ="lignesbtn">
            <input type="submit" value="Valider"/><input type="hidden" name="action" value="Valider">
            <br>
            <input type="submit" value="Annuler"/><input type="hidden" name="action" value="Annuler">
        </div>
    </body>
</html>
