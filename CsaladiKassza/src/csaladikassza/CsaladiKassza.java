/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csaladikassza;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Tanulo
 */
public class CsaladiKassza extends Application {
    int ablak_magassag=300;
    int ablak_szelesseg=250;
    String nev_datum = "Bebesi András @2017";
   
    @Override
    public void start(Stage ablak) {
         // -------------- ELEMEK ---------------------      
        Label keszitok_cimke= new Label(nev_datum);
        MenuBar menu = new MenuBar();
        Menu file_menu = new Menu("Fájl");
        // --------------------  Layoutok -------------------
        BorderPane befoglalo_layout = new BorderPane();
        VBox baloldal = new VBox();
        VBox jobboldal = new VBox();
        
        // --------------------- Layoutok Felépítés --------------
        befoglalo_layout.setLeft(baloldal);
        befoglalo_layout.setRight(jobboldal);
        
        //------------------------ELEMEK HOZZAADASA A LAYOUTOKHOZ ----------------
        befoglalo_layout.setBottom(keszitok_cimke);
        // -----------------------Színpad felépítése ---------------------
        Scene szinpad = new Scene(befoglalo_layout, ablak_szelesseg, ablak_magassag);
        // -----------------------Színpad hozzáadása az ablakhoz ---------------
        ablak.setTitle("Családi kassza!"); //ablak címe
        ablak.setScene(szinpad);     
        ablak.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args); //ez hívja be a start metódust
    }
    
}
