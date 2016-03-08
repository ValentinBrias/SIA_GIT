<%-- 
    Document   : Lignes_Modifier
    Created on : 7 mars 2016, 16:56:18
    Author     : 3099709
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" />
        <title>Lignes</title>
    </head>
    <body>
        <ul id="navigation">
            <li><a href="MenuPrincipal.jsp">Page d'accueil</a></li>
            <li><a href="Lignes.jsp">Lignes</a></li>
            <li><a href="Gares.jsp">Gares</a></li>
            <li><a href="Abonnements.jsp">Abonnements</a></li>
        </ul>
        <br><br>
        <h1>Lignes > Modifier</h1>
        <br><br>
        <form method="get" action="Servlet_STF">
            <TABLE border ="1">
                <tr>
                    <td></td><td>Données actuelles</td><td>Nouvelles données</td>
                </tr>
                <tr>
                    <td>Désignation</td><td><%=Ligne.getDesignation()%></td><td><input type="text" name="designation" placeholder='nouveau nom'/></td>
                </tr>
                <tr>
                    <td>Prix</td><td><%=Ligne.getPrixUnitaire()%></td><td><input type="text" name="prix" placeholder='nouveau prix'/></td>
                </tr>
                <tr>
                    <td>Prix de location</td><td><%=Ligne.getPrixLocation()%></td><td><input type="text" name="prixloc" placeholder='nouveau prix de location'/></td>
                </tr>
                <tr>
                    <td>Prix de l'assurance</td><td><%=Ligne.getPrixAssurance()%></td><td><input type="text" name="prixassu" placeholder="nouveau prix d'assurance"/></td>
                </tr>
            </table>
            <br>
            <br>
            <div class ="lignesbtn">
                <input type="submit" value="Ajouter"/><input type="hidden" name="action" value="Enregistrer">
            </div>
        </form>
                
    </body>
    
</html>
