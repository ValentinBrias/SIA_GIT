<%-- 
    Document   : GareModifier
    Created on : 9 mars 2016, 10:38:12
    Author     : 3092790
--%>

<%@page import="package_entite.Ligne"%>
<%@page import="java.util.List"%>
<%@page import="package_entite.Gare"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="listelignes" scope="request" class="java.util.List"></jsp:useBean>
        <jsp:useBean id="gare" scope="request" class="Gare"></jsp:useBean>
            <title>Gare</title>
        </head>
        <body>
            
        <!-- Inclusion du menu par la jsp Navigation -->
        <%@ include file="Navigation.jsp" %>
        
        <h1 id="h1">Modifier gare</h1>
        
        <form method="get" action="Servlet_STF">
            <TABLE id="TableModif">
                <tr id="allTr">
                    <th></th><th>Données actuelles</th><th>Nouvelles données</th>
                </tr>
                <tr>
                    <td>Nom</td><td><%=gare.getNomGare()%></td><td><input type="text" name="nom" placeholder='nouveau nom'/></td>
                </tr>
                <tr>
                    <td>Adresse</td><td><%=gare.getAdresse()%></td><td><input type="text" name="adresse" placeholder='nouvelle adresse'/></td>
                </tr>
                <tr>
                    <% List<Ligne> lesLignes = gare.getLesLignes();%>
                    <td>Lignes</td><td><%for (Ligne l : lesLignes) {%><%=l.getNumLigne()%><br><%}%></td> <!--Liste des lignes liés à la gare-->
                    <td>Nouvelle lignes : *<br>
                        <%List<Ligne> touteslignes = listelignes;
                        for (Ligne l : touteslignes) {%>
                        <input type="checkbox" name="lignes" value="<%=l.getId()%>"/><%=l.getNumLigne()%><br> <!--Checkbox pour toutes les lignes dispos-->
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
                <input type="hidden" name="idgare" value="<%=gare.getId()%>"/>
                <input type="hidden" name="action" value="ModifierGare"/>
                <input type="submit" value="Enregistrer"/>
            </div>
        </form>
    </body>
</html>
