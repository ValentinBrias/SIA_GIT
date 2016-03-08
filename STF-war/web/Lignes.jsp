<%-- 
    Document   : Lignes
    Created on : 7 mars 2016, 15:51:24
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
        <ul id="navigation">
            <li><a href="MenuPrincipal.jsp">Page d'accueil</a></li>
            <li><a href="Lignes.jsp">Lignes</a></li>
            <li><a href="Gares.jsp">Gares</a></li>
            <li><a href="Abonnements.jsp">Abonnements</a></li>
        </ul>
        <br><br>
        <h1>Lignes</h1>
        <br><br>
        Sélectionner une ligne <input type="text" placeholder="Rechercher une ligne" /> <input type="submit" value="Chercher"/><input type="hidden" name="action" value="DefileRechercher">


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
        
        <div class ="lignesbtn_ajouter">
        <input type="submit" value="Ajouter"/><input type="hidden" name="action" value="LigneAjouter">
        </div>
        <div class ="test">
        <button><a href="Lignes_Modifier.jsp">Modifier ligne</a></button>
        </div>
        <div class ="lignesbtn">
            <input type="submit" value="Modifier"/><input type="hidden" name="action" value="test">
            <br>
            <input type="submit" value="Supprimer"/><input type="hidden" name="action" value="toast">
        </div>
    </body>
</html>
