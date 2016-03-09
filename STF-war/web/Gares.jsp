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
        <%@ include file="Navigation.jsp" %>
        <h1>Gares</h1>
        <br><br>
        <h2 align='center'>Liste des gares</h2>
        <p>
        <%
            String attribut=(String)request.getAttribute("message");
            out.println(attribut);
        %>
        </p>
        <TABLE>
            <tr>
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
                    <td align='center'> <a href="Servlet_STF?modif=<%=g.getId()%>&action=ModificationGare"><button>Modifier</button></a></td>
                    <td align='center'><a href="Servlet_STF?suppr=<%=g.getId()%>&action=SuppressionGare"><button> Supprimer</button></a></td>
                </tr><%}%>
        </TABLE>
        <a href="Servlet_STF?action=CreationGares">Ajouter une Gare</a>
    </body>
</html>
