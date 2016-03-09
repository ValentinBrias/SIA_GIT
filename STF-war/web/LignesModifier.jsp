<%-- 
    Document   : Lignes_Modifier
    Created on : 7 mars 2016, 16:56:18
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
        <jsp:useBean id="listegares" scope="request" class="java.util.List"></jsp:useBean>
        <jsp:useBean id="Ligne" scope="request" class="Ligne"></jsp:useBean>
        <title>Lignes</title>
    </head>
    <body>
        <%@ include file="Navigation.jsp" %>
        <h1 id="h1">Lignes > Modifier</h1>
        <br><br>
        <form method="get" action="Servlet_STF">
            <TABLE id="TableModif">
                <tr id="allTr">
                    <th></th><th>Données actuelles</th><th>Nouvelles données</th>
                </tr>
                <tr>
                    <td>Numéro</td><td><%=Ligne.getNumLigne()%></td><td><input type="text" name="numLigne" placeholder='nouveau numéro'/></td>
                </tr>
                <tr>
                    <td>Gare départ</td><td><%=Ligne.getGareDepart().getNomGare()%></td><td><input type="text" name="gareDepart" placeholder='nouvelle gare de départ'/></td>
                </tr>
                <tr>
                    <td>Gare arrivée</td><td><%=Ligne.getGareArrivee().getNomGare()%></td><td><input type="text" name="prixloc" placeholder='nouvelle gare de départ'/></td>
                </tr>
                <tr><!--Liste des gares liés à la ligne-->
                    <% List<Gare> lesGares = Ligne.getLesGares();%>
                    <td>Gares</td><td><%for (Gare g : lesGares) {%><%=g.getNomGare()%><br><%}%></td> 
                    <td>Nouvelle lignes : *<br>
                        <%List<Gare> toutesgares = listegares;
                        for (Gare g : toutesgares) {%>
                        <!--Checkbox pour toutes les gares dispos-->
                        <input type="checkbox" name="gares" value="<%=g.getId()%>"/><%=g.getNomGare()%><br> 
                        <%}%>
                        </td>
                </tr>
            </TABLE>
            <br>
            
            <div class="text">
                * Si aucune ligne n'est sélectionnée, les lignes ne seront pas modifiés.<br>
                Si au moins 1 ligne est sélectionnée, les anciennes lignes seront remplacées.
            </div>
            
            <br><br>
            
            
            <!-- Bouton Enregistrer -->
            <div class ="btn_gauche">
                <input type="hidden" name="idligne" value="<%=Ligne.getId()%>"/>
                <input type="hidden" name="action" value="ModifierLigne"/>
                <input type="submit" value="Enregistrer"/>
            </div>
        </form>
                
    </body>
    
</html>
