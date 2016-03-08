<%-- 
    Document   : Gares
    Created on : 7 mars 2016, 15:51:34
    Author     : 3099709
--%>

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
        <ul>
            <li><a href="MenuPrincipal.jsp">Page d'accueil</a></li>
            <li><a href="Lignes.jsp">Lignes</a></li>
            <li><a href="Gares.jsp">Gares</a></li>
            <li><a href="Abonnements.jsp">Abonnements</a></li>
        </ul>
        <br><br>
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
            </tr>
            <%
                List<Gare> lesGares=listegares;
                for(Gare g:lesGares){%>
                <tr>
                    <td Width=15%><%=g.getId()%></td>
                    <td Width=15%><%=g.getNomGare()%></td>
                    <td Width=15%><%=g.getAdresse()%></td>
                </tr><%}%>
        </TABLE>
        <a href="/GareCreer.jsp"Creer Gare</a>
    </body>
</html>
