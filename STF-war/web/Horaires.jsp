<%-- 
    Document   : Horaires
    Created on : 9 mars 2016, 15:41:10
    Author     : 3092790
--%>

<%@page import="java.util.Collections"%>
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
            
            DateFormat heure = new SimpleDateFormat("HH:mm");
            List<Gare> lesGares=ligne.getLesGares();
            
        %>
        </p>
        <TABLE id="tableAffich">
            <tr id="trTitre">
                <th>Gare</th>
                <th>horaires</th>
                <th>Sélectionner</th>
            </tr>
            <%
                for(Gare g:lesGares){%>
                <tr id="trContenu">
                    <td Width=15%><%=g.getNomGare()%></td>
                    <td Width=75%><%for(Horaire h: g.GetHorairesParLigne(ligne)){%><%=heure.format(h.getDateHoraire())%> / <%}%></td>
                    <td><a href="Servlet_STF?gare=<%=g.getId()%>&ligne=<%=ligne.getId()%>&action=CreationHoraire"><button>Ajouter</button></a>
                        <a href="Servlet_STF?gare=<%=g.getId()%>&ligne=<%=ligne.getId()%>&action=SuppressionHoraire"><button> Supprimer</button></a></td>
                    
                </tr><%}%>
        </TABLE>
    </body>
    </body>
</html>
