/**
 * 
 */
package nl.tudelft.footballmanager.ui.controller;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import nl.tudelft.footballmanager.model.logic.GameEvent;

/**
 * @author Mathijs de Boer <czorio4@gmail.com>
 *
 */
public class DuringMatchViewController implements Initializable, Observer {
	
	@FXML private Label team1NameLabel;
	@FXML private Label team2NameLabel;
	@FXML private Label team1ScoreLabel;
	@FXML private Label team2ScoreLabel;
	
	@FXML private Label minuteLabel;
	@FXML private ProgressBar gameprogressionProgressBar;
	
	@FXML private TableView<GameEvent> GameEventsTableView;
	@FXML private TableColumn<GameEvent, Integer> GameMinCol;
	@FXML private TableColumn<GameEvent, String> PlayerSurnameCol;
	@FXML private TableColumn<GameEvent, String> CardCol;
	@FXML private TableColumn<GameEvent, String> InjuryCol;

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		
	}

	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

}
