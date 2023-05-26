package ap.scrabble.game_client.view;

import java.util.Observable;
import java.util.Observer;

import ap.scrabble.game_client.view_model.ViewModel;
import javafx.event.ActionEvent;

public class MyView implements View, Observer {
	// Implement the View interface

	private ViewModel viewModel;

	public void init(ViewModel viewModel) {
		this.viewModel = viewModel;
		viewModel.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {}

    public void hostGame(ActionEvent actionEvent) {
    }

	public void joinGame(ActionEvent actionEvent) {
	}


}