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
        <br><br>
        <div class ="text">
        <%
            String attribut=(String)request.getAttribute("message");
            out.println(attribut);
        %>
        </div>
        
        <br><br>
        
        
        <TABLE id="allTable">
            <tr id="allTr">
                <th>Id</th>
                <th>Nom</th>
                <th>Adresse</th>
                <th>Lignes</th>
            </tr>
            <%
                List<Gare> lesGares=listegares;
                for(Gare g:lesGares){%>
                <tr>
                    <td Width=15%><%=g.getId()%></td>
                    <td Width=15%><%=g.getNomGare()%></td>
                    <td Width=15%><%=g.getAdresse()%></td>
                    <td Width=15%><%for(Ligne l: g.getLesLignes()){%><%=l.getNumLigne()%> / <%}%></td>
                    <td id="ligneTDModifier" Width=10%>
                        <a href="Servlet_STF?modif=<%=g.getId()%>&action=ModificationGare"><button>Modifier</button></a>
                    </td>
                    <td id="ligneTDModifier" Width=10%>
                        <a href="Servlet_STF?suppr=<%=g.getId()%>&action=SuppressionGare"><button> Supprimer</button></a>
                    </td>
                </tr><%}%>
        </TABLE>
        
        <!-- Bouton ajouter -->
        <div class ="btn_gauche">
            <a href="Servlet_STF?action=CreationGares"><button>Ajouter</button></a>
        </div>
    </body>
</html>
