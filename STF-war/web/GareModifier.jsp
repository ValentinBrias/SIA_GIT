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
        
        <h1 id="h1">Gares > Modifier</h1>
        <div class="msg_info">
            * Si aucune gare n'est sélectionnée, les gares ne seront pas modifiés.<br>
            Si au moins 1 gare est sélectionnée, les anciennes gares seront remplacées.
        </div>
        <form method="get" action="Servlet_STF">
            <TABLE id="tableModif">
                <tr id="trTitre">
                    <th></th>
                    <th>Données actuelles</th>
                    <th>Nouvelles données</th>
                </tr>
                <tr class="trModif">
                    <td>Nom</td><td><%=gare.getNomGare()%></td>
                    <td><input type="text" name="nom" placeholder='nouveau nom'/></td>
                </tr>
                <tr class="trModif">
                    <td>Adresse</td>
                    <td><%=gare.getAdresse()%></td><td><input type="text" name="adresse" placeholder='nouvelle adresse'/></td>
                </tr>
                <tr class="trModif">
                    <% List<Ligne> lesLignes = gare.getLesLignes();%>
                    <td>Lignes</td>
                    <td id="tdList"><%for (Ligne l : lesLignes) {%><%=l.getNumLigne()%><br><%}%></td> <!--Liste des lignes liés à la gare-->
                    <td id="tdList">Nouvelle lignes : *<br>
                        <%List<Ligne> touteslignes = listelignes;
                        for (Ligne l : touteslignes) {%>
                        <input type="checkbox" name="lignes" value="<%=l.getId()%>"/><%=l.getNumLigne()%><br> <!--Checkbox pour toutes les lignes dispos-->
                        <%}%>
                    </td>
                </tr>
            </TABLE>
            
            <!-- Bouton Enregistrer -->
                <input type="hidden" name="idgare" value="<%=gare.getId()%>"/>
                <input type="hidden" name="action" value="ModifierGare"/>
                <input id="btn_enregistrer" type="submit" value="Enregistrer"/>
        </form>
    </body>
</html>
