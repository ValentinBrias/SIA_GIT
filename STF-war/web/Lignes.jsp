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
        <jsp:useBean id="listelignes" scope="request" class="java.util.List"></jsp:useBean>
        <title>Lignes</title>
    </head>
    <body>
        
        <!-- Inclusion du menu par la jsp Navigation -->
        <%@ include file="Navigation.jsp" %>

        <h1 id="h1">Lignes</h1>
        <br><br>
        
        <!-- Méthode de la recherche d'une ligne -->
        <div class ="lignestext">
            
            <form method="get" action="Servlet_STF">
                Sélectionner une ligne 
                <input type="text" name="NumLigne" placeholder="Rechercher une ligne" /> 
                <input type="hidden" name="action" value="RechercherLigne">
                <input type="submit" value="Rechercher"/>
                <a href="Servlet_STF?&action=LigneRafraichir"> <img id='boutonRafraichir' src='image/LogoRafraichir.png' alt='Rafraichir le tableau'></a>
                    <%
                        String attribut = (String) request.getAttribute("message");
                        out.println(attribut);
                    %>
            </form>
        </div>
        
        <br><br>
        
        
        <!-- Affichage de la liste de toutes les lignes -->
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
                    <td Width=10%><a href="Servlet_STF?IdLigne=<%=a.getId()%>&action=LigneHoraire">Fiche horaire</a></td>
                    <td Width=10%><a href="Servlet_STF?IdLigne=<%=a.getId()%>&action=LigneTarif">Fiche tarifaire</a></td>
                    <td id="ligneTDModifier" Width=10%><button> <a href="Servlet_STF?IdLigne=<%=a.getId()%>&action=LigneModification">Modifier</a></button>
                    <button> <a href="Servlet_STF?IdLigne=<%=a.getId()%>&action=LigneSuppression">Supprimer</a></button></td>
                </tr><%}%>
        </TABLE>
        
        <!-- Bouton ajouter une ligne -->
        <div class ="lignesbtn_ajouter">
        <input type="submit" value="Ajouter"/><input type="hidden" name="action" value="LigneAjouter">
        </div>
    </body>
</html>
