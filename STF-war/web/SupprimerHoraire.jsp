<%-- 
    Document   : SupprimerHoraire
    Created on : 11 mars 2016, 16:14:04
    Author     : 3092790
--%>

<%@page import="package_entite.Horaire"%>
<%@page import="package_entite.Gare"%>
<%@page import="package_entite.Ligne"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="ligne" scope="request" class="Ligne"></jsp:useBean>
        <jsp:useBean id="gare" scope="request" class="Gare"></jsp:useBean>
        <title>Supprimer Horaire</title>
    </head>
    <body>
        <%@ include file="Navigation.jsp" %>
        <h1 id="h1">Horaire > Ajouter</h1>
        <br><br>
        <div class='text'>
            <%
                String attribut = (String) request.getAttribute("message");
                out.println(attribut);
            %>
            <br><br>
            <form method="get" action="Servlet_STF">
                Horaire à supprimer : <br>
                <%for(Horaire h:gare.GetHorairesParLigne(ligne)){%>
                    <input type="checkbox" name="suppr" value="<%=h.getId()%>"/><%=h.getDateHoraire()%><br>
                <%}%>
        </div>
            <br>
            <div class ="btn_gauche">
                <input type="hidden" name="action" value="SupprimerHoraire">
                <input type="hidden" name="ligne" value="<%=ligne.getId()%>">

                <input type="submit" value="Supprimer"/>
            </div>
        </form>
    </body>
</html>
