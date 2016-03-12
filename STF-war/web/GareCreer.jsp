<%-- 
    Document   : GareCreer
    Created on : 8 mars 2016, 14:12:32
    Author     : 3092790
--%>

<%@page import="package_entite.Ligne"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="listelignes" scope="request" class="java.util.List"></jsp:useBean>
        <title>Gare</title>
    </head>
    <body>
        <%@ include file="Navigation.jsp" %>
        <h1 id="h1">Gares > Ajouter</h1>
        <form method="get" action="Servlet_STF">
            
                    <TABLE>
                        <tr>
                            <td Width=100px><label for="nom">Nom <span class="requis">*</span></label></td>
                            <td Width=200px><input type="text" name="nom" value="" size="50" maxlength="20" /></td>
                        </tr>
                        <tr>
                            <td Width=100px><label for="adresse">Adresse <span class="requis">*</span></label></td>
                            <td Width=200px><input type="text" name="adresse" value="" size="50" maxlength="20" /></td>
                        </tr>
                        <tr>
                            <td Width=100px><label for="ligne">Lignes <span class="requis">*</span></label></td>
                            <td Width=200px>
                        <!--Checkbox des lignes (plusieurs choix possibles)-->
                        <%
                            List<Ligne> lesLignes = listelignes;
                            for (Ligne li : lesLignes) {%>
                        <input type="checkbox" name="ligne" value="<%=li.getId()%>"/><%=li.getNumLigne()%><br>
                        
                        <%}%></td>
                        </tr>
                    </TABLE>

                <br/>

                <input type="hidden" name="action" value="GareAjouter">

                <input id="btn_gauche" type="submit" value="Valider"/>
                <input id="btn_gauche" type="reset" value="Remettre à zéro"/>
                <br/>
        </form>
    </body>
</html>
