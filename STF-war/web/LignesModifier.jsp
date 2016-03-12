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
        <jsp:useBean id="ligne" scope="request" class="Ligne"></jsp:useBean>
        <title>Lignes</title>
    </head>
    <body>
        <%@ include file="Navigation.jsp" %>
        <h1 id="h1">Lignes > Modifier</h1>
        <div class="msg_info">
            * Si aucune ligne n'est sélectionnée, les lignes ne seront pas modifiés.<br>
            Si au moins 1 ligne est sélectionnée, les anciennes lignes seront remplacées.
        </div>
        <form method="get" action="Servlet_STF">
            <TABLE id="tableModif">
                <tr id="trTitre">
                    <th></th>
                    <th>Données actuelles</th>
                    <th>Nouvelles données</th>
                </tr>
                <tr class="trModif">
                    <td>Numéro</td><td><%=ligne.getNumLigne()%></td><td><input type="text" name="NumLigne" placeholder='nouveau numéro'/></td>
                </tr>
                <tr class="trModif">
                    <td>Gare départ</td><td><%=ligne.getGareDepart().getNomGare()%></td>
                    <td><select name="GareDepart">
                            <!--Liste déroulante des gares-->
                            <%
                                List<Gare> lesGares = listegares;
                                for (Gare g : lesGares) {%>
                            <option value='<%=g.getId()%>'><%=g.getNomGare()%></option> 
                            <%}%></select></td>
                </tr>
                <tr class="trModif">
                    <td>Gare arrivée</td><td><%=ligne.getGareArrivee().getNomGare()%></td>
                    <td><select name="GareArrivee">
                            <!--Liste déroulante des gares-->
                            <%
                            for (Gare g : lesGares) {%>
                            <option value='<%=g.getId()%>'><%=g.getNomGare()%></option> 
                            <%}%></select></td>
                </tr>
                <tr class="trModif"><!--Liste des gares liés à la ligne-->
                    <% List<Gare> lesG = ligne.getLesGares();%>
                    <td>Gares</td>
                    <td id="tdList"><%for (Gare g : lesG) {%><%=g.getNomGare()%><br><%}%></td> 
                    <td id="tdList">Nouvelle lignes : *<br>
                        <%List<Gare> toutesgares = listegares;
                        for (Gare g : toutesgares) {%>
                        <!--Checkbox pour toutes les gares dispos-->
                        <input type="checkbox" name="gares" value="<%=g.getId()%>"/><%=g.getNomGare()%><br> 
                        <%}%>
                        </td>
                </tr>
            </TABLE>
            
            <!-- Bouton Enregistrer -->
                <input type="hidden" name="idligne" value="<%=ligne.getId()%>"/>
                <input type="hidden" name="action" value="ModifierLigne"/>
                <input id="btn_enregistrer" type="submit" value="Enregistrer"/>
        </form>
                
    </body>
    
</html>
