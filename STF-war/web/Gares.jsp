<%-- 
    Document   : Gares
    Created on : 7 mars 2016, 15:51:34
    Author     : 3099709
--%>

<%@page import="package_entite.Ligne"%>
<%@page import="package_entite.Gare"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="listegares" scope="request" class="java.util.List"></jsp:useBean>
        <title>Gares</title>
    </head>
    <body>
        
        <!-- Inclusion du menu par la jsp Navigation -->
        <%@ include file="Navigation.jsp" %>
        
        <h1 id="h1">Gares</h1>
        <div class ="text">
        <%
            String attribut=(String)request.getAttribute("message");
            out.println(attribut);
        %>
        </div>
        
        <TABLE id="tableAffich">
            <tr id="trTitre">
                <th>Id</th>
                <th>Nom</th>
                <th>Adresse</th>
                <th>Lignes</th>
                <th>Sélectionner</th>
            </tr>
            <%
                List<Gare> lesGares=listegares;
                for(Gare g:lesGares){%>
                <tr id="trContenu">
                    <td Width=15%><%=g.getId()%></td>
                    <td Width=15%><%=g.getNomGare()%></td>
                    <td Width=15%><%=g.getAdresse()%></td>
                    <td id="tdList" Width=15%><%for(Ligne l: g.getLesLignes()){%><%=l.getNumLigne()%> / <%}%></td>
                    <td Width=15%>
                        <a href="Servlet_STF?modif=<%=g.getId()%>&action=ModificationGare"><button class="btn_ModSup">Modifier</button></a>
                        <a href="Servlet_STF?suppr=<%=g.getId()%>&action=SuppressionGare"><button class="btn_ModSup">Supprimer</button></a>
                    </td>
                </tr><%}%>
        </TABLE>
        
        <!-- Bouton ajouter -->
        <a href="Servlet_STF?action=CreationGares"><button id="btn_gauche">Ajouter une gare</button></a>
        
    </body>
</html>
