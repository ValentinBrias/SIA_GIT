<%-- 
    Document   : Lignes
    Created on : 7 mars 2016, 15:51:24
    Author     : 3099709
--%>

<%@page import="java.util.List"%>
<%@page import="package_entite.Ligne"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" />
        <jsp:useBean id="listelignes" scope="request" class="java.util.List"></jsp:useBean>
        <title>Lignes</title>
    </head>
    <body>
        <%@ include file="Navigation.jsp" %>
        <h1>Lignes</h1>
        <br><br>
        Sélectionner une ligne <input type="text" placeholder="Rechercher une ligne" /> <input type="submit" value="Chercher"/><input type="hidden" name="action" value="DefileRechercher">


        <br><br>
        <TABLE align='center' border="solid black" width="80%" CELLSPACING=0 CELLPADDING=5>
            <tr BGCOLOR="#C0C0C0">
                <th>Identifiant lignes</th>
                <th>Départ</th>
                <th>Arrivée</th>
                <th>Nombre de gares</th>
                <th>Fiche horaire</th>
                <th>Fiche tarifaire</th>
                <th>Sélectionner</th>
            </tr>
            <%
                List<Ligne> lesLig=listelignes;
                for(Ligne a:lesLig){%>
                <tr>
                    <td Width=5%><%=a.getId()%></td>
                    <td Width=15%><%=a.getGareDepart()%></td>
                    <td Width=10%><%=a.getGareArrivee()%></td>
                    <td Width=10%><%=a.getNbGare()%></td>
                    <td Width=10%><a href="">Fiche horaire</a></td>
                    <td Width=10%><a href="">Fiche tarifaire</a></td>
                    <td Width=10%><%=a.getId()%></td>
                </tr><%}%>
        </TABLE>
        
        <div class ="lignesbtn_ajouter">
        <input type="submit" value="Ajouter"/><input type="hidden" name="action" value="LigneAjouter">
        </div>
        <div class ="lignesbtn">
            <input type="submit" value="Modifier"/><input type="hidden" name="action" value="test">
            <br>
            <input type="submit" value="Supprimer"/><input type="hidden" name="action" value="toast">
        </div>
    </body>
</html>
