<%-- 
    Document   : Tarifaire
    Created on : 10 mars 2016, 12:16:23
    Author     : 3099709
--%>

<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="package_entite.Prix_Kilometre"%>
<%@page import="package_entite.DistanceGare"%>
<%@page import="package_entite.Gare"%>
<%@page import="package_entite.Ligne"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <jsp:useBean id="ligne" scope="request" class="Ligne"></jsp:useBean>
        <title>Fiche tarifaire</title>
    </head>
    <body>
        
        <!-- Inclusion du menu par la jsp Navigation -->
        <%@ include file="Navigation.jsp" %>

        <h1 id="h1">Fiche tarifaire</h1>
        <br><br>
        
        <!-- Méthode de la recherche d'une ligne -->
        <div class ="text">
            <%
                String attribut = (String) request.getAttribute("message");
                out.println(attribut);
            %>
        </div>
        
        <br><br>
        
        <!-- Affichage de la liste de toutes les lignes -->
        <TABLE id="tableTarif">

            <tr id="allTr">
                <th><%=ligne.getGareDepart().getNomGare()%></th>
                <th>Distance</th>
                <th>Tarif</th>
            </tr>
            <%
                List<Gare> lesGares = ligne.getLesGares();
                Prix_Kilometre p = new Prix_Kilometre();
                for (Gare g : lesGares) {
                    List<DistanceGare> lesDistances = g.getLesDistanceGares();
            %>
            <tr>
                <td width="10%"><%=g.getNomGare()%></td>
                <td width="10%"><%=lesDistances.get(0).getDistanceGare()%> km</td>
                <td width="10%"><%=lesDistances.get(0).getDistanceGare() * p.getPrixKilometre()%> €</td>
            </tr><%}%>
        </TABLE>
        
    </body>
</html>
