<%-- 
    Document   : Lignes
    Created on : 7 mars 2016, 15:51:24
    Author     : 3099709
--%>

<%@page import="package_entite.Gare"%>
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
        
        <!-- Méthode de la recherche d'une ligne -->
        <div class ="text">
            
            <form method="get" action="Servlet_STF"> 
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
        
        <br>
        <!-- Affichage de la liste de toutes les lignes -->
        <TABLE id="tableAffich">
            <tr id="trTitre">
                <th>Numéro de ligne</th>
                <th>Départ</th>
                <th>Arrivée</th>
                <th>Listes gares</th>
                <th>Nombre de gares</th>
                <th>Fiche horaire</th>
                <th>Fiche tarifaire</th>
                <th>Sélectionner</th>
            </tr>
            <%
                List<Ligne> lesLig=listelignes;
                for(Ligne a:lesLig){
                List <Gare> lesGa = a.getLesGares();
            %>
                <tr id="trContenu">
                    <td Width=5%><%=a.getNumLigne()%></td>
                    <td Width=15%><%=a.getGareDepart().getNomGare()%></td>
                    <td Width=10%><%=a.getGareArrivee().getNomGare()%></td>
                    <td id="tdList" Width=10%><%for(Gare g:lesGa){%><li><%=g.getNomGare()%><br><%}%></li></td>
                    <td Width=10%><%=lesGa.size()%></td>
                    <td Width=10%><a class="aFiche" href="Servlet_STF?IdLigne=<%=a.getId()%>&action=LigneHoraire">Fiche horaire</a></td>
                    <td Width=10%><a class="aFiche" href="Servlet_STF?IdLigne=<%=a.getId()%>&action=LigneTarif">Fiche tarifaire</a></td>
                    <td Width=15%> 
                        <a href="Servlet_STF?IdLigne=<%=a.getId()%>&action=LigneModification"><button class="btn_ModSup">Modifier</button></a>
                        <a href="Servlet_STF?IdLigne=<%=a.getId()%>&action=LigneSuppression"><button class="btn_ModSup">Supprimer</button></a>
                    </td>
                </tr><%}%>
        </TABLE>
        
        <!-- Bouton ajouter -->
        <a href="Servlet_STF?action=LigneAjouter"><button id="btn_gauche">Ajouter une ligne</button></a>

    </body>
</html>
