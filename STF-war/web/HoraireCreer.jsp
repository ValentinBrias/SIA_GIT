<%-- 
    Document   : HoraireCreer
    Created on : 11 mars 2016, 14:16:25
    Author     : 3092790
--%>

<%@page import="package_entite.Gare"%>
<%@page import="package_entite.Ligne"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="ligne" scope="request" class="Ligne"></jsp:useBean>
        <jsp:useBean id="gare" scope="request" class="Gare"></jsp:useBean>
        <title>Nouvel Horaire</title>
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
                Nouvel horaire : <input type="date" name="horaire" placeholder="yyyy-MM-dd HH:mm" />
        </div>
            <br>
            <br>
            <div class ="btn_gauche">
                <input type="hidden" name="action" value="AjouterHoraire">
                <input type="hidden" name="ligne" value="<%=ligne.getId()%>">
                <input type="hidden" name="gare" value="<%=gare.getId()%>">
                <input type="submit" value="Valider"/>
                <input type="reset" value="Remettre à zéro"/>
            </div>
        </form>
    </body>
</html>
