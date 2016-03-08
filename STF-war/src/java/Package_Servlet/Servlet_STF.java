/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package_Servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 3099709
 */
@WebServlet(name = "Servlet_STF", urlPatterns = {"/Servlet_STF"})
public class Servlet_STF extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          
            
            String jspClient = null;
            String act = request.getParameter("action");
            if ((act == null) || (act.equals("null"))) {
                jspClient = "/MenuPrincipal.jsp";
                //jspClient = "/Authentification.jsp";
            } else if (act.equals("LigneAjouter")) {
                jspClient = "/MenuPrincipal.jsp";
                //request.setAttribute("message", "");
            }
            else if (act.equals("MenuPrincipal")) {
                jspClient = "/MenuPrincipal.jsp";
                //request.setAttribute("message", "");
            /*} else if (act.equals("MenuAuthentifier")) {
                int i;
                i = doActionAuthentifier(request, response);
                if (i == 1) {
                    jspClient = "/MenuCouturier.jsp";
                } else if (i == 2) {
                    jspClient = "/MenuMannequin.jsp";
                } else if (i == 3) {
                    jspClient = "/MenuOrganisateur.jsp";
                } else if (i == 4) {
                    jspClient = "/Authentifier.jsp";
                }*/
            } 
            
            RequestDispatcher Rd;
            Rd = getServletContext().getRequestDispatcher(jspClient);
            Rd.forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
/*
    protected int doActionAuthentifier(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String message;
        int i = 0;

        HttpSession session = request.getSession();
        
        if (login.trim().isEmpty() || password.trim().isEmpty()) {
                message = "<font color='red'>Erreur - Vous n'avez pas rempli tous les champs obligatoires.</font>";
                request.setAttribute("message", message);
                i=4;
        } else {
            Personne p = null;
            p = sessionPersonne.AuthentifierPersonne(login, password);
            if (p == null) { //AuthentifierPersonne retourne null si la recherche de login/mdp ne donne aucun résultat
                Organisateur o = null; //Un organisateur n'est pas une personne: pas d'héritage. 2 méthodes d'authentifiation différentes
                o = sessionPersonne.AuthentifierOrganisateur(login, password); 

                if (p==null && o==null){
                    message = "<font color='red'>Erreur - Login ou mot de passe incorrect</font>";
                    request.setAttribute("message", message);
                    i=4; //si i==4, jsp = /Authentifier.jsp
                } else if(o!=null){
                    i = 3; //si i==3, jsp = /MenuOrgansiateur.jsp
                    session.setAttribute("utilisateur", o);
                }

            } else if (p instanceof Couturier) {
                i = 1; //si i==1, jsp = /MenuCouturier.jsp
                session.setAttribute("utilisateur", p);
            } else if (p instanceof Mannequin) {
                i = 2; //si i==2, jsp = /MenuMannequin.jsp
                session.setAttribute("utilisateur", p);
            }
        } 
        return i;
    }*/
}
