<%-- 
    Document   : LignesAjouter
    Created on : 8 mars 2016, 14:17:14
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
        <title>Ligne</title>
    </head>
    <body>   
        <%@ include file="Navigation.jsp" %>
        <h1 id="h1">Lignes > Ajouter</h1>
        <br><br>
        <div class='lignestext'>
            <form method="get" action="Servlet_STF">
                N° de ligne : <input type="text" value="NumLigne" placeholder="Numéro de ligne" />
                Départ : <select name="GareDepart"/>
                        <!--Liste déroulante des gares-->
                        <%
                            List<Gare> lesGares = listegares;
                            for (Gare g : lesGares) {%>
                <option value='<%=g.getNomGare()%>'></option> 
                <%}%></select>
                Arrivée : <select name="GareArrivee"/>
                        <!--Liste déroulante des gares-->
                        <%
                            for (Gare g : lesGares) {%>
                <option value='<%=g.getNomGare()%>'></option> 
                <%}%></select>
            </form>
        </div>
            <br>
            <br>
            <div class ="lignesbtn">
                <input type="submit" value="AjouterLigne"/><input type="hidden" name="action" value="Enregistrer">
            </div>
        </form>
    </body>
</html>
