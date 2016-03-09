/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package_Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import package_entite.Gare;
import package_entite.Horaire;
import package_entite.Ligne;
import package_session.SessionAdministrateurLocal;

/**
 *
 * @author 3099709
 */
@WebServlet(name = "Servlet_STF", urlPatterns = {"/Servlet_STF"})
public class Servlet_STF extends HttpServlet {
    @EJB
    private SessionAdministrateurLocal sessionAdministrateur;

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
            }    
            /* else if (act.equals("MenuAuthentifier")) {
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
                }
            */ 
            
            else if (act.equals("AfficherLignes")) {
                jspClient = "/Lignes.jsp";
                List<Ligne> list = sessionAdministrateur.RetournerLignes();
                request.setAttribute("listelignes", list);
                request.setAttribute("message", "");
            }
            else if (act.equals("RechercherLigne")) {
                jspClient = "/Lignes.jsp";
                doActionRechercherLigne(request, response);
            } 
            else if (act.equals("LigneRafraichir")) {
                jspClient = "/Lignes.jsp";
                List<Ligne> list = sessionAdministrateur.RetournerLignes();
                request.setAttribute("listelignes", list);
            } 
            else if (act.equals("AfficherGares")) {
                jspClient = "/Gares.jsp";
                List<Gare> list = sessionAdministrateur.RetournerGares();
                request.setAttribute("listegares", list);
                request.setAttribute("message", "Liste des gares");
            } else if (act.equals("CreationGares")) {
                jspClient = "/GareCreer.jsp";
                List<Ligne> list = sessionAdministrateur.RetournerLignes();
                request.setAttribute("listelignes", list);
            }
             else if (act.equals("GareAjouter")) {
                jspClient = "/Gares.jsp";
                doActionCreationGare(request, response);
            }
            else if (act.equals("ModificationGare")) {
                jspClient = "/GareModifier.jsp";
                doActionAfficherModifGare(request, response);
            }
            else if (act.equals("ModifierGare")) {
                jspClient = "/Gares.jsp";
                doActionModifierGare(request, response);
            }
            else if (act.equals("SuppressionGare")) {
                jspClient = "/Gares.jsp";
                doActionSupprimerGare(request, response);
            }
            else if (act.equals("LigneHoraire")) {
                jspClient = "/Horaires.jsp";
                doActionAfficherHoraires(request, response);
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
    
    protected void doActionCreationGare(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String adresse = request.getParameter("adresse");
        String ligne[] = request.getParameterValues("ligne");
        String message;

        if (nom.trim().isEmpty() || adresse.trim().isEmpty() || ligne==null) {
            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires.";
        } else {
            List <Ligne> listel = new ArrayList<Ligne>();
            for (String idl:ligne){
                Long idligne = Long.valueOf(idl);
                Ligne l = sessionAdministrateur.RechercherLigneParId(idligne);
                listel.add(l);
            }
            sessionAdministrateur.CreerGare(nom, adresse, listel);
            message = "La gare est créée avec succès !";
        }
        request.setAttribute("message", message);
        List<Gare> list = sessionAdministrateur.RetournerGares();
        request.setAttribute("listegares", list);
    }
    
	protected void doActionAfficherModifGare(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String gare = request.getParameter("modif"); //récupère l'id de la gare à modifier
        Long idgare = Long.valueOf(gare);
        Gare g = sessionAdministrateur.RechercherGareParId(idgare);
        request.setAttribute("gare", g); //envoie la gare à modifier à la JSP
        
        List<Ligne> listl = sessionAdministrateur.RetournerLignes();
        request.setAttribute("listelignes", listl); //envoie la liste de toutes les lignes à la JSP
    }
    
    protected void doActionModifierGare(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String id = request.getParameter("idgare");
        Long idgare = Long.valueOf(id);
        Gare g = sessionAdministrateur.RechercherGareParId(idgare);
        
        String nom = request.getParameter("nom");
        String adresse = request.getParameter("adresse");
        String ligne[] = request.getParameterValues("lignes");
        List <Ligne> list = new ArrayList<Ligne>();
        
        if (nom.trim().isEmpty()){
            nom = g.getNomGare();
        }
        if (adresse.trim().isEmpty()){
            adresse = g.getAdresse();
        }
        
        if (ligne==null){
            list = g.getLesLignes();
        } else {
            for (String idl:ligne){
                Long idligne = Long.valueOf(idl);
                Ligne l = sessionAdministrateur.RechercherLigneParId(idligne);
                list.add(l);
            }
        }
        
        sessionAdministrateur.ModifierGare(idgare, nom, adresse, list);

        String message = "<div class='msg_success'>Gare modifiée avec succès !</div>";
        request.setAttribute("message", message);

        List<Gare> listg = sessionAdministrateur.RetournerGares();
        request.setAttribute("listegares", listg);
    }
    
    protected void doActionSupprimerGare(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message;
        String id = request.getParameter("suppr");
        
        Long idgare = Long.valueOf(id);
        sessionAdministrateur.SupprimerGare(idgare);
        message = "<div class='msg_success'><font color='green'>Gare supprimée avec succès!</div>";

        request.setAttribute("message", message);
        List<Gare> list = sessionAdministrateur.RetournerGares();
        request.setAttribute("listegares", list);
    }
	
    protected void doActionRechercherLigne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numLigne = request.getParameter("NumLigne"); //dans ligne on récupère un numéro de ligne 
        String message;
        List<Ligne> liste = new ArrayList<Ligne>();
        if (numLigne.trim().isEmpty()) {
            message = "<div class='msg_error'>Erreur - Vous devez saisir un numéro de ligne.</div>";
            liste = sessionAdministrateur.RetournerLignes();
        } else {
            int num = Integer.parseInt(numLigne);
            Ligne l = sessionAdministrateur.RechercherLigneParNum(num);
            liste.add(l);
            message = "";
          }      
        request.setAttribute("message", message);
        request.setAttribute("listelignes", liste);
    } 
    
    protected void doActionAfficherHoraires(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("IdLigne");
        Long idligne = Long.valueOf(id); 
        Ligne ligne = sessionAdministrateur.RechercherLigneParId(idligne);
        String message = "Liste des horaires pour la ligne n°"+ligne.getNumLigne();
        request.setAttribute("message", message);
        request.setAttribute("ligne", ligne);
    }
    
}
