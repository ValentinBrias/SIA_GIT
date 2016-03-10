<%-- 
    Document   : Horaires
    Created on : 9 mars 2016, 15:41:10
    Author     : 3092790
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="package_entite.Horaire"%>
<%@page import="package_entite.Ligne"%>
<%@page import="java.util.List"%>
<%@page import="package_entite.Gare"%>
<%@page import="package_entite.Gare"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="ligne" scope="request" class="Ligne"></jsp:useBean>
        <title>Horaires</title>
    </head>
    <body>
        <%@ include file="Navigation.jsp" %>
        <h1>Horaires</h1>
        <br><br>
        <p>
        <%
            String attribut=(String)request.getAttribute("message");
            out.println(attribut);
        %>
        </p>
        <TABLE>
            <tr>
                <th>Gare</th>
                <th>horaires</th>
            </tr>
            <%
                DateFormat heure = new SimpleDateFormat("HH:mm");
                List<Gare> lesGares=ligne.getLesGares();
                for(Gare g:lesGares){%>
                <tr>
                    <td Width=15%><%=g.getNomGare()%></td>
                    <td Width=15%><%for(Horaire h: g.getLesHoraires()){%><%=heure.format(h.getDateHoraire())%> / <%}%></td>
                    
                    <td align='center'> <a href="Servlet_STF?modif=<%=g.getId()%>&action=ModificationHoraire"><button>Modifier</button></a></td>
                    <td align='center'><a href="Servlet_STF?suppr=<%=g.getId()%>&action=SuppressionHoraire"><button> Supprimer</button></a></td>
                    
                </tr><%}%>
        </TABLE>
    </body>
    </body>
</html>
