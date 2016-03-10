<%-- 
    Document   : HoraireCreer
    Created on : 10 mars 2016, 11:49:44
    Author     : 3092790
--%>

<%@page import="package_entite.Gare"%>
<%@page import="java.util.List"%>
<%@page import="package_entite.Ligne"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="ligne" scope="request" class="Ligne"></jsp:useBean>
        <title>Nouvel horaire</title>
    </head>
    <body>
        <%@ include file="Navigation.jsp" %>
        <h1 id="h1">Horaire > Ajouter</h1>
        <br><br>
        <%Ligne l = ligne;%>
        <h2>Ligne n°<%l.getNumLigne();%></h2>
        <div class='text'>
            <%
                String attribut = (String) request.getAttribute("message");
                out.println(attribut);
            %>
            <br><br>
            <form method="get" action="Servlet_STF">
                Gare : <select name="gare">
                        <!--Liste déroulante des gares-->
                        <%
                            List<Gare> lesGares = l.getLesGares();
                            for (Gare g : lesGares) {%>
                <option value='<%=g.getId()%>'><%=g.getNomGare()%></option> 
                <%}%></select>
                Heure : <input type="Date" name="horaire">
                
        </div>
            <br>
            <br>
            <div class ="btn_gauche">
                <input type="hidden" name="action" value="AjouterHoraire">

                <input type="submit" value="Valider"/>
                <input type="reset" value="Remettre à zéro"/>
            </div>
        </form>
    </body>
</html>
